package com.example.corekotlin.discount

import com.example.corekotlin.member.Grade
import com.example.corekotlin.member.Member
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Component
@Primary
class RateDiscountPolicy: DiscountPolicy {

    private val discountPercent = 10

    override fun discount(member: Member, price: Int): Int {
        return if (member.grade == Grade.VIP) {
            price * discountPercent / 100
        } else {
            0
        }
    }
}