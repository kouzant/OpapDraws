package gr.kzps;

import gr.opap.draws.ws.query.GameDraw;

import java.util.ArrayList;
import java.util.List;

public class MessageWrapper {
	private int gameId;
	private List<GameDraw> gameDraws;

	public MessageWrapper() {
		super();
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public List<GameDraw> getGameDraws() {
		return gameDraws;
	}

	public void setGameDraws(List<GameDraw> gameDraws) {
		this.gameDraws = gameDraws;
	}

	public MessageWrapper createMessageWrapper(GameDraw gameDraw, int gameId) {
		MessageWrapper messageWrapper = new MessageWrapper();
		gameDraws = new ArrayList<GameDraw>();
		this.gameId = gameId;
		if (gameDraw != null)
			gameDraws.add(gameDraw);

		return messageWrapper;
	}

	public MessageWrapper createMessageWrapper(List<GameDraw> gameDraws,
			int gameId) {
		MessageWrapper messageWrapper = new MessageWrapper();
		this.gameId = gameId;
		this.gameDraws = gameDraws;

		return messageWrapper;
	}
}
