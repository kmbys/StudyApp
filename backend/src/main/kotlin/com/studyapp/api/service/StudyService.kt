package com.studyapp.api.service

import com.studyapp.api.domain.Study
import com.studyapp.api.repository.SectionRepository
import com.studyapp.api.repository.StudyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudyService {

    @Autowired
    lateinit var studyRepository: StudyRepository

    @Autowired
    lateinit var sectionRepository: SectionRepository

    fun find(id: String): Study {
        return Study(studyRepository.find(id),
                sectionRepository.findSectionIds(id))
    }
}