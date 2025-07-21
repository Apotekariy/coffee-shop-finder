package com.example.coffee_shop_finder.data.remote

import com.example.coffee_shop_finder.data.remote.model.AuthResponse
import com.example.coffee_shop_finder.data.remote.model.LoginRequest
import com.example.coffee_shop_finder.data.remote.model.RegisterRequest
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("auth/login")
    suspend fun login(@Body request: LoginRequest): AuthResponse

    @POST("auth/register")
    suspend fun register(@Body request: RegisterRequest): AuthResponse
}