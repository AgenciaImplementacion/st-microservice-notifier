package com.ai.st.microservice.notifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class StMicroserviceNotifierApplicationStartup implements ApplicationListener<ContextRefreshedEvent> {

	private static final Logger log = LoggerFactory.getLogger(StMicroserviceNotifierApplicationStartup.class);

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		log.info("ST - Loading ... ");
	}

}
