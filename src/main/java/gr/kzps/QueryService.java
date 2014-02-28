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
	private MessageWrapper messageWrapper;

	public QueryService() {
		service = new DrawQueriesServiceImplService();
		implPort = service.getDrawQueriesServiceImplPort();
	}

	public MessageWrapper fetchKinoLatestDraw(int gameId) {
		draw = implPort.fetchKinoLatestDraw();
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, gameId);

		return messageWrapper;
	}

	public MessageWrapper fetchLottoLatestDraw(int gameId) {
		draw = implPort.fetchLottoLatestDraw();
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, gameId);

		return messageWrapper;
	}

	public MessageWrapper fetchJokerLatestDraw(int gameId) {
		draw = implPort.fetchJokerLatestDraw();
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, gameId);

		return messageWrapper;
	}

	public MessageWrapper fetchProtoLatestDraw(int gameId) {
		draw = implPort.fetchProtoLatestDraw();
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, gameId);

		return messageWrapper;
	}

	public MessageWrapper fetchSuper3LatestDraw(int gameId) {
		draw = implPort.fetchSuper3LatestDraw();
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, gameId);

		return messageWrapper;
	}

	public MessageWrapper fetchExtra5LatestDraw(int gameId) {
		draw = implPort.fetchExtra5LatestDraw();
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, gameId);

		return messageWrapper;
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

	public MessageWrapper fetchKinoByDate(XMLGregorianCalendar date, int gameId) {
		draws = implPort.fetchKinoDrawsByDate(date);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draws, gameId);

		return messageWrapper;
	}

	public MessageWrapper fetchLottoByDate(XMLGregorianCalendar date, int gameId) {
		draws = implPort.fetchLottoDrawsByDate(date);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draws, gameId);

		return messageWrapper;
	}

	public MessageWrapper fetchJokerByDate(XMLGregorianCalendar date, int gameId) {
		draws = implPort.fetchJokerDrawsByDate(date);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draws, gameId);

		return messageWrapper;
	}

	public MessageWrapper fetchProtoByDate(XMLGregorianCalendar date, int gameId) {
		draws = implPort.fetchProtoDrawsByDate(date);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draws, gameId);

		return messageWrapper;
	}

	public MessageWrapper fetchSuper3ByDate(XMLGregorianCalendar date,
			int gameId) {
		draws = implPort.fetchSuper3DrawsByDate(date);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draws, gameId);

		return messageWrapper;
	}

	public MessageWrapper fetchExtra5ByDate(XMLGregorianCalendar date,
			int gameId) {
		draws = implPort.fetchExtra5DrawsByDate(date);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draws, gameId);

		return messageWrapper;
	}

	public MessageWrapper fetchKinoByNumber(Long drawNumber, int gameId) {
		draw = implPort.fetchKinoDrawByNumber(drawNumber);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, gameId);

		return messageWrapper;
	}

	public MessageWrapper fetchLottoByNumber(Long drawNumber, int gameId) {
		draw = implPort.fetchLottoDrawByNumber(drawNumber);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, gameId);

		return messageWrapper;
	}

	public MessageWrapper fetchJokerByNumber(Long drawNumber, int gameId) {
		draw = implPort.fetchJokerDrawByNumber(drawNumber);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, gameId);

		return messageWrapper;
	}

	public MessageWrapper fetchProtoByNumber(Long drawNumber, int gameId) {
		draw = implPort.fetchProtoDrawByNumber(drawNumber);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, gameId);

		return messageWrapper;
	}

	public MessageWrapper fetchSuper3ByNumber(Long drawNumber, int gameId) {
		draw = implPort.fetchSuper3DrawByNumber(drawNumber);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, gameId);

		return messageWrapper;
	}

	public MessageWrapper fetchExtra5ByNumber(Long drawNumber, int gameId) {
		draw = implPort.fetchExtra5DrawByNumber(drawNumber);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, gameId);

		return messageWrapper;
	}
}
