package com.example.corekotlin.member

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component


@Component
class MemberServiceImpl(
    private val memberRepository: MemberRepository
): MemberService{

//
//    @Autowired
//    constructor(memberRepository: MemberRepository) {
//        this.memberRepository = memberRepository
//    }


    override fun join(member: Member) {
        memberRepository.save(member)
    }

    override fun findMember(memberId: Long): Member? {
        return memberRepository.findById(memberId)
    }
}