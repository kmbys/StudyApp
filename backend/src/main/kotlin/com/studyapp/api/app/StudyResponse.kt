package com.studyapp.api.app

import java.time.LocalDateTime

data class StudyResponse(val name: String, val startTime: LocalDateTime, val endTime: LocalDateTime, val sectionIds: List<String>)
