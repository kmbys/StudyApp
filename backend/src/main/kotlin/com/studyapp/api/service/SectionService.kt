package com.studyapp.api.service

import com.studyapp.api.domain.Section
import java.time.LocalDateTime

class SectionService {
    fun find(studyId: String, sectionId: String): Section {
        return Section("Java初級",
                "相良　涼介",
                """# Java構文
                    |Javaを使ったプログラムを記述する上で必要となるJavaの構文を1つ1つ確認していきます。
                    |- Javaの基本事項
                    |- スクリプトの記述
                    |- 単項マイナス演算子
                """.trimMargin(),
                "http://www.wakhok.ac.jp/~tatsuo/java2005/2shuu/java1-2.ppt",
                LocalDateTime.of(2020, 7, 24, 14, 0),
                LocalDateTime.of(2020, 7, 24, 15, 0))
    }
}