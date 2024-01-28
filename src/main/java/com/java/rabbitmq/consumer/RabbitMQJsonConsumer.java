package com.java.rabbitmq.consumer;

import com.java.rabbitmq.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQJsonConsumer.class);

    @RabbitListener(queues = {"${rabbitmq.queue.json_name}"})
    public void jsonMessageConsumer(User user) {
        LOGGER.info(String.format("Received JSON message -> %s", user.toString()));
    }
}
