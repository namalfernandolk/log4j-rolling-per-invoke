package log4j.hotel.interfaces;

import java.util.UUID;

import log4j.hotel.Log4jFileLogger;

public class HBSIImpl implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			Log4jFileLogger.logData("<RESPONSE><HBSI_RS><RESPONSE>","hbsi|Availabiity|Response|"+UUID.randomUUID());
		}

	}
}
