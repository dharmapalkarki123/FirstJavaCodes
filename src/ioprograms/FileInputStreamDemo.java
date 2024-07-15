package ioprograms;

import java.io.*;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("filel.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int size = bis.available();// returns the size of the file
		byte[] buffer = new byte[size]; //allocate memory for variable
		bis.read(buffer);
		String s = new String(buffer);// converts byte[] into String 
		System.out.println(s);
		bis.close();
		fis.close();
	}
}