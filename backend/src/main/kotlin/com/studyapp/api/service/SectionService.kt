package com.studyapp.api.service

import com.studyapp.api.domain.Section
import com.studyapp.api.repository.SectionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SectionService {

    @Autowired
    lateinit var repository: SectionRepository

    fun find(studyId: String, sectionId: String): Section {
        return Section(repository.find(studyId, sectionId))
    }
}