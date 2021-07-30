package com.example.todo.consumer

import com.example.todo.model.Todo
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class TodoConsumer {
    @KafkaListener(topics = ["todo"])
    fun consumeTodos(todo: Todo) {
        println("Todo received $todo")
    }
}
