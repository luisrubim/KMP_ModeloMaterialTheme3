package org.example.projetomodelo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform