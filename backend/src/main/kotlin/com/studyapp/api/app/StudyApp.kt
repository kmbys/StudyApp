package com.studyapp.api

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

@RestController
class StudyApp {
    @GetMapping
    fun get(): String {
        return "Hello, World"
    }
}
