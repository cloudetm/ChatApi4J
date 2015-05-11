package net.sumppen.whatsapi4j;

import java.util.Map;

import net.sumppen.whatsapi4j.events.Event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingEventManager extends AbstractEventManager {

	private final Logger log = LoggerFactory.getLogger(LoggingEventManager.class);
	
	@Override
	public void fireEvent(String event, Map<String, Object> eventData) {
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		sb.append("Event "+event+": ");
		for(String key: eventData.keySet()) {
			if(!first) {
				sb.append(",");
			} else {
				first = false;
			}
			sb.append(key);
			sb.append("=");
			sb.append(eventData.get(key));
		}
		log.info(sb.toString());
	}

	public void fireEvent(Event event) {
		log.info(event.toString());
	}

}
