package com.example.todo.controller

import com.example.todo.model.Todo
import com.example.todo.repository.TodoRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoListController(private val todoRepository: TodoRepository) {
    @GetMapping("/todos")
    fun getAllTodos() : List<Todo> {
        return todoRepository.getAllTodos()
    }
}
