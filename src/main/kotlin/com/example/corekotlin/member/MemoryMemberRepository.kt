package com.example.corekotlin.member

import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository
import java.util.concurrent.ConcurrentHashMap

@Repository
class MemoryMemberRepository: MemberRepository {

    companion object {
        val store = mutableMapOf<Long, Member>()
        var handlerMap: MutableMap<Long, Member> = ConcurrentHashMap()
//        동시성 보장하는 맵
    }

    override fun save(member: Member) {
        store[member.id] = member
    }

    override fun findById(memberId: Long): Member? {
        return store[memberId]
    }
}