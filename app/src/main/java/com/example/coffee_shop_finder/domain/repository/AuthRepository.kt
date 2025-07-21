package com.example.coffee_shop_finder.domain.repository

import com.example.coffee_shop_finder.domain.model.AuthCredentials
import com.example.coffee_shop_finder.domain.model.AuthToken

interface AuthRepository {
    suspend fun login(credentials: AuthCredentials): AuthToken
    suspend fun register(credentials: AuthCredentials): AuthToken
}