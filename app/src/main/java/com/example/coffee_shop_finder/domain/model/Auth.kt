package com.example.coffee_shop_finder.domain.model

data class AuthCredentials(
    val login: String,
    val password: String
)

data class AuthToken(
    val token: String,
    val tokenLifeTime: Long
)
