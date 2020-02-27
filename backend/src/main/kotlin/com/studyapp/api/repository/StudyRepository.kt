package com.studyapp.api.repository

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface StudyRepository {

    @Select("""
        SELECT
            id,
            name,
            place,
            start_time AS startTime,
            end_time AS endTime
        FROM
            studies
        WHERE
            id = #{id}
    """)
    fun find(id: String): StudyDto
}