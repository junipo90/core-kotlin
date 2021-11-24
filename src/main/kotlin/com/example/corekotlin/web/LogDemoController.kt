package com.example.corekotlin.web

import com.example.corekotlin.common.MyLogger
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import javax.servlet.http.HttpServletRequest

@Controller
class LogDemoController(
    private val logDemoService: LogDemoService,
    private val myLogger: MyLogger
) {

    @RequestMapping("logDemo")
    @ResponseBody
    fun logDemo(request: HttpServletRequest): String {
        val requestURL = request.requestURL.toString()
        myLogger.setRequestURL(requestURL)

        myLogger.log("controller test")
        logDemoService.logic("testId")

        return "OK"
    }
}