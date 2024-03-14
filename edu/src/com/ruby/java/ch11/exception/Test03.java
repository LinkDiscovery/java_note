package com.ruby.java.ch11.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (FileInputStream fi = new FileInputStream("a.txt")) {
			int c;
			while((c=fi.read()) != -1) {
				System.out.print(c);
				System.out.print(",");
				System.out.println((char) c);
			}
	
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
