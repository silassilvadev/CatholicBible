package com.studies.catholicbible.model.entity

import java.io.Serializable

open class Verse(var number: Int,
                 var text: String,
                 var isFavorite: Boolean = false,
                 var isSelected: Boolean = false): Serializable