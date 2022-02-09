package br.com.victorhugolgr.labkotlin.repository

import br.com.victorhugolgr.labkotlin.domain.Message
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface MessageRepository: CrudRepository<Message, String> {
    @Query("select m from Message m")
    fun findMessages(): List<Message>
}