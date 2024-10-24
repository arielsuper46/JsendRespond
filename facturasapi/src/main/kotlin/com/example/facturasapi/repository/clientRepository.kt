package com.example.facturasapi.repository

import org.springframework.boot.autoconfigure.integration.IntegrationProperties.RSocket.Client
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface clientRepository:JpaRepository<Client, Long> {

}