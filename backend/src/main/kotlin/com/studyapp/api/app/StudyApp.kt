package com.studyapp.api.app

import com.studyapp.api.service.StudyService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StudyApp {
    @GetMapping("studies/000011110001")
    fun get(): StudyResponse {
        return StudyService().find("000011110001").toResponse()
    }
}
