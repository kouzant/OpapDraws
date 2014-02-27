package gr.kzps;


import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

public class QueryServiceLatestTest {
	private static QueryService qService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		qService = new QueryService();
	}

	@Test
	public void testFetchKinoLatestDraw() {
		assertNotNull("Draw: ", qService.fetchKinoLatestDraw());
	}

	@Test
	public void testFetchLottoLatestDraw() {
		assertNotNull("Draw: ", qService.fetchLottoLatestDraw());
	}

	@Test
	public void testFetchJokerLatestDraw() {
		assertNotNull("Draw: ", qService.fetchJokerLatestDraw());
	}

	@Test
	public void testFetchProtoLatestDraw() {
		assertNotNull("Draw: ", qService.fetchProtoLatestDraw());
	}

	@Test
	public void testFetchSuper3LatestDraw() {
		assertNotNull("Draw: ", qService.fetchSuper3LatestDraw());
	}

	@Test
	public void testFetchExtra5LatestDraw() {
		assertNotNull("Draw: ", qService.fetchExtra5LatestDraw());
	}

	@Test
	public void testFetchPropoGoalLatestDraw() {
		assertNotNull("Draw: ", qService.fetchPropoGoalLatestDraw());
	}

	@Test
	public void testFetchPowerSpinLatestDraw() {
		assertNotNull("Draw: ", qService.fetchPowerSpinLatestDraw());
	}

	@Test
	public void testFetchBowlingLatestDraw() {
		assertNotNull("Draw: ", qService.fetchBowlingLatestDraw());
	}

	@Test
	public void testFetchPenaltiesLatestDraw() {
		assertNotNull("Draw: ", qService.fetchPenaltiesLatestDraw());
	}

}
