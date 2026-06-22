package com.example.crochetboss

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow


class MainViewModel : ViewModel() {
    // Internal mutable state
    private val _counter = MutableStateFlow(0)

    // Public read-only state observed by MainActivity
    val counter: StateFlow<Int> = _counter.asStateFlow()

    // Business logic function
    fun incrementCounter() {
        _counter.value += 1
    }
}