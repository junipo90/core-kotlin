package com.example.corekotlin.order

interface OrderService {
    fun createOrder(memberId: Long, itemName: String, price: Int): Order
}