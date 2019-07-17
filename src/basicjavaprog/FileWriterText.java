package basicjavaprog;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterText {

	public static void main(String[] args) throws IOException {
File filename = new File("C:\\Java_Workspace\\Writer.txt");
if(!filename.exists()) {
	filename.createNewFile();
}


	FileWriter fw = new FileWriter(filename);
	
	BufferedWriter writer = new BufferedWriter(fw);
	
//	writer.newLine();
	
	writer.write("The values are available here to validate ");
	writer.write("");
	
	writer.newLine();
	
	writer.write("The seq order");
	writer.newLine();
	writer.write("1236");
	
	
	writer.close();
	
	System.out.println();
	
	
	
	
	
	
/*}

catch(FileNotFoundException fe) {
	System.out.println("file not found"+filename);
	
}

catch (IOException ie) {
	System.out.println("unable to open the file"+filename);
}
	}*/
	}
	
}
