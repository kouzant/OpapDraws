package gr.kzps;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class QueryServiceDrawNumTest extends QueryService {

	private static QueryService qService;
	private final long DRAWNUM = 1474L;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		qService = new QueryService();
	}

	@Test
	public void testFetchKinoByNumber() {
		assertNotNull("Draw by Number", qService.fetchKinoByNumber(DRAWNUM));
	}

	@Test
	public void testFetchLottoByNumber() {
		assertNotNull("Draw by Number", qService.fetchLottoByNumber(DRAWNUM));
	}

	@Test
	public void testFetchJokerByNumber() {
		assertNotNull("Draw by Number", qService.fetchJokerByNumber(DRAWNUM));
	}

	@Test
	public void testFetchProtoByNumber() {
		assertNotNull("Draw by Number", qService.fetchProtoByNumber(DRAWNUM));
	}

	@Test
	public void testFetchSuper3ByNumber() {
		assertNotNull("Draw by Number", qService.fetchSuper3ByNumber(DRAWNUM));
	}

	@Test
	public void testFetchExtra5ByNumber() {
		assertNotNull("Draw by Number", qService.fetchExtra5ByNumber(DRAWNUM));
	}

}
