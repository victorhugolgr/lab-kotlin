package br.com.victorhugolgr.labkotlin.service

import br.com.victorhugolgr.labkotlin.domain.Message
import br.com.victorhugolgr.labkotlin.repository.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService(val messageRepository: MessageRepository) {
    fun findMessages(): List<Message> = messageRepository.findMessages()
    fun post(message: Message) = messageRepository.save(message)
}