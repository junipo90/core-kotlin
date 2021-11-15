package com.example.corekotlin.discount

import com.example.corekotlin.member.Grade
import com.example.corekotlin.member.Member
import org.springframework.stereotype.Component

@Component
class FixDiscountPolicy: DiscountPolicy {

    private val discountFixAmount = 1000;

    override fun discount(member: Member, price: Int): Int {
        return if (member.grade == Grade.VIP) {
            discountFixAmount
        } else {
            0
        }
    }
}