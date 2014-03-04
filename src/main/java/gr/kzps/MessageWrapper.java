package gr.kzps;

import gr.opap.draws.ws.query.GameDraw;

import java.util.ArrayList;
import java.util.List;

public class MessageWrapper {
	private String gameId;
	private List<GameDraw> gameDraws;

	public MessageWrapper() {
		super();
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public List<GameDraw> getGameDraws() {
		return gameDraws;
	}

	public void setGameDraws(List<GameDraw> gameDraws) {
		this.gameDraws = gameDraws;
	}

	public MessageWrapper createMessageWrapper(GameDraw gameDraw, String gameId) {
		MessageWrapper messageWrapper = new MessageWrapper();
		gameDraws = new ArrayList<GameDraw>();
		this.gameId = gameId;
		if (gameDraw != null)
			gameDraws.add(gameDraw);

		return messageWrapper;
	}

	public MessageWrapper createMessageWrapper(List<GameDraw> gameDraws,
			String gameId) {
		MessageWrapper messageWrapper = new MessageWrapper();
		this.gameId = gameId;
		this.gameDraws = gameDraws;

		return messageWrapper;
	}
}
