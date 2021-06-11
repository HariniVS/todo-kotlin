package com.example.todo.model

data class Todo constructor(
    private var taskId: Int,
    private var taskName: String,
    private var completed: Boolean) {
}
