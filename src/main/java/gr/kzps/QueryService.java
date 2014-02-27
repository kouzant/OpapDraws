package gr.kzps;

import gr.opap.draws.ws.query.DrawQueriesServiceImplService;
import gr.opap.draws.ws.query.DrawQueriesServiceSEI;
import gr.opap.draws.ws.query.GameDraw;

public class QueryService {
	private DrawQueriesServiceImplService service;
	private DrawQueriesServiceSEI implPort;
	private GameDraw draw;

	public QueryService() {
		service = new DrawQueriesServiceImplService();
		implPort = service.getDrawQueriesServiceImplPort();
	}

	public GameDraw getGameDraw() {
		return draw;
	}
	
	public void setGameDraw(GameDraw draw) {
		this.draw = draw;
	}
	
	public GameDraw fetchKinoLatestDraw() {
		draw = implPort.fetchKinoLatestDraw();

		return draw;
	}

	public GameDraw fetchLottoLatestDraw() {
		draw = implPort.fetchJokerLatestDraw();

		return draw;
	}

	public GameDraw fetchJokerLatestDraw() {
		draw = implPort.fetchJokerLatestDraw();

		return draw;
	}

	public GameDraw fetchProtoLatestDraw() {
		draw = implPort.fetchProtoLatestDraw();

		return draw;
	}

	public GameDraw fetchSuper3LatestDraw() {
		draw = implPort.fetchSuper3LatestDraw();

		return draw;
	}

	public GameDraw fetchExtra5LatestDraw() {
		draw = implPort.fetchExtra5LatestDraw();

		return draw;
	}

	public GameDraw fetchPropoGoalLatestDraw() {
		draw = implPort.fetchPropoGoalLatestDraw();

		return draw;
	}

	public GameDraw fetchPowerSpinLatestDraw() {
		draw = implPort.fetchPowerSpinLatestDraw();

		return draw;
	}

	public GameDraw fetchBowlingLatestDraw() {
		draw = implPort.fetchBowlingLatestDraw();

		return draw;
	}

	public GameDraw fetchPenaltiesLatestDraw() {
		draw = implPort.fetchPenaltiesLatestDraw();

		return draw;
	}
}
