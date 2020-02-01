package com.studyapp.api.domain

import com.studyapp.api.app.SectionResponse
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Section(private val name: String,
              private val presenter: String,
              private val summary: String,
              private val resourceUri: String,
              private val startTime: LocalDateTime,
              private val endTime: LocalDateTime) {

    fun toResponse(): SectionResponse {
        return SectionResponse(name,
                presenter,
                summary,
                resourceUri,
                startTime.format(DateTimeFormatter.ofPattern("H:mm")),
                endTime.format(DateTimeFormatter.ofPattern("H:mm")))
    }
}
