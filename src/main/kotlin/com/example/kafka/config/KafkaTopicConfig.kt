package com.example.kafka.config

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class KafkaTopicConfig(
    @Value("\${topic}")
    private val topic: String
) {

    @Bean
    fun topic1(): NewTopic {
//        return TopicBuilder.name(topic).build()
        return NewTopic(topic, 2, 1)
    }
}