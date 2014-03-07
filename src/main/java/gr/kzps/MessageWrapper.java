package gr.kzps;

import gr.kzps.util.Constants;
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
	 * Name of the game
	 * @see Constants
	 */
	private String gameId;
	private List<GameDraw> gameDraws;

	public MessageWrapper() {
		super();
	}

	/**
	 * Get the game name.
	 * @return The game name
	 * @see Constants
	 */
	public String getGameId() {
		return gameId;
	}

	/**
	 * Set the game name.
	 * @param gameId The game name
	 * @see Constants
	 */
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	/**
	 * Get the list of GameDraw
	 * @return The list of GameDraw
	 * @see GameDraw
	 */
	public List<GameDraw> getGameDraws() {
		return gameDraws;
	}

	/**
	 * Set the list of GameDraw
	 * @param gameDraws The list of GameDraw
	 * @see GameDraw
	 */
	public void setGameDraws(List<GameDraw> gameDraws) {
		this.gameDraws = gameDraws;
	}

	/**
	 * Creates a unified message from a single GameDraw object.
	 * @param gameDraw Single draw result
	 * @param gameId Game name
	 * @return The unified message
	 * @see GameDraw
	 * @see Constants
	 * @see ArrayList
	 */
	public MessageWrapper createMessageWrapper(GameDraw gameDraw, String gameId) {
		MessageWrapper messageWrapper = new MessageWrapper();
		gameDraws = new ArrayList<GameDraw>();
		this.gameId = gameId;
		if (gameDraw != null)
			gameDraws.add(gameDraw);

		return messageWrapper;
	}

	/**
	 * Creates a unified message from a list of GameDraw objects
	 * @param gameDraws List of more than once draw results
	 * @param gameId Game name
	 * @return The unified message
	 * @see GameDraw
	 * @see Constants
	 */
	public MessageWrapper createMessageWrapper(List<GameDraw> gameDraws,
			String gameId) {
		MessageWrapper messageWrapper = new MessageWrapper();
		this.gameId = gameId;
		this.gameDraws = gameDraws;

		return messageWrapper;
	}
}
