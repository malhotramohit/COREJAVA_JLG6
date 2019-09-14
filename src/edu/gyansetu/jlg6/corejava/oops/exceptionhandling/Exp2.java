package edu.gyansetu.jlg6.corejava.oops.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;




public class Exp2 {

	public static void main(String[] args) {

		try {
			userIssuedReadFile();
		} catch (ZapException e) {
			e.printStackTrace();
			System.out.println("log in DB");
			System.out.println("erro.jsp");
		}
		
	}

	private static void userIssuedReadFile() throws ZapException {
		
		delegateCallToService();
		
	}

	private static void delegateCallToService() throws ZapException {
		readFileFromDB();
		
	}

	private static void readFileFromDB() throws ZapException {
		readfile();
		
	}

	private static void readfile() throws ZapException {
		try {
			FileInputStream fileInputStream = new FileInputStream("/Usrs/mohitmalhotra/Core_java_JLG6/CoreJava_JLG6/src/edu/gyansetu/jlg6/corejava/oops/exceptionhandling/Exp2.java");
		} catch (FileNotFoundException e) {
			throw new ZapException("File not present",e);
		}
		finally {
			// db
			System.out.println("I will always ex");
		}


		System.out.println("exp handled");

	}

}
