import org.apache.logging.log4j.*;

public class Log4jTutorial {

	private static Logger Log = LogManager.getLogger(Log4jTutorial.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Log.debug("I am debugging");
		Log.error("object is not present");
		Log.info("object is present");
		Log.fatal("This is fatal");

	}

}
