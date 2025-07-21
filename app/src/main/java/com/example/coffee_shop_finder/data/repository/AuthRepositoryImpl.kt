package com.example.coffee_shop_finder.data.repository

import com.example.coffee_shop_finder.data.mapper.AuthMapper
import com.example.coffee_shop_finder.data.remote.ApiService
import com.example.coffee_shop_finder.data.remote.model.LoginRequest
import com.example.coffee_shop_finder.data.remote.model.RegisterRequest
import com.example.coffee_shop_finder.domain.model.AuthCredentials
import com.example.coffee_shop_finder.domain.model.AuthToken
import com.example.coffee_shop_finder.domain.repository.AuthRepository
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : AuthRepository {

    override suspend fun login(credentials: AuthCredentials): AuthToken {
        val request = LoginRequest(
            login = credentials.login,
            password = credentials.password
        )
        val response = apiService.login(request)
        return AuthMapper.toDomain(response)
    }

    override suspend fun register(credentials: AuthCredentials): AuthToken {
        val request = RegisterRequest(
            login = credentials.login,
            password = credentials.password
        )
        val response = apiService.register(request)
        return AuthMapper.toDomain(response)
    }
}