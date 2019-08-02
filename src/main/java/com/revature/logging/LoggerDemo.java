package com.revature.logging;

import org.apache.log4j.Logger;

/**
 * Logging is a tool for formally logging events on the application or server.
 * Ideally, we should fully replace any code that uses System.out.println,
 * System.out.print, etc, or console.log in a JavaScript server with a proper
 * logging tool, such as log4j or Winston. 
 * 
 * Logging levels of Log4J.
 * 
 * TRACE -  Trace logging levels are used for minute logs that you wouldn't normally
 * 			want to see, but may need to enable for in depth logging.
 * 
 * DEBUG - General debugging output. Good place to log events that occur that might
 * 			be used to debug activities, but don't necessarily indicate a problem.
 * 
 * INFO - General logging level for indicating important changes of state in the
 * 			application, but not indicating problematic behavior.
 * 
 * WARN - A warning log. Used for warning about conditions or problems that may
 * 			exist or may eventually cause errors, but are not causing errors 
 * 			necessarily right now.
 * 
 * ERROR - An error log. The appropriate level for logging exceptional events during
 * 			the execution of the application that are problematic but aren't fatal.
 * 
 * FATAL - An error occurred that we were unable to handle. We use this to add logs
 * 			at points in the code where an error is not survivable. 
 *
 */
public class LoggerDemo {
	static Logger logger = Logger.getRootLogger();
	
	public static void main(String[] args) {
		logger.trace("This is a trace log.");
		logger.debug("This is a debug log.");
		logger.info("This is an info log.");
		logger.warn("Oh no, something isn't right..");
		logger.error("Ouch ow owie.");
		logger.fatal("Bye.");
	}
}








