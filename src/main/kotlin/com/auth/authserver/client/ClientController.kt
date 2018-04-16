package com.auth.authserver.client

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * Exposes rest api endpoints to modify clients ie add, delete, and also get clients.
 *
 */
@RequestMapping(value = "oauth")
@RestController
class ClientController {

    @Autowired
    lateinit var clientService: ClientService

    @GetMapping(value = "client")
    fun getClients(): List<Client>? = clientService?.getAllClients()

    @GetMapping(value = "client/{id}")
    fun getClientById(@PathVariable("id") id: String): Client? = clientService?.findClient(id)
}