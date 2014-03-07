package gr.kzps;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test case for fetch draw by specific draw number.
 * @author Antonis Kouzoupis
 *
 */
public class QueryServiceDrawNumTest extends QueryService {

	private static QueryService qService;
	private final long DRAWNUM = 1474L;
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
