package com.example.todo.repository

import com.example.todo.model.Todo
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.collections.shouldContainAll

class TodoRepositoryTest() : AnnotationSpec() {

    private lateinit var todoRepository : TodoRepository

    @Before
    fun setUp() {
        todoRepository = TodoRepository()
    }

    @Test
    internal fun shouldGetAllTodos() {
        val listOfExpectedTodos = listOf(Todo(1, "Read a book", false), Todo(2, "Hit the gym", true))

        val allTodos = todoRepository.getAllTodos()

        allTodos.shouldContainAll(listOfExpectedTodos)
    }
}
