package com.uns.ingeweekapp

import java.io.Serializable

data class Event(
    val day: String,
    val hour: String,
    val location: String,
    val topic: String,
    val speaker: String,
    val school: String
) : Serializable
