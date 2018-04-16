package com.auth.authserver.client

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "oauth_client_details")
data class Client(@Id val clientId: String)