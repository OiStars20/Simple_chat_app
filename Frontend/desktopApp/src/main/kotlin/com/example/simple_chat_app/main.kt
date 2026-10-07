package com.example.simple_chat_app

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Simple_chat_app",
    ) {
        App()
    }
}