package com.mcoders.vyanjanvidhi

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform