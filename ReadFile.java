package com.Collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author	Dinesh Yogi
 * @desc	Read the data from a myTestFile file
 */
public class ReadFile {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		FileReader fileReader = new FileReader("myTestFile.txt");
		try {
			int countData = 0;

			while ((countData = fileReader.read()) > 0) {
				System.out.print((char) countData);
			}
		} catch (FileNotFoundException e) {
			System.out.println(" FileNotFoundException....");
		} catch (IOException e) {
			System.out.println(" Input Output Exception occured....");
		} finally {
			fileReader.close();
			scanner.close();
		}
	}

}
