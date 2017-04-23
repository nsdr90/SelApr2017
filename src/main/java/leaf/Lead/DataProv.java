package leaf.Lead;

import org.testng.annotations.DataProvider;

public class DataProv {
	@DataProvider(name="fetchData")
	public static Object[][] data(){
		Object[][] testData = new Object[2][3];
		testData[0][0] = "QEagle";
		testData[0][1] = "Gopinath";
		testData[0][2] = "Jayakumar";
		testData[1][0] = "QEagle";
		testData[1][1] = "Babu";
		testData[1][2] = "Manickam";
		return testData;
	}
}
