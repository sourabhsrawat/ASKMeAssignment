package ask.me.assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSorting extends TestBase {

	private static final String SORT = "&sort[" + TestConstants.SORT_BY
			+ "]=desc";
	private static final String TEST_CASE_STR = "Sorting Test Case";

	public void sortingTestSet() throws IOException {

		StringBuffer response = getResponse(TestConstants.REQUEST_URL
				+ TestConstants.KEY + SORT);
		RequestResponse httpRequestResponse = mapHttpRequest(response);

		Records[] records = httpRequestResponse.getRecords();

		List<String[]> csvFileData = getCSVData(TestConstants.CSV_FILE_NAME);

		Collections.sort(csvFileData, new Comparator<String[]>() {
			public int compare(String[] x1, String[] x2) {
				if (x1.length > TestConstants.COLUMN_INDEX
						&& x2.length > TestConstants.COLUMN_INDEX) {
					return x2[TestConstants.COLUMN_INDEX]
							.compareTo(x1[TestConstants.COLUMN_INDEX]);
				}
				if (x1.length > TestConstants.COLUMN_INDEX) {
					return 1;
				}
				if (x2.length > TestConstants.COLUMN_INDEX) {
					return -1;
				}
				return x2.length - x1.length;
			}
		});

		compare((ArrayList<String[]>) csvFileData, records, TEST_CASE_STR);

	}

}
