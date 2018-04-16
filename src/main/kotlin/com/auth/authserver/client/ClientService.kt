package com.auth.authserver.client

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class ClientService {

    @Autowired
    lateinit var clientRepository: ClientRepository

    fun getAllClients(): List<Client> = clientRepository?.findAll()

    fun findClient(id: String): Client = clientRepository?.findById(id).orElse(null)

}