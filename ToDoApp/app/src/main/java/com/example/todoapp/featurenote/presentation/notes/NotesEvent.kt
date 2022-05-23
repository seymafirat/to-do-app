package com.example.todoapp.featurenote.presentation.notes

import com.example.todoapp.featurenote.domain.model.Note
import com.example.todoapp.featurenote.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSection : NotesEvent()
}