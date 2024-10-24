package com.example.facturasapi.controller

import com.example.facturasapi.model.client
import com.example.facturasapi.service.clientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.integration.IntegrationProperties
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/client")
class clientController {
    @Autowired
    lateinit var clientService: clientService

    @GetMapping
    fun list(): List<client> {
        return clientService.List()
    }
    @PostMapping
    fun save(@RequestBody client: client): client {
        return clientService.save(client)
    }
}