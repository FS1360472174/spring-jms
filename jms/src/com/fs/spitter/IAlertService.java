package com.fs.spitter;

import javax.jms.Destination;

public interface IAlertService {
	void sendSpittleAlert(Destination destination,String message);
}
