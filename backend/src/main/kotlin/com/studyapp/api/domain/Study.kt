package com.studyapp.api.domain

import com.studyapp.api.app.StudyResponse
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Study(private val name: String, private val startTime: LocalDateTime,
            private val endTime: LocalDateTime, private val sectionIds: List<String>) {

    fun toResponse(): StudyResponse {
        return StudyResponse(name,
                startTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm")),
                endTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm")),
                sectionIds)
    }
}