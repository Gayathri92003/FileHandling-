package filehandlings;

import java.io.*;


public class ReadAndWriteData1 {

public static void main(String[] args) {
		
		try {
			
			File source = new File("C:\\Users\\Gayathri\\Documents\\s2.txt");
			
			File destination = new File("C:\\Users\\Gayathri\\Documents\\s1.txt");
			
			FileReader fin = new FileReader(source);
			
			FileWriter fout = new FileWriter(destination);
			
			int x;
			
			while((x=fin.read())!=-1) {
				
				fout.write(x);
			}
			
			fout.close();
			
			fin.close();
			
			System.out.println("Success...");
			
		} catch (Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
