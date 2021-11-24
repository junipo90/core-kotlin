package com.example.corekotlin.web

import com.example.corekotlin.common.MyLogger
import org.springframework.stereotype.Service

@Service
class LogDemoService (
    private val myLogger: MyLogger
        ){

    fun logic(id: String) {
        myLogger.log("service Id : $id")
    }
}