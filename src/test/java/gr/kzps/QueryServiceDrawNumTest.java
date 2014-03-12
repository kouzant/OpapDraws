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


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test case for fetch draw by specific draw number.
 * @author Antonis Kouzoupis
 *
 */
public class QueryServiceDrawNumTest extends QueryService {

	private static QueryService qService;
	private static final long DRAWNUM = 1474L;
	private static MessageWrapper mswr;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		qService = new QueryService();
	}

	@Test
	public void testFetchKinoByNumber() {
		mswr = qService.fetchKinoByNumber(DRAWNUM);
		assertNotNull("Draw by Number", mswr);
		assertEquals(1, mswr.getGameDraws().size());
		assertNotNull(mswr.getGameDraws().get(0).getNumArr());
		assertEquals(20, mswr.getGameDraws().get(0).getNumArr().size());
	}

	@Test
	public void testFetchLottoByNumber() {
		mswr = qService.fetchLottoByNumber(DRAWNUM);
		assertNotNull("Draw by Number", mswr);
		assertEquals(1, mswr.getGameDraws().size());
		assertNotNull(mswr.getGameDraws().get(0).getNumArr());
		assertEquals(7, mswr.getGameDraws().get(0).getNumArr().size());
	}

	@Test
	public void testFetchJokerByNumber() {
		mswr = qService.fetchJokerByNumber(DRAWNUM);
		assertNotNull("Draw by Number", mswr);
		assertEquals(1, mswr.getGameDraws().size());
		assertNotNull(mswr.getGameDraws().get(0).getNumArr());
		assertEquals(6, mswr.getGameDraws().get(0).getNumArr().size());
	}

	@Test
	public void testFetchProtoByNumber() {
		mswr = qService.fetchProtoByNumber(DRAWNUM);
		assertNotNull("Draw by Number", mswr);
		assertEquals(1, mswr.getGameDraws().size());
		assertNotNull(mswr.getGameDraws().get(0).getNumArr());
		assertEquals(7, mswr.getGameDraws().get(0).getNumArr().size());
	}

	@Test
	public void testFetchSuper3ByNumber() {
		mswr = qService.fetchSuper3ByNumber(DRAWNUM);
		assertNotNull("Draw by Number", mswr);
		assertEquals(1, mswr.getGameDraws().size());
		assertNotNull(mswr.getGameDraws().get(0).getNumArr());
		assertEquals(3, mswr.getGameDraws().get(0).getNumArr().size());
	}

	@Test
	public void testFetchExtra5ByNumber() {
		mswr = qService.fetchExtra5ByNumber(DRAWNUM);
		assertNotNull("Draw by Number", mswr);
		assertEquals(1, mswr.getGameDraws().size());
		assertNotNull(mswr.getGameDraws().get(0).getNumArr());
		assertEquals(5, mswr.getGameDraws().get(0).getNumArr().size());
	}

}
