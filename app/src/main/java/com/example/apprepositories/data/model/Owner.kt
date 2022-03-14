package com.example.apprepositories.data.model

data class Owner(
    val login: String,
    @SerializedName("avatar_url")
    val avatarURL: String
)
