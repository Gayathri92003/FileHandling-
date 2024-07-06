package filehandlings;

import java.io.*;

public class FilterOutputStreamDemo {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("C:\\Users\\Gayathri\\Documents\\first1.txt");
			
			FileOutputStream fout = new FileOutputStream(f);
			
			FilterOutputStream bout = new FilterOutputStream(fout);
			
			String msg = "Filtered output stream";
			
			byte[] by = msg.getBytes();
			
			bout.write(by);
			
			bout.close();
			
			fout.close();
			
			System.out.println("Success ...");
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
