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

	public MessageWrapper fetchKinoLatestDraw(String game) {
		draw = implPort.fetchKinoLatestDraw();
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, game);

		return messageWrapper;
	}

	public MessageWrapper fetchLottoLatestDraw(String game) {
		draw = implPort.fetchLottoLatestDraw();
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, game);

		return messageWrapper;
	}

	public MessageWrapper fetchJokerLatestDraw(String game) {
		draw = implPort.fetchJokerLatestDraw();
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, game);

		return messageWrapper;
	}

	public MessageWrapper fetchProtoLatestDraw(String game) {
		draw = implPort.fetchProtoLatestDraw();
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, game);

		return messageWrapper;
	}

	public MessageWrapper fetchSuper3LatestDraw(String game) {
		draw = implPort.fetchSuper3LatestDraw();
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, game);

		return messageWrapper;
	}

	public MessageWrapper fetchExtra5LatestDraw(String game) {
		draw = implPort.fetchExtra5LatestDraw();
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, game);

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

	public MessageWrapper fetchKinoByDate(XMLGregorianCalendar date, String game) {
		draws = implPort.fetchKinoDrawsByDate(date);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draws, game);

		return messageWrapper;
	}

	public MessageWrapper fetchLottoByDate(XMLGregorianCalendar date, String game) {
		draws = implPort.fetchLottoDrawsByDate(date);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draws, game);

		return messageWrapper;
	}

	public MessageWrapper fetchJokerByDate(XMLGregorianCalendar date, String game) {
		draws = implPort.fetchJokerDrawsByDate(date);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draws, game);

		return messageWrapper;
	}

	public MessageWrapper fetchProtoByDate(XMLGregorianCalendar date, String game) {
		draws = implPort.fetchProtoDrawsByDate(date);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draws, game);

		return messageWrapper;
	}

	public MessageWrapper fetchSuper3ByDate(XMLGregorianCalendar date,
			String game) {
		draws = implPort.fetchSuper3DrawsByDate(date);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draws, game);

		return messageWrapper;
	}

	public MessageWrapper fetchExtra5ByDate(XMLGregorianCalendar date,
			String game) {
		draws = implPort.fetchExtra5DrawsByDate(date);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draws, game);

		return messageWrapper;
	}

	public MessageWrapper fetchKinoByNumber(Long drawNumber, String game) {
		draw = implPort.fetchKinoDrawByNumber(drawNumber);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, game);

		return messageWrapper;
	}

	public MessageWrapper fetchLottoByNumber(Long drawNumber, String game) {
		draw = implPort.fetchLottoDrawByNumber(drawNumber);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, game);

		return messageWrapper;
	}

	public MessageWrapper fetchJokerByNumber(Long drawNumber, String game) {
		draw = implPort.fetchJokerDrawByNumber(drawNumber);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, game);

		return messageWrapper;
	}

	public MessageWrapper fetchProtoByNumber(Long drawNumber, String game) {
		draw = implPort.fetchProtoDrawByNumber(drawNumber);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, game);

		return messageWrapper;
	}

	public MessageWrapper fetchSuper3ByNumber(Long drawNumber, String game) {
		draw = implPort.fetchSuper3DrawByNumber(drawNumber);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, game);

		return messageWrapper;
	}

	public MessageWrapper fetchExtra5ByNumber(Long drawNumber, String game) {
		draw = implPort.fetchExtra5DrawByNumber(drawNumber);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, game);

		return messageWrapper;
	}
}
