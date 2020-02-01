package com.studyapp.api.app

import com.studyapp.api.service.SectionService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SectionApp {
    @GetMapping("studies/000011110001/sections/001")
    fun get(): SectionResponse {
        return SectionService().find("000011110001", "001").toResponse()
    }
}