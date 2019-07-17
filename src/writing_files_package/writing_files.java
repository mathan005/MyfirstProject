package writing_files_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class writing_files {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prob = new Properties();
	
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\object.properties");
		prob.load(fis);
		
		System.out.println(prob.getProperty("name"));
		System.out.println(prob.getProperty("city"));
		System.out.println(System.getProperty("user.dir"));
		
		
		
	
	}

}
