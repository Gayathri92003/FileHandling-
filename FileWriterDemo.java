package filehandlings;

import java.io.*;

public class FileWriterDemo {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("C:\\Users\\Gayathri\\Documents\\first.txt");
			
			FileWriter fw = new FileWriter(f);
			
			String msg = "File Writer";
			
			fw.write(msg);
			
			fw.close();
			
			System.out.println("Success...");
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
