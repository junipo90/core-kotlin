package com.example.corekotlin.member

interface MemberService {
    fun join(member: Member)
    fun findMember(memberId: Long): Member?
}