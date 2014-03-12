/*
 	Copyright (C) 2014
 	Antonis Kouzoupis <kouzoupis.ant@gmail.com>
 	
 	This file is part of OpapDraws.

    OpapDraws is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    OpapDraws is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with OpapDraws.  If not, see <http://www.gnu.org/licenses/>.
 */
package gr.kzps;

import gr.opap.draws.ws.query.GameDraw;

import java.util.ArrayList;
import java.util.List;

/**
 * OPAP web service responds either with GameDraw object or with list of
 * GameDraw. MessageWrapper class creates a single message format.
 * 
 * @author Antonis Kouzoupis
 */
public class MessageWrapper {
	/**
	 * Name of the game.
	 * 
	 * @see Constants
	 */
	private String gameId;
	private List<GameDraw> gameDraws;

	public MessageWrapper() {
		super();
	}

	/**
	 * Get the game name.
	 * 
	 * @return The game name
	 * @see Constants
	 */
	public String getGameId() {
		return gameId;
	}

	/**
	 * Set the game name.
	 * 
	 * @param gameId
	 *            The game name
	 * @see Constants
	 */
	public void setGameId(final String gameId) {
		this.gameId = gameId;
	}

	/**
	 * Get the list of GameDraw.
	 * 
	 * @return The list of GameDraw
	 * @see GameDraw
	 */
	public List<GameDraw> getGameDraws() {
		return gameDraws;
	}

	/**
	 * Set the list of GameDraw.
	 * 
	 * @param gameDraws
	 *            The list of GameDraw
	 * @see GameDraw
	 */
	public void setGameDraws(final List<GameDraw> gameDraws) {
		this.gameDraws = gameDraws;
	}

	/**
	 * Creates a unified message from a single GameDraw object.
	 * 
	 * @param gameDraw
	 *            Single draw result
	 * @param gameId
	 *            Game name
	 * @return The unified message
	 * @see GameDraw
	 * @see Constants
	 * @see ArrayList
	 */
	public MessageWrapper createMessageWrapper(final GameDraw gameDraw,
			final String gameId) {
		MessageWrapper messageWrapper = new MessageWrapper();
		gameDraws = new ArrayList<GameDraw>();
		this.gameId = gameId;
		if (gameDraw != null) {
			gameDraws.add(gameDraw);
		}

		return messageWrapper;
	}

	/**
	 * Creates a unified message from a list of GameDraw objects.
	 * 
	 * @param gameDraws
	 *            List of more than once draw results
	 * @param gameId
	 *            Game name
	 * @return The unified message
	 * @see GameDraw
	 * @see Constants
	 */
	public MessageWrapper createMessageWrapper(final List<GameDraw> gameDraws,
			final String gameId) {
		MessageWrapper messageWrapper = new MessageWrapper();
		this.gameId = gameId;
		this.gameDraws = gameDraws;

		return messageWrapper;
	}
}
