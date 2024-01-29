package com.itami.weather_app.data.remote.dto

import com.google.gson.annotations.SerializedName

data class CityDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("country")
    val country: String,
)
