package com.example.corekotlin.order

import com.example.corekotlin.discount.DiscountPolicy
import com.example.corekotlin.member.MemberRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Service
class OrderServiceImpl(
    private val memberRepository: MemberRepository,
    private val discountPolicy: DiscountPolicy
): OrderService {

//    private val memberRepository: MemberRepository
//    private val DiscountPolicy: DiscountPolicy
//
//    @Autowired
//    constructor(memberRepository: MemberRepository, DiscountPolicy: DiscountPolicy) {
//        this.memberRepository = memberRepository
//        this.DiscountPolicy = DiscountPolicy
//    }


    override fun createOrder(memberId: Long, itemName: String, price: Int): Order {
        val member = memberRepository.findById(memberId)
        val discountPrice = member?.let { discountPolicy.discount(it, price) } ?: 0
        return Order(memberId, itemName, price, discountPrice)
    }
}