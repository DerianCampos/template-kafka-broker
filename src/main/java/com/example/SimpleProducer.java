package com.example;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import java.util.Properties;

public class SimpleProducer {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        try (KafkaProducer<String, String> producer = new KafkaProducer<>(props)) {
            // Send to the first topic
            producer.send(new ProducerRecord<>("my-topic", "key", "Hello, Kafka this is a new log!"));

            // Send to the second topic
            producer.send(new ProducerRecord<>("second-topic", "key", "Hello, this is a message for the second topic!"));
        }

    }
}
