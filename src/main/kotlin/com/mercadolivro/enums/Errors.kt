package com.mercadolivro.enums

enum class Errors(val code: String, val message: String) {
    ML0001("ML-0001", "Book [%s] do not exists"),
    ML0010("ML-0010", "Can not change book with status [%s]"),

    ML0100("ML-0001", "Customer [%s] do not exists"),
    ML0101("ML-0101", "iNVALID REQUEST")

}
