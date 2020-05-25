/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

import ClayButton from '@clayui/button';
import ClayIcon from '@clayui/icon';
import classNames from 'classnames';
import {useIsMounted} from 'frontend-js-react-web';
import PropTypes from 'prop-types';
import React, {useCallback, useReducer, useState} from 'react';

import AnimatedCounter from './AnimatedCounter';

const PRESSED_DOWN = 'DOWN';
const PRESSED_UP = 'UP';
const SCORE_DOWN = 0;
const SCORE_UNVOTE = -1;
const SCORE_UP = 1;

const VOTE_DOWN = 'VOTE_DOWN';
const VOTE_UP = 'VOTE_UP';
const UPDATE_VOTES = 'VOTES_UPDATE';

function reducer(state, action) {
	switch (action.type) {
		case VOTE_UP:
			return {
				negativeVotes:
					state.pressed !== PRESSED_DOWN
						? state.negativeVotes
						: state.negativeVotes - 1,
				positiveVotes:
					state.pressed === PRESSED_UP
						? state.positiveVotes - 1
						: state.positiveVotes + 1,
				pressed: state.pressed !== PRESSED_UP ? PRESSED_UP : null,
			};
		case VOTE_DOWN:
			return {
				negativeVotes:
					state.pressed !== PRESSED_DOWN
						? state.negativeVotes + 1
						: state.negativeVotes - 1,
				positiveVotes:
					state.pressed !== PRESSED_UP
						? state.positiveVotes
						: state.positiveVotes - 1,
				pressed: state.pressed !== PRESSED_DOWN ? PRESSED_DOWN : null,
			};
		case UPDATE_VOTES:
			return {
				...state,
				negativeVotes: action.payload.negativeVotes,
				positiveVotes: action.payload.positiveVotes,
			};
		default:
			return state;
	}
}

const RatingsThumbs = ({
	disabled = true,
	initialNegativeVotes = 0,
	initialPositiveVotes = 0,
	inititalTitle,
	sendVoteRequest,
	thumbDown = false,
	thumbUp = false,
}) => {
	const [state, dispatch] = useReducer(reducer, {
		negativeVotes: initialNegativeVotes,
		positiveVotes: initialPositiveVotes,
		pressed: thumbDown ? PRESSED_DOWN : thumbUp ? PRESSED_UP : null,
	});
	const isMounted = useIsMounted();

	const {negativeVotes, positiveVotes, pressed} = state;
	const [buttonUpAnimation, setButtonUpAnimation] = useState(false);
	const [buttonDownAnimation, setButtonDownAnimation] = useState(false);

	const voteUp = useCallback(() => {
		dispatch({type: VOTE_UP});
		setButtonUpAnimation(true);

		const score = pressed !== PRESSED_UP ? SCORE_UP : SCORE_UNVOTE;
		handleSendVoteRequest(score);
	}, [handleSendVoteRequest, pressed]);

	const voteDown = useCallback(() => {
		dispatch({type: VOTE_DOWN});
		setButtonDownAnimation(true);

		const score = pressed !== PRESSED_DOWN ? SCORE_DOWN : SCORE_UNVOTE;
		handleSendVoteRequest(score);
	}, [handleSendVoteRequest, pressed]);

	const getTitleThumbsUp = useCallback(() => {
		if (inititalTitle !== undefined) {
			return inititalTitle;
		}

		if (pressed === PRESSED_UP) {
			return Liferay.Language.get('you-have-rated-this-as-good');
		}
		else {
			return Liferay.Language.get('rate-this-as-good');
		}
	}, [inititalTitle, pressed]);

	const getTitleThumbsDown = useCallback(() => {
		if (inititalTitle !== undefined) {
			return inititalTitle;
		}

		if (pressed === PRESSED_DOWN) {
			return Liferay.Language.get('you-have-rated-this-as-bad');
		}
		else {
			return Liferay.Language.get('rate-this-as-bad');
		}
	}, [inititalTitle, pressed]);

	const handleSendVoteRequest = useCallback(
		(score) => {
			sendVoteRequest(score).then(({totalEntries, totalScore} = {}) => {
				if (isMounted() && totalEntries && totalScore) {
					const positiveVotes = Math.round(totalScore);

					dispatch({
						payload: {
							negativeVotes: totalEntries - positiveVotes,
							positiveVotes,
						},
						type: UPDATE_VOTES,
					});
				}
			});
		},
		[isMounted, sendVoteRequest]
	);

	return (
		<div className="ratings ratings-thumbs">
			<ClayButton
				aria-pressed={pressed === PRESSED_UP}
				borderless
				className={classNames('btn-thumbs-up', {
					'btn-animation': buttonUpAnimation,
				})}
				disabled={disabled}
				displayType="secondary"
				onClick={voteUp}
				small
				title={getTitleThumbsUp()}
				value={positiveVotes}
			>
				<span className="inline-item inline-item-before">
					<span className="off">
						<ClayIcon symbol="thumbs-up" />
					</span>
					<span className="on">
						<ClayIcon symbol="thumbs-up-full" />
					</span>
				</span>
				<AnimatedCounter counter={positiveVotes} />
			</ClayButton>
			<ClayButton
				aria-pressed={pressed === PRESSED_DOWN}
				borderless
				className={classNames('btn-thumbs-down', {
					'btn-animation': buttonDownAnimation,
				})}
				disabled={disabled}
				displayType="secondary"
				onClick={voteDown}
				small
				title={getTitleThumbsDown()}
				value={negativeVotes}
			>
				<span className="inline-item inline-item-before">
					<span className="off">
						<ClayIcon symbol="thumbs-down" />
					</span>
					<span className="on">
						<ClayIcon symbol="thumbs-down-full" />
					</span>
				</span>
				<AnimatedCounter counter={negativeVotes} />
			</ClayButton>
		</div>
	);
};

RatingsThumbs.propTypes = {
	disabled: PropTypes.bool,
	initialNegativeVotes: PropTypes.number,
	initialPositiveVotes: PropTypes.number,
	inititalTitle: PropTypes.string,
	positiveVotes: PropTypes.number,
	sendVoteRequest: PropTypes.func.isRequired,
	thumbDown: PropTypes.bool,
	thumbUp: PropTypes.bool,
};

export default function (props) {
	return <RatingsThumbs {...props} />;
}
