package ioprograms;

import java.io.*;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("filel.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String s = "Java is OO Programming  Language";
		fos.write(s.getBytes());
		System.out.println("File Created");
		fos.close();
	}
}