package consoleLogsPackage;

import org.apache.log4j.Logger;
/*
 * Generating HTML log report, Sending log report through mail, Logs write to a logs file*
 * In this Program we will use below files
	SecureSMTPAppender.java --> This program is used for to mail the error logs
	log4j.logs --> All logs are filed in this file
	log4j.xml --> log4j configuration file. in this file we need to configure all details in file appendar, html appendar, Email appendar, Console appander
	log4j.jar,mail.jar --> These are the supported jars
	log.html --> log report should generate after execution of the program
 */
public class ConsoleLogs {
	
	static Logger log = Logger.getLogger(ConsoleLogs.class);

	public static void main(String[] args) {
		
		log.debug("This is Debug log");
		log.info("This is info log");
		log.error("This is error log");
		
	}

}
