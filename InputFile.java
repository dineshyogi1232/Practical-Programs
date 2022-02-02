package com.Collection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
/**
 * @author	Dinesh Yogi
 * @desc	Create a text file(The file name is “myTestFile”) and add your personal
 *			details to the test file
 */
public class InputFile {

	public static void main(String[] args) throws FileNotFoundException {
		int countData = 0;
		String data = null;
		Scanner scanner = new Scanner(System.in);
		File file = new File("myTestFile.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		FileInputStream fileInputStream = new FileInputStream(file);

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println("File creation error... ");
			}
		}

		try {
			System.out.println("Enter your data which you want to add in file: ");
			data = scanner.next();
			fileOutputStream.write(data.getBytes());
			while ((countData = fileInputStream.read()) > 0) {
				System.out.print((char) countData);
			}

		} catch (FileNotFoundException e) {
			System.err.println("File not found... ");
		} catch (IOException e) {
			System.err.println("Input Output Exception... ");
		} finally {
			try {
				fileInputStream.close();
				fileOutputStream.close();
			} catch (IOException e) {
				System.err.println("Input Output Exception... ");
			}
			scanner.close();
		}
	}

}