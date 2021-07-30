package com.example.todo.controller

import com.example.todo.model.Todo
import com.example.todo.repository.TodoRepository
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.collections.shouldContainAll
import io.kotest.matchers.collections.shouldHaveSize
import io.mockk.every
import io.mockk.mockk
import io.mockk.unmockkAll
import io.mockk.verify

class TodoListControllerTest : DescribeSpec({

    lateinit var mockTodoRepository: TodoRepository
    lateinit var todoController: TodoListController

    beforeTest {
        mockTodoRepository = mockk()
        todoController = TodoListController(mockTodoRepository)
    }

    describe("Test TODO controller endpoints") {
        it("should get all the TODOs") {
            val listOfExpectedTodos = listOf(Todo(1, "Read a book", false), Todo(2, "Hit the gym", true))
            every { mockTodoRepository.getAllTodos() } returns listOfExpectedTodos

            val allTodos = todoController.getAllTodos()

            verify { mockTodoRepository.getAllTodos() }
            allTodos.shouldContainAll(listOfExpectedTodos)
            allTodos.shouldHaveSize(2)
        }
    }

    afterTest { (_, _) ->
        unmockkAll()
    }
})
