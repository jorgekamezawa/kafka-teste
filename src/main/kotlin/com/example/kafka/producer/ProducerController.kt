package com.example.kafka.producer

import com.example.kafka.domain.User
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("kafka-teste")
class ProducerController(
    @Value("\${topic}")
    private val topic: String,
    private val kafkaTemplate: KafkaTemplate<String, Any>
) {

    @PostMapping
    fun send(@RequestBody message: User): ResponseEntity<User> {
        kafkaTemplate.send(topic, message)
        return ResponseEntity.ok(message)
    }
}