package com.operate.config.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.MessageChannel;

public interface SinkSender {
	
	@Output(Sink.INPUT)
	MessageChannel output();

}
