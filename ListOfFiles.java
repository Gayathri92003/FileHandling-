package filehandlings;

import java.io.File;

public class ListOfFiles {

	public static void main(String[] args) {
		
		java.io.File f = new java.io.File("C:\\Users\\Gayathri\\training\\java");
		
		String[] st = f.list();
		
		for(int i=0; i<st.length; i++) {
			
			System.out.println(st[i]);
		}
	}
}
