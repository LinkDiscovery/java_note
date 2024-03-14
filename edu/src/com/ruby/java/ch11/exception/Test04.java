package com.ruby.java.ch11.exception;

import java.io.FileInputStream;

public class Test04 {

	public static void test() throws Exception{
//		int t = 10/0
		FileInputStream fi = new FileInputStream("ai.txt");
		int c = fi.read();
		System.out.println((char) c);
	}

	
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("End");
		}
	}