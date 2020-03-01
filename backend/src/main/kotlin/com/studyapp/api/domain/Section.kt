package com.studyapp.api.domain

import com.studyapp.api.app.SectionResponse
import com.studyapp.api.repository.SectionDto
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Section(private val name: String,
              private val presenter: String,
              private val summary: String,
              private val resourceUri: String,
              private val startTime: LocalDateTime,
              private val endTime: LocalDateTime) {

    constructor(dto: SectionDto) : this(
            dto.name,
            dto.presenter,
            dto.summary,
            dto.resourceUri,
            LocalDateTime.parse(dto.startTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
            LocalDateTime.parse(dto.endTime,  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
    )

    fun toResponse(): SectionResponse {
        return SectionResponse(
                name,
                presenter,
                summary,
                resourceUri,
                startTime.format(DateTimeFormatter.ofPattern("H:mm")),
                endTime.format(DateTimeFormatter.ofPattern("H:mm"))
        )
    }
}
