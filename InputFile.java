package com.collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @desc	Create a text file(The file name is “myTestFile”) and add your personal
 *			details to the test file
 */
public class InputFile {

	public static void main(String[] args) throws FileNotFoundException {
		int countData = 0;
		String className = "InputFile";
		Scanner scanner = new Scanner(System.in);
		File file = new File("myTestFile.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		FileInputStream fileInputStream = new FileInputStream(file);

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				CallingLogger.getWarningLoggerFrom(className, "File creation error... ");
			}
		}

		try {
			CallingLogger.getInfoLoggerFrom(className, "Enter your data which you want to add in file: ");
			String data = scanner.next();
			fileOutputStream.write(data.getBytes());
			while ((countData = fileInputStream.read()) > 0) {
				CallingLogger.getInfoLoggerFrom(className, "" + (char) countData);
			}

		} catch (FileNotFoundException e) {
			CallingLogger.getWarningLoggerFrom(className, "File not found... ");
		} catch (IOException e) {
			CallingLogger.getWarningLoggerFrom(className, "Input Output Exception... ");
		} finally {
			try {
				fileInputStream.close();
				fileOutputStream.close();
			} catch (IOException e) {
				CallingLogger.getWarningLoggerFrom(className, "Input Output Exception... ");
			}
			scanner.close();
		}
	}

}