package com.studyapp.api.app

import com.studyapp.api.service.StudyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class StudyApp {
    @Autowired
    lateinit var service: StudyService

    @CrossOrigin
    @GetMapping("studies/{id}")
    fun get(@PathVariable id: String): StudyResponse {
        return service.find(id).toResponse()
    }
}
