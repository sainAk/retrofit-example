package io.github.sainak.marsrealestate.network

import androidx.annotation.Keep
import com.squareup.moshi.Json

@Keep
data class MarsProperty(
    val id: String,
    @Json(name = "img_src") val imgSrcUrl: String,
    val type: String,
    val price: Double
)
