package ask.me.assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestFilters extends TestBase {

	private static final String FILTER = "&filters[CORPORATEIDENTIFICATIONNUMBER]="
			+ TestConstants.FILTER;
	private static final String TEST_CASE_FAIL_STR = "Filter Test case : FAIL";
	private static final String TEST_CASE_FAIL_STR1 = "Failure Reason: arrays having different size";
	private static final String TEST_CASE_NAME = "Filter Test Case";

	public void filterTestSet() throws IOException {
		StringBuffer response = getResponse(TestConstants.REQUEST_URL
				+ TestConstants.KEY + FILTER);
		RequestResponse httpRequestResponse = mapHttpRequest(response);

		ArrayList<String[]> result = new ArrayList<String[]>();
		List<String[]> csvFileData = getCSVData(TestConstants.CSV_FILE_NAME);
		for (String[] rows : csvFileData) {
			for (String col : rows) {
				if (col.equals(TestConstants.FILTER)) {
					result.add(rows);
				}
			}
		}

		Records[] records = httpRequestResponse.getRecords();
		if (result.size() != records.length) {
			System.out.println(TEST_CASE_FAIL_STR);
			System.out.println(TEST_CASE_FAIL_STR1);

		} else {
			compare(result, records, TEST_CASE_NAME);
		}
	}
}
