package com.collection;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author	Dinesh Yogi
 * @desc	Read the Data from a myTestFile file
 */
public class ReadFile {

	public static void main(String[] args) throws IOException {
		File file = new File("myTestFile.txt");
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();
	}

}