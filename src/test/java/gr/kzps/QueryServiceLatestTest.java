package gr.kzps;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test case for fetch latest draw.
 * @author Antonis Kouzoupis
 *
 */
public class QueryServiceLatestTest {
	private static QueryService qService;
	private static MessageWrapper mswr;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		qService = new QueryService();
	}

	@Test
	public void testFetchKinoLatestDraw() {
		mswr = qService.fetchKinoLatestDraw();
		assertNotNull("Draw: ", mswr);
		assertEquals(1, mswr.getGameDraws().size());
		assertNotNull(mswr.getGameDraws().get(0).getNumArr());
		assertEquals(20, mswr.getGameDraws().get(0).getNumArr().size());
	}

	@Test
	public void testFetchLottoLatestDraw() {
		mswr = qService.fetchLottoLatestDraw();
		assertNotNull("Draw: ", mswr);
		assertEquals(1, mswr.getGameDraws().size());
		assertNotNull(mswr.getGameDraws().get(0).getNumArr());
		assertEquals(7, mswr.getGameDraws().get(0).getNumArr().size());
	}

	@Test
	public void testFetchJokerLatestDraw() {
		mswr = qService.fetchJokerLatestDraw();
		assertNotNull("Draw: ", mswr);
		assertEquals(1, mswr.getGameDraws().size());
		assertNotNull(mswr.getGameDraws().get(0).getNumArr());
		assertEquals(6, mswr.getGameDraws().get(0).getNumArr().size());
	}

	@Test
	public void testFetchProtoLatestDraw() {
		mswr = qService.fetchProtoLatestDraw();
		assertNotNull("Draw: ", mswr);
		assertEquals(1, mswr.getGameDraws().size());
		assertNotNull(mswr.getGameDraws().get(0).getNumArr());
		assertEquals(7, mswr.getGameDraws().get(0).getNumArr().size());
	}

	@Test
	public void testFetchSuper3LatestDraw() {
		mswr = qService.fetchSuper3LatestDraw();
		assertNotNull("Draw: ", mswr);
		assertEquals(1, mswr.getGameDraws().size());
		assertNotNull(mswr.getGameDraws().get(0).getNumArr());
		assertEquals(3, mswr.getGameDraws().get(0).getNumArr().size());
	}

	@Test
	public void testFetchExtra5LatestDraw() {
		mswr = qService.fetchExtra5LatestDraw();
		assertNotNull("Draw: ", mswr);
		assertEquals(1, mswr.getGameDraws().size());
		assertNotNull(mswr.getGameDraws().get(0).getNumArr());
		assertEquals(5, mswr.getGameDraws().get(0).getNumArr().size());
	}
}
