package com.example.corekotlin.common

import org.springframework.context.annotation.Scope
import org.springframework.context.annotation.ScopedProxyMode
import org.springframework.stereotype.Component
import java.util.*
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
class MyLogger{

    private var uuid: String? = null
    private var requestURL: String? = null

    fun log(message: String) {
        println("[$uuid] [$requestURL] $message")
    }

    fun setRequestURL(requestURL: String) {
        this.requestURL = requestURL
    }

    @PostConstruct
    fun init() {
        uuid = UUID.randomUUID().toString()
        println("[$uuid] request scope bean create : $this")
    }

    @PreDestroy
    fun destroy() {
        println("[$uuid] request scope bean close : $this")
    }

}