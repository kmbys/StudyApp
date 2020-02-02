package com.studyapp.api.app

import java.time.LocalDateTime

data class SectionResponse(val name: String,
                           val presenter: String,
                           val summary: String,
                           val resourceUri: String,
                           val startTime: String,
                           val endTime: String)
