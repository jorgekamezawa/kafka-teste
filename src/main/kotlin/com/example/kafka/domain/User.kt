package com.example.kafka.domain

import java.io.Serializable
import java.math.BigDecimal

data class User(
    val id: Long,
    val nome: String,
    val salario: BigDecimal
) : Serializable
