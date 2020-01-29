package com.studyapp.api.app

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class SectionApp {
    @GetMapping("studies/000011110001/sections/001")
    fun get(): SectionResponse {
        return SectionResponse("Java初級",
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