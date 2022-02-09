package com.collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @desc	Read the Data from a myTestFile file
 */
public class ReadFile {

	public static void main(String[] args) throws IOException {
		String className = "ReadFile";
		Scanner scanner = new Scanner(System.in);
		FileReader fileReader = new FileReader("myTestFile.txt");
		try {
			int countData = 0;
			while ((countData = fileReader.read()) > 0) {
				CallingLogger.getWarningLoggerFrom(className, "" + (char) countData);
			}
		} catch (FileNotFoundException e) {
			CallingLogger.getInfoLoggerFrom(className, "FileNotFoundException....");
		} catch (IOException e) {
			CallingLogger.getWarningLoggerFrom(className, "FileNotFoundException....");
		} finally {
			fileReader.close();
			scanner.close();
		}
	}

}