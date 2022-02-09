package com.collection;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @desc	Read the Data from a myTestFile file
 */
public class ReadFile {

	public static void main(String[] args) throws IOException {
		File file = new File("myTestFile.txt");
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			CallingLogger.getInfoLoggerFrom("ReadFile", scanner.nextLine());
		}
		scanner.close();
	}

}