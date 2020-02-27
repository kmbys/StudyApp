package com.studyapp.api.repository

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface SectionRepository {

    @Select("""
        SELECT
            name,
            display_name AS presenter,
            summary,
            resource_uri AS resourceUri,
            start_time AS startTime,
            end_time AS endTime
        FROM
            sections,
            accounts
        WHERE
            study_id = #{studyId} AND
            id = #{sectionId} AND
            sections.presenter = accounts.email
    """)
    fun find(studyId: String, sectionId: String): SectionDto

    @Select("""
        SELECT
            id
        FROM
            sections
        WHERE
            study_id = #{studyId}
    """)
    fun findSectionIds(studyId: String): List<String>
}
