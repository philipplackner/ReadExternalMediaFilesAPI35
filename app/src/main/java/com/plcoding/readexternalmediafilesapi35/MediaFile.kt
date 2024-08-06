package com.plcoding.readexternalmediafilesapi35

import android.net.Uri

data class MediaFile(
    val uri: Uri,
    val name: String,
    val type: MediaType
)
