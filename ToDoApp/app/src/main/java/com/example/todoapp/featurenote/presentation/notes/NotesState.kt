package com.example.todoapp.featurenote.presentation.notes

import com.example.todoapp.featurenote.domain.model.Note
import com.example.todoapp.featurenote.domain.util.NoteOrder
import com.example.todoapp.featurenote.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)