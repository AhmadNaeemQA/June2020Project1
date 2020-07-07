package com.qa.logger;

import org.apache.log4j.Logger;

public class runner {
	public static void main(String[] args) {

		final Logger LOGGER = Logger.getLogger(runner.class);
		LOGGER.info("Hello");

		// this logger doesnt work, try different method
		// defult logger works. just not log4j logger
	}
}
