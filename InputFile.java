package com.collection;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @desc	Create a Text File(The file name is “myTestFile”) and add your personal
 *			details to the test file
 */
public class InputFile {

	public static void main(String[] args) {
		String className = "InputFile";
		Scanner scanner = new Scanner(System.in);
		Path path = Path.of("myTestFile.txt");
		CallingLogger.getInfoLoggerFrom(className, "Enter your data which you want to add in file: ");
		String data = scanner.next();
		try {
			Files.writeString(path, data);
			CallingLogger.getInfoLoggerFrom(className, "Data inserted in file");
		} catch (IOException e) {
			e.printStackTrace();
			CallingLogger.getInfoLoggerFrom(className, "Insertion Failed exception occured...");
		} finally {
			scanner.close();
		}
	}

}