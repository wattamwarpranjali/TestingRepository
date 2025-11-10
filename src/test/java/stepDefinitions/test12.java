package stepDefinitions;

import java.io.IOException;

import com.coverfox.utils.Utility;

public class test12 {


		public static void main(String[] args) throws IOException {
		    String browser = Utility.readDataFromPropertiesFile("browser");
		    String url = Utility.readDataFromPropertiesFile("url");
		    System.out.println("Browser: " + browser);
		    System.out.println("URL: " + url);
		

	}

}
