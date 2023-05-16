package Utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogUtility {
	Logger logger=LogManager.getLogger(LogUtility.class);
	public void info(String message)
	{
		logger.info(message);
	}
	public void error(String message)
	{
		logger.error(message);
	}
	public void Error(String message)
	{
		logger.error(message);
	}
}