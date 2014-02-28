package gr.kzps;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import gr.opap.draws.ws.query.DrawQueriesServiceImplService;
import gr.opap.draws.ws.query.DrawQueriesServiceSEI;
import gr.opap.draws.ws.query.GameDraw;

public class QueryService {
	private DrawQueriesServiceImplService service;
	private DrawQueriesServiceSEI implPort;
	private GameDraw draw;
	private List<GameDraw> draws;

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
	
	@SuppressWarnings("unused")
	private GameDraw fetchPropoGoalLatestDraw() {
		draw = implPort.fetchPropoGoalLatestDraw();

		return draw;
	}

	@SuppressWarnings("unused")
	private GameDraw fetchPowerSpinLatestDraw() {
		draw = implPort.fetchPowerSpinLatestDraw();

		return draw;
	}

	@SuppressWarnings("unused")
	private GameDraw fetchBowlingLatestDraw() {
		draw = implPort.fetchBowlingLatestDraw();

		return draw;
	}

	@SuppressWarnings("unused")
	private GameDraw fetchPenaltiesLatestDraw() {
		draw = implPort.fetchPenaltiesLatestDraw();

		return draw;
	}
	
	public List<GameDraw> fetchKinoByDate(XMLGregorianCalendar date) {
		draws = implPort.fetchKinoDrawsByDate(date);
		
		return draws;
	}
	
	public List<GameDraw> fetchLottoByDate(XMLGregorianCalendar date) {
		draws = implPort.fetchLottoDrawsByDate(date);

		return draws;
	}
	
	public List<GameDraw> fetchJokerByDate(XMLGregorianCalendar date) {
		draws = implPort.fetchJokerDrawsByDate(date);
				
		return draws;
	}
	
	public List<GameDraw> fetchProtoByDate(XMLGregorianCalendar date) {
		draws = implPort.fetchProtoDrawsByDate(date);
				
		return draws;
	}
	
	public List<GameDraw> fetchSuper3ByDate(XMLGregorianCalendar date) {
		draws = implPort.fetchSuper3DrawsByDate(date);
				
		return draws;
	}
	
	public List<GameDraw> fetchExtra5ByDate(XMLGregorianCalendar date) {
		draws = implPort.fetchExtra5DrawsByDate(date);
				
		return draws;
	}
}
