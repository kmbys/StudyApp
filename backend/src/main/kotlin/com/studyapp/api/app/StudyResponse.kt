package com.studyapp.api.app

import java.time.LocalDateTime

data class StudyResponse(val name: String,
                         val startTime: String,
                         val endTime: String,
                         val sectionIds: List<String>)
