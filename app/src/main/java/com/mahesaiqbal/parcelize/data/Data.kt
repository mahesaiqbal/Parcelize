package com.mahesaiqbal.parcelize.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(
    val dummyString: String,
    val user: User
) : Parcelable