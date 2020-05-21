package uk.co.nationwide.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

	 static final Logger logger = LogManager.getLogger(Log.class);
	 
//	 static {
//	        System.setProperty("log4j.configurationFile", "/home/aceuser/log4j2.xml");
//	 }
	 
	 public static void logging(String data) {
		
//		Level logLevel = logger.getLevel();
//		
//		String value = System.getProperty("log4j.configurationFile");
//		
		if (logger.isDebugEnabled()) {
			logger.debug("the built-in DEBUG level "+data);
		}
		if (logger.isErrorEnabled()) {
			logger.error("the built-in ERROR level "+data);
		}
		if (logger.isTraceEnabled()) {
			logger.trace("the built-in TRACE level "+data);
		}
		if (logger.isInfoEnabled()) {
			logger.info("the built-in INFO level "+data);
		}
		if (logger.isWarnEnabled()) {
			logger.warn("the built-in WARN level "+data);
		}
		if (logger.isFatalEnabled()) {
			logger.fatal("the built-in FATAL level "+data);
		}
	 }
}
