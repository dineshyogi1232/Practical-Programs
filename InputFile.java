package com.collection;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * @author	Dinesh Yogi
 * @desc	Create a Text File(The file name is “myTestFile”) and add your personal
 *			details to the test file
 */
public class InputFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Path path = Path.of("myTestFile.txt");
		System.out.println("Enter your data which you want to add in file: ");
		String data = scanner.next();
		try {
			Files.writeString(path, data);
			System.out.println("Data inserted in file");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Insertion Failed exception occured...");
		} finally {
			scanner.close();
		}
	}

}