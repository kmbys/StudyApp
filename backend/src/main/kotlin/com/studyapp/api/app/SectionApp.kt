package com.studyapp.api.app

import com.studyapp.api.service.SectionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SectionApp {

    @Autowired
    lateinit var service: SectionService

    @GetMapping("studies/000011110001/sections/001")
    fun get(): SectionResponse {
        return service.find("000011110001", "001").toResponse()
    }
}