package com.example.facturasapi.controller

import com.example.facturasapi.entity.Client
import com.example.facturasapi.repository.ClientRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/client")
class ClientController(private val clientRepository: ClientRepository) {

    @PostMapping
    fun createClient(@RequestBody client: Client): ResponseEntity<Client> {
        val savedClient = clientRepository.save(client)
        return ResponseEntity(savedClient, HttpStatus.CREATED)
    }

    @GetMapping("/{id}")
    fun getClientById(@PathVariable id: Long): ResponseEntity<Client> {
        val client = clientRepository.findById(id)
        return if (client.isPresent) {
            ResponseEntity(client.get(), HttpStatus.OK)
        } else {
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }

    @GetMapping("/nui/{nui}")
    fun getClientByNui(@PathVariable nui: String): ResponseEntity<Client> {
        val client = clientRepository.findByNui(nui)
        return if (client != null) {
            ResponseEntity(client, HttpStatus.OK)
        } else {
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }
}
