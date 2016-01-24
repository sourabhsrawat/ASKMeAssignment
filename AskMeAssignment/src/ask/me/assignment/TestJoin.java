package ask.me.assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestJoin extends TestBase {
	
	private static final String TEST_CASE_NAME = "Join Test Case: ";

	public void joinTestSet() throws IOException
	{
		StringBuffer response = getResponse(TestConstants.JOIN_REQUEST_URL);
		RequestResponseForJoin httpRequestResponse = mapHttpRequestForJoin(response);
		
		RecordsForJoin[] records = httpRequestResponse.getRecords();
		
		List<String[]> csvFileData = getCSVData(TestConstants.CSV_FILE_JOIN_NAME);
		
		compareRecordsFromJoin((ArrayList<String[]>) csvFileData, records, TEST_CASE_NAME);
	}
}
