package com.studyapp.api.service

import com.studyapp.api.domain.Study
import com.studyapp.api.repository.StudyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class StudyService {

    @Autowired
    lateinit var repository: StudyRepository

    fun find(id: String): Study {
        return Study(repository.find(id),
                listOf("001", "002", "003"))
    }
}