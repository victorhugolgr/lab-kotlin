package br.com.victorhugolgr.labkotlin.controller

import br.com.victorhugolgr.labkotlin.domain.Message
import br.com.victorhugolgr.labkotlin.service.MessageService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/message")
class MessageController(val messageService: MessageService) {
    @GetMapping
    fun findAll(): List<Message> = messageService.findMessages()
    @PostMapping
    fun save(@RequestBody message: Message) = messageService.post(message)
}

