package jreichwald.dhbw.vs;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Implementation of a simple tcp client 
 * @author Prof. Dr. Julian Reichwald <julian.reichwald@dhbw-mannheim.de>
 *
 */
public class JAXBTCPClient {

	/**
	 * Log Instance 
	 */
	private static Logger _log = LogManager.getLogger(JAXBTCPClient.class);
	
	/**
	 * Main Method 
	 * @param args
	 */
	public static void main(String[] args) {
		_log.debug("Client starting.");

		Message msg = new Message(); 
		msg.setMessageId(42);
		msg.setMessageText("Das hier ist eine Testnachricht");
		msg.setMessageValue(47.11);

		try {
			_log.debug("Trying to connect to server ....");
			Socket client = new Socket("localhost",11111);
			
			_log.debug("Connection established.");
			
			JAXBContext ctx = JAXBContext.newInstance(Message.class);
			Marshaller marshaller = ctx.createMarshaller();
			marshaller.marshal(msg, client.getOutputStream());
			client.getOutputStream().flush();
			
			
			
		
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JAXBException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}

}
