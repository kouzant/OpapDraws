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

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test case for fetch draw for a specific date
 * @author Antonis Kouzoupis
 *
 */
public class QueryServiceByDateTest extends QueryService {

	private static QueryService qService;
	private static XMLGregorianCalendar xmlGCal;
	private static MessageWrapper mswr;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		qService = new QueryService();

		GregorianCalendar gCal = new GregorianCalendar(2014, 1, 26);
		System.out.println(gCal.getTime().toString());
		xmlGCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCal);
	}

	@Test
	public void testFetchKinoByDate() {
		mswr = qService.fetchKinoByDate(xmlGCal);
		assertNotNull("Fetch by Date", mswr);
		assertEquals(157, mswr.getGameDraws().size());
		assertNotNull(mswr.getGameDraws().get(150).getNumArr());
		assertEquals(20, mswr.getGameDraws().get(149).getNumArr().size());
	}

	@Test
	public void testFetchLottoByDate() {
		mswr = qService.fetchLottoByDate(xmlGCal);
		assertNotNull("Fetch by Date", mswr);
		assertEquals(1, mswr.getGameDraws().size());
		assertNotNull(mswr.getGameDraws().get(0).getNumArr());
		assertEquals(7, mswr.getGameDraws().get(0).getNumArr().size());
	}

	@Test
	public void testFetchJokerByDate() {
		mswr = qService.fetchJokerByDate(xmlGCal);
		assertNotNull("Fetch by Date", mswr);
		assertEquals(0, mswr.getGameDraws().size());
		//assertNotNull(mswr.getGameDraws().get(0).getNumArr());
		//assertEquals(6, mswr.getGameDraws().get(0).getNumArr().size());
	}

	@Test
	public void testFetchProtoByDate() {
		mswr = qService.fetchProtoByDate(xmlGCal);
		assertNotNull("Fetch by Date", mswr);
		assertEquals(0, mswr.getGameDraws().size());
		//assertNotNull(mswr.getGameDraws().get(0).getNumArr());
		//assertEquals(7, mswr.getGameDraws().get(0).getNumArr().size());
	}

	@Test
	public void testFetchSuper3ByDate() {
		mswr = qService.fetchSuper3ByDate(xmlGCal);
		assertNotNull("Fetch by Date", mswr);
		assertEquals(10, mswr.getGameDraws().size());
		assertNotNull(mswr.getGameDraws().get(4).getNumArr());
		assertEquals(3, mswr.getGameDraws().get(8).getNumArr().size());
	}

	@Test
	public void testFetchExtra5ByDate() {
		mswr = qService.fetchExtra5ByDate(xmlGCal);
		assertNotNull("Fetch by Date", mswr);
		assertEquals(2, mswr.getGameDraws().size());
		assertNotNull(mswr.getGameDraws().get(0).getNumArr());
		assertEquals(5, mswr.getGameDraws().get(1).getNumArr().size());
	}

}
