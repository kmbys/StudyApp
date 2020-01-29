package com.studyapp.api

import com.studyapp.api.app.StudyResponse
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import java.time.LocalDateTime

@RestController
class StudyApp {
    @GetMapping("studies/000011110001")
    fun get(): StudyResponse {
        return StudyResponse("Java勉強会",
                LocalDateTime.of(2020, 7, 24, 13, 30),
                LocalDateTime.of(2020, 7, 24, 18, 0),
                listOf("001", "002", "003"))
    }
}
