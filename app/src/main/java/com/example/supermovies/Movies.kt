package com.example.supermovies

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movies(
    val imgMovie: Int,
    val titleMovie: String,
    val descMovie: String
) : Parcelable
