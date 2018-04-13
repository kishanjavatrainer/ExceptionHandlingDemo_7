package com.infotech.client;

import java.io.IOException;

public class ThrowsDemo {
	public static void main(String[] args) {
		try {
			displayFileContent();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			//ex.printStackTrace();
		}
	}
	private static void displayFileContent() throws IOException   {
		System.out.println("In displayFileContent method");
		throw new IOException("File I/O exception has occured..");
	}
}