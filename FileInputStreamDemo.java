package filehandlings;

import java.io.*;

public class FileInputStreamDemo {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("C:\\Users\\Gayathri\\Documents\\sample.txt");
			
			FileInputStream fin = new FileInputStream(f);
			
			int byte_value;
			
			while((byte_value = fin.read()) != -1) {
				
				char ch = (char)byte_value;
				
				System.out.print(ch);
			}
			
			
			
			fin.close();
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
