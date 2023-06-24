package com.rubabe.figmatask.model

import java.io.Serializable

data class TopDoctorsModel(
    var image: Int,
    var text1: String,
    var text2: String,
    var text3: String,
    var text6: String,
    var buttonText: String
) : Serializable