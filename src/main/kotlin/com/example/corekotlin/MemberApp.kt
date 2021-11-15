package com.example.corekotlin

import com.example.corekotlin.member.MemberService
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class MemberApp {

    fun main(args: Array<String>) {


//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
        val applicationContext: ApplicationContext = AnnotationConfigApplicationContext(AutoAppConfig::class.java)
        val memberService: MemberService = applicationContext.getBean("memberService", MemberService::class.java)


    }

}