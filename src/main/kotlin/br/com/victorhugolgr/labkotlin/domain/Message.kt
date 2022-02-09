package br.com.victorhugolgr.labkotlin.domain

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="MESSAGE")
data class Message(@Id val id: String?, val text:String)