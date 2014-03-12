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

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import gr.kzps.util.Constants;
import gr.opap.draws.ws.query.DrawQueriesServiceImplService;
import gr.opap.draws.ws.query.DrawQueriesServiceSEI;
import gr.opap.draws.ws.query.GameDraw;

/**
 * The class that fetches game draws from OPAP web service.
 * 
 * @author Antonis Kouzoupis
 * 
 */
public class QueryService {
	/**
	 * Web service endpoint.
	 */
	private DrawQueriesServiceImplService service;
	/**
	 * Web service implementation.
	 */
	private DrawQueriesServiceSEI implPort;
	/**
	 * Single draw respond.
	 * 
	 * @see GameDraw
	 */
	private GameDraw draw;
	/**
	 * Multiple draws respond.
	 * 
	 * @see List
	 * @see GameDraw
	 */
	private List<GameDraw> draws;
	/**
	 * Unified message wrapper.
	 * 
	 * @see MessageWrapper
	 */
	private MessageWrapper messageWrapper;

	/**
	 * Initialize web service end point and implementation.
	 */
	public QueryService() {
		service = new DrawQueriesServiceImplService();
		implPort = service.getDrawQueriesServiceImplPort();
	}

	/**
	 * Fetches Kinno latest draw.
	 * 
	 * @return Response message
	 * @see MessageWrapper
	 * @see MessageWrapper#createMessageWrapper(GameDraw, String)
	 */
	public MessageWrapper fetchKinoLatestDraw() {
		draw = implPort.fetchKinoLatestDraw();
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, Constants.KINNO);

