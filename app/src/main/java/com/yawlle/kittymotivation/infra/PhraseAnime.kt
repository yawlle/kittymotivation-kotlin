package com.yawlle.kittymotivation.infra

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PhraseAnime (
    @Expose
    @SerializedName("anime")
    val anime: String,
    @Expose
    @SerializedName("quote")
    val quote: String
)

{
    override fun toString(): String {
        return quote + "  " + anime
    }
}