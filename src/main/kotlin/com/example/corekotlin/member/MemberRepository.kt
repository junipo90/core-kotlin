package com.example.corekotlin.member

interface MemberRepository {
    fun save(member: Member)
    fun findById(memberId: Long): Member?
}