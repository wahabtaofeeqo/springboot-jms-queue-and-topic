package com.example.jmsdemo;

import javax.jms.ConnectionFactory;
import javax.jms.TopicConnectionFactory;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@SpringBootApplication
public class JmsdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmsdemoApplication.class, args);
    }

    @Bean
    ActiveMQTopic mqTopic() {
        return new ActiveMQTopic();
    }
}
