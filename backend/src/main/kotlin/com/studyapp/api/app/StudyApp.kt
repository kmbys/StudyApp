package com.studyapp.api.app

import com.studyapp.api.service.StudyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StudyApp {
    @Autowired
    lateinit var service: StudyService

    @GetMapping("studies/000011110001")
    fun get(): StudyResponse {
        return service.find("000011110001").toResponse()
    }
}