		return messageWrapper;
	}

	/**
	 * Fetces Lotto latest draw.
	 * 
	 * @return Response message
	 * @see MessageWrapper
	 * @see MessageWrapper#createMessageWrapper(GameDraw, String)
	 */
	public MessageWrapper fetchLottoLatestDraw() {
		draw = implPort.fetchLottoLatestDraw();
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, Constants.LOTTO);

		return messageWrapper;
	}

	/**
	 * Fetches Joker latest draw.
	 * 
	 * @return Response message
	 * @see MessageWrapper
	 * @see MessageWrapper#createMessageWrapper(GameDraw, String)
	 */
	public MessageWrapper fetchJokerLatestDraw() {
		draw = implPort.fetchJokerLatestDraw();
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, Constants.JOKER);

		return messageWrapper;
	}

	/**
	 * Fetches Proto latest draw.
	 * 
	 * @return Response message
	 * @see MessageWrapper
	 * @see MessageWrapper#createMessageWrapper(GameDraw, String)
	 */
	public MessageWrapper fetchProtoLatestDraw() {
		draw = implPort.fetchProtoLatestDraw();
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, Constants.PROTO);

		return messageWrapper;
	}

	/**
	 * Fetches Super 3 latest draw.
	 * 
	 * @return Response message
	 * @see MessageWrapper
	 * @see MessageWrapper#createMessageWrapper(GameDraw, String)
	 */
	public MessageWrapper fetchSuper3LatestDraw() {
		draw = implPort.fetchSuper3LatestDraw();
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, Constants.SUPER3);

		return messageWrapper;
	}

	/**
	 * Fetches Extra 5 latest draw.
	 * 
	 * @return Response message
	 * @see MessageWrapper
	 * @see MessageWrapper#createMessageWrapper(GameDraw, String)
	 */
	public MessageWrapper fetchExtra5LatestDraw() {
		draw = implPort.fetchExtra5LatestDraw();
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, Constants.EXTRA5);

		return messageWrapper;
	}

	/**
	 * Fetch Propo Goal latest draw.
	 * 
	 * @return Draw result
	 */
	@SuppressWarnings("unused")
	private GameDraw fetchPropoGoalLatestDraw() {
		draw = implPort.fetchPropoGoalLatestDraw();

		return draw;
	}

	/**
	 * Fetches Power Spin latest draw.
	 * 
	 * @return Draw result
	 */
	@SuppressWarnings("unused")
	private GameDraw fetchPowerSpinLatestDraw() {
		draw = implPort.fetchPowerSpinLatestDraw();

		return draw;
	}

	/**
	 * Fetches Bowling latest draw.
	 * 
	 * @return Draw result
	 */
	@SuppressWarnings("unused")
	private GameDraw fetchBowlingLatestDraw() {
		draw = implPort.fetchBowlingLatestDraw();

		return draw;
	}

	/**
	 * Fetches Penalties latest draw.
	 * 
	 * @return Draw result
	 */
	@SuppressWarnings("unused")
	private GameDraw fetchPenaltiesLatestDraw() {
		draw = implPort.fetchPenaltiesLatestDraw();

		return draw;
	}

	/**
	 * Fetches Kino draws of the specified date.
	 * 
	 * @param date
	 *            Date of the draw
	 * @return Response message
	 * @see MessageWrapper
	 * @see MessageWrapper#createMessageWrapper(List, String)
	 * @see XMLGregorianCalendar
	 */
	public MessageWrapper fetchKinoByDate(final XMLGregorianCalendar date) {
		draws = implPort.fetchKinoDrawsByDate(date);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draws, Constants.KINNO);

		return messageWrapper;
	}

	/**
	 * Fetches Lotto draws of the specified date.
	 * 
	 * @param date
	 *            Date of the draw
	 * @return Response message
	 * @see MessageWrapper
	 * @see MessageWrapper#createMessageWrapper(List, String)
	 * @see XMLGregorianCalendar
	 */
	public MessageWrapper fetchLottoByDate(final XMLGregorianCalendar date) {
		draws = implPort.fetchLottoDrawsByDate(date);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draws, Constants.LOTTO);

		return messageWrapper;
	}

	/**
	 * Fetches Joker draws of the specified date.
	 * 
	 * @param date
	 *            Date of the draw
	 * @return Response message
	 * @see MessageWrapper
	 * @see MessageWrapper#createMessageWrapper(List, String)
	 * @see XMLGregorianCalendar
	 */
	public MessageWrapper fetchJokerByDate(final XMLGregorianCalendar date) {
		draws = implPort.fetchJokerDrawsByDate(date);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draws, Constants.JOKER);

		return messageWrapper;
	}

	/**
	 * Fetches Proto draws of the specified date.
	 * 
	 * @param date
	 *            Date of the draw
	 * @return Response message
	 * @see MessageWrapper
	 * @see MessageWrapper#createMessageWrapper(List, String)
	 * @see XMLGregorianCalendar
	 */
	public MessageWrapper fetchProtoByDate(final XMLGregorianCalendar date) {
		draws = implPort.fetchProtoDrawsByDate(date);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draws, Constants.PROTO);

		return messageWrapper;
	}

	/**
	 * Fetches Super 3 draws of the specified date.
	 * 
	 * @param date
	 *            Date of the draw
	 * @return Response message
	 * @see MessageWrapper
	 * @see MessageWrapper#createMessageWrapper(List, String)
	 * @see XMLGregorianCalendar
	 */
	public MessageWrapper fetchSuper3ByDate(final XMLGregorianCalendar date) {
		draws = implPort.fetchSuper3DrawsByDate(date);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draws, Constants.SUPER3);

		return messageWrapper;
	}

	/**
	 * Fetches Extra 5 draws of the specified date.
	 * 
	 * @param date
	 *            Date of the draw
	 * @return Response message
	 * @see MessageWrapper
	 * @see MessageWrapper#createMessageWrapper(List, String)
	 * @see XMLGregorianCalendar
	 */
	public MessageWrapper fetchExtra5ByDate(final XMLGregorianCalendar date) {
		draws = implPort.fetchExtra5DrawsByDate(date);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draws, Constants.EXTRA5);

		return messageWrapper;
	}

	/**
	 * Fetches Kino draw specified by a draw number.
	 * 
	 * @param drawNumber
	 *            Draw number
	 * @return Response message
	 * @see MessageWrapper
	 * @see MessageWrapper#createMessageWrapper(GameDraw, String)
	 */
	public MessageWrapper fetchKinoByNumber(final Long drawNumber) {
		draw = implPort.fetchKinoDrawByNumber(drawNumber);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, Constants.KINNO);

		return messageWrapper;
	}

	/**
	 * Fetches Lotto draw specified by a draw number.
	 * 
	 * @param drawNumber
	 *            Draw number
	 * @return Response message
	 * @see MessageWrapper
	 * @see MessageWrapper#createMessageWrapper(GameDraw, String)
	 */
	public MessageWrapper fetchLottoByNumber(final Long drawNumber) {
		draw = implPort.fetchLottoDrawByNumber(drawNumber);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, Constants.LOTTO);

		return messageWrapper;
	}

	/**
	 * Fetches Joker draw specified by a draw number.
	 * 
	 * @param drawNumber
	 *            Draw number
	 * @return Response message
	 * @see MessageWrapper
	 * @see MessageWrapper#createMessageWrapper(GameDraw, String)
	 */
	public MessageWrapper fetchJokerByNumber(final Long drawNumber) {
		draw = implPort.fetchJokerDrawByNumber(drawNumber);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, Constants.JOKER);

		return messageWrapper;
	}

	/**
	 * Fetches Proto draw specified by a draw number.
	 * 
	 * @param drawNumber
	 *            Draw number
	 * @return Response message
	 * @see MessageWrapper
	 * @see MessageWrapper#createMessageWrapper(GameDraw, String)
	 */
	public MessageWrapper fetchProtoByNumber(final Long drawNumber) {
		draw = implPort.fetchProtoDrawByNumber(drawNumber);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, Constants.PROTO);

		return messageWrapper;
	}

	/**
	 * Fetches Super 3 draw specified by a draw number.
	 * 
	 * @param drawNumber
	 *            Draw number
	 * @return Response message
	 * @see MessageWrapper
	 * @see MessageWrapper#createMessageWrapper(GameDraw, String)
	 */
	public MessageWrapper fetchSuper3ByNumber(final Long drawNumber) {
		draw = implPort.fetchSuper3DrawByNumber(drawNumber);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, Constants.SUPER3);

		return messageWrapper;
	}

	/**
	 * Fetches Extra 5 draw specified by a draw number.
	 * 
	 * @param drawNumber
	 *            Draw number
	 * @return Response message
	 * @see MessageWrapper
	 * @see MessageWrapper#createMessageWrapper(GameDraw, String)
	 */
	public MessageWrapper fetchExtra5ByNumber(final Long drawNumber) {
		draw = implPort.fetchExtra5DrawByNumber(drawNumber);
		messageWrapper = new MessageWrapper();
		messageWrapper.createMessageWrapper(draw, Constants.EXTRA5);

		return messageWrapper;
	}
}
