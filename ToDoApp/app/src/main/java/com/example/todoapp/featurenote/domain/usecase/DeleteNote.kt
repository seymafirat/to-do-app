package com.example.todoapp.featurenote.domain.usecase

import com.example.todoapp.featurenote.domain.model.Note
import com.example.todoapp.featurenote.domain.repository.NoteRepository
import javax.inject.Inject

class DeleteNote @Inject constructor(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}