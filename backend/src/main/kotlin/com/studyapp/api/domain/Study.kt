package com.studyapp.api.domain

import com.studyapp.api.app.StudyResponse
import com.studyapp.api.repository.StudyDto
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Study(private val name: String, private val startTime: LocalDateTime,
            private val endTime: LocalDateTime, private val sectionIds: List<String>) {

    constructor(studyDto: StudyDto, sectionIds: List<String>) : this(
            studyDto.name,
            LocalDateTime.parse(studyDto.startTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
            LocalDateTime.parse(studyDto.endTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
            sectionIds
    )

    fun toResponse(): StudyResponse {
        return StudyResponse(name,
                startTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd H:mm")),
                endTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd H:mm")),
                sectionIds)
    }
}