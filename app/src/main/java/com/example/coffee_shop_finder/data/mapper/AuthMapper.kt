package com.example.coffee_shop_finder.data.mapper

import com.example.coffee_shop_finder.data.remote.model.AuthResponse
import com.example.coffee_shop_finder.domain.model.AuthToken

object AuthMapper {
    fun toDomain(apiResponse: AuthResponse): AuthToken {
        return AuthToken(
            token = apiResponse.token,
            tokenLifeTime = apiResponse.tokenLifeTime
        )
    }
}