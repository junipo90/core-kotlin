package com.example.corekotlin.discount

import com.example.corekotlin.member.Member

interface DiscountPolicy {
    fun discount(member: Member, price: Int): Int
}