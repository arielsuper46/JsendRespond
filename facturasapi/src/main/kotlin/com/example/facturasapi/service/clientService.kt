package com.example.facturasapi.service

import com.example.facturasapi.model.client
import com.example.facturasapi.repository.clientRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.RSocket.Client
import org.springframework.stereotype.Service

@Service
class clientService {
    @Autowired
    lateinit var clientRepository: clientRepository

    fun save(client:client):client {
        return clientRepository.save(client)
    }
}