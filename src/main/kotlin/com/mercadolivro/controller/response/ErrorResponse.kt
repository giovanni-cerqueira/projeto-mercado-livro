package com.mercadolivro.controller.response

import com.mercadolivro.enums.BookStatus
import com.mercadolivro.model.CustomerModel
import java.math.BigDecimal

data class ErrorResponse(
    var httpCode: Int,
    var message: String,
    var internalCode: String,
    var erros: List<FieldErrorResponse>?
)