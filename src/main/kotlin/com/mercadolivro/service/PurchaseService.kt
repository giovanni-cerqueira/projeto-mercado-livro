package com.mercadolivro.service

import com.mercadolivro.events.PurchaseEvent
import com.mercadolivro.model.PurchaseModel
import com.mercadolivro.repository.PurchaseRepository
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service

@Service
class PurchaseService(

    val purchaseRepository: PurchaseRepository,
    val applicationEventPublisher: ApplicationEventPublisher

) {

    fun create (request: PurchaseModel){
        purchaseRepository.save(request)

        applicationEventPublisher.publishEvent(PurchaseEvent(this, request))
    }
}
