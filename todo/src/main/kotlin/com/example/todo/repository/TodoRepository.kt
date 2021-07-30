package com.example.todo.repository

import com.example.todo.model.Todo
import org.springframework.stereotype.Service

@Service
class TodoRepository {
    fun getAllTodos(): List<Todo> {
        return listOf(Todo(1, "Read many books today", false), Todo(2, "Hit the gym", true))
    }
}
