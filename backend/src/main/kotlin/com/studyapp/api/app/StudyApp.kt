package com.studyapp.api.app

import com.studyapp.api.domain.Study
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class StudyApp {
    @GetMapping("studies/000011110001")
    fun get(): StudyResponse {
        return Study("Java勉強会",
                LocalDateTime.of(2020, 7, 24, 13, 30),
                LocalDateTime.of(2020, 7, 24, 18, 0),
                listOf("001", "002", "003")).toResponse()
    }
}
