package gr.kzps;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class QueryServiceByDateTest extends QueryService {

	private static QueryService qService;
	private static XMLGregorianCalendar xmlGCal;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		qService = new QueryService();

		GregorianCalendar gCal = new GregorianCalendar(2014, 1, 26);
		xmlGCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCal);
	}

	@Test
	public void testFetchKinoByDate() {
		assertNotNull("Fetch by Date", qService.fetchKinoByDate(xmlGCal));
	}

	@Test
	public void testFetchLottoByDate() {
		assertNotNull("Fetch by Date", qService.fetchLottoByDate(xmlGCal));
	}

	@Test
	public void testFetchJokerByDate() {
		assertNotNull("Fetch by Date", qService.fetchJokerByDate(xmlGCal));
	}

	@Test
	public void testFetchProtoByDate() {
		assertNotNull("Fetch by Date", qService.fetchProtoByDate(xmlGCal));
	}

	@Test
	public void testFetchSuper3ByDate() {
		assertNotNull("Fetch by Date", qService.fetchSuper3ByDate(xmlGCal));
	}

	@Test
	public void testFetchExtra5ByDate() {
		assertNotNull("Fetch by Date", qService.fetchExtra5ByDate(xmlGCal));
	}

}
