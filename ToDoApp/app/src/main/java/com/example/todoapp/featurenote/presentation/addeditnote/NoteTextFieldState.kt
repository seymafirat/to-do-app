package com.example.todoapp.featurenote.presentation.addeditnote

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)