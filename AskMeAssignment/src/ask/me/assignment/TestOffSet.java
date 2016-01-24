package ask.me.assignment;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class TestOffSet extends TestBase {

	private static final String PARAMETER_LIMIT = "&limit=";
	private static final String PARAMETER_OFFSET = "&offset=";
	private static final String TEST_CASE_FAIL_STR = "OffSet Test case : FAIL";
	private static final String TEST_CASE_PASS_STR = "OffSet Test case : PASS";

	public void offsetTestSet() throws JsonParseException,
			JsonMappingException, IOException {
		StringBuffer response = getResponse(TestConstants.REQUEST_URL
				+ TestConstants.KEY + PARAMETER_LIMIT + TestConstants.LIMIT
				+ PARAMETER_OFFSET + TestConstants.OFFSET);
		RequestResponse httpRequestResponse = mapHttpRequest(response);

		Records[] records = httpRequestResponse.getRecords();
		String id = null;
		for (Records record : records) {
			id = record.getId();
		}
		if (httpRequestResponse.getCount().equals(TestConstants.LIMIT)
				&& id.equals(TestConstants.ID_TO_VERIFY)) {
			System.out.println(TEST_CASE_PASS_STR);
		}
		else
		{
			System.out.println(TEST_CASE_FAIL_STR);
		}

	}

}
