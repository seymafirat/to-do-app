package com.example.todoapp.featurenote.domain.util

sealed class OrderType {
    object Ascending : OrderType()
    object Descending : OrderType()
}