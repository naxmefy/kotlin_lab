package me.nax.examples

import io.ktor.server.application.*
import io.ktor.server.netty.*
import me.nax.examples.plugins.configureRouting

fun main(args: Array<String>): Unit = EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    configureRouting()
}
