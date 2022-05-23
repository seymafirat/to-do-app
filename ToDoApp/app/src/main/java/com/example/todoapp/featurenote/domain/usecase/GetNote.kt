package com.example.todoapp.featurenote.domain.usecase

import com.example.todoapp.featurenote.domain.model.Note
import com.example.todoapp.featurenote.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}