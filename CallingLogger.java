package com.oopsconcepts;

import java.util.logging.Logger;

/**
 * @author	Dinesh Yogi
 * @desc	Create for Calling logger in all classes
 */

public class CallingLogger {

	public static void getInfoLoggerFrom(String name, String message) {
		Logger loggerInfo = Logger.getLogger(name.getClass().getName());
		loggerInfo.info(message);
	}

	public static void getWarningLoggerFrom(String name, String message) {
		Logger loggerWarning = Logger.getLogger(name.getClass().getName());
		loggerWarning.warning(message);
	}

	public static void getFineLoggerFrom(String name, String message) {
		Logger loggerFine = Logger.getLogger(name.getClass().getName());
		loggerFine.fine(message);
	}

	public static void getFinerLoggerFrom(String name, String message) {
		Logger loggerFiner = Logger.getLogger(name.getClass().getName());
		loggerFiner.finer(message);
	}

}