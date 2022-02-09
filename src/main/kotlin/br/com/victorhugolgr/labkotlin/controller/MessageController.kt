package br.com.victorhugolgr.labkotlin.controller

import br.com.victorhugolgr.labkotlin.domain.Message
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController {
    @GetMapping
    fun index(): List<Message> = listOf(
        Message("1", "Hello!"),
        Message(text = "Bonjour!", id = "2"),

        )
}

