package com.studyapp.api.service

import com.studyapp.api.domain.Study
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class StudyService {
    fun find(id: String): Study {
        return Study("Java勉強会",
                LocalDateTime.of(2020, 7, 24, 13, 30),
                LocalDateTime.of(2020, 7, 24, 18, 0),
                listOf("001", "002", "003"))
    }
}