package com.studyapp.api.repository

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface SectionRepository {

    @Select("""
        SELECT
            name,
            presenter,
            summary,
            resource_uri AS resourceUri,
            start_time AS startTime,
            end_time AS endTime
        FROM
            sections
        WHERE
            study_id = #{studyId} AND id = #{sectionId}
    """)
    fun find(studyId: String, sectionId: String): SectionDto
}
