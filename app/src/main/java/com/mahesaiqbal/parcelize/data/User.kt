package com.mahesaiqbal.parcelize.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val id: Int,
    val name: String,
    val age: Int,
    val about: String
) : Parcelable