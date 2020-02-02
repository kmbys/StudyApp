package com.studyapp.api.app

import com.studyapp.api.service.SectionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class SectionApp {

    @Autowired
    lateinit var service: SectionService

    @GetMapping("studies/{studyId}/sections/{sectionId}")
    fun get(@PathVariable studyId: String, @PathVariable sectionId: String): SectionResponse {
        return service.find(studyId, sectionId).toResponse()
    }
}