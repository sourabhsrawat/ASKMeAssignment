package ask.me.assignment;

public class TestRun {


	public static void main(String[] args) throws Exception {

		System.out.println("****Test Suit Is Running****");
		
		System.out.println("****Running Filter Test****");
		TestFilters testFilter = new TestFilters();
		testFilter.filterTestSet();
		System.out.println("****Running OffSet Test****");
		TestOffSet offset = new TestOffSet();
		offset.offsetTestSet();
		System.out.println("****Running Field Selection Test****");
		TestFieldSelection fieldSelection = new TestFieldSelection();
		fieldSelection.fieldTestSet();
		System.out.println("****Running Sorting Test****");
		TestSorting testSorting = new TestSorting();
		testSorting.sortingTestSet();
		System.out.println("****Running Join Test****");
		TestJoin tj = new TestJoin();
		tj.joinTestSet();

	}
}
