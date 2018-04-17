package com.auth.authserver.client

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "oauth_client_details")
data class Client(
        @Id
        val clientId: String? = null,

        val resourceIds: String? = null,

        val clientSecret: String? = null,

        val scope: String? = null,

        val authorizedGrantTypes: String? = null,

        val webServerRedirectUri: String? = null,

        val authorities: String? = null,

        val accessTokenValidity: Int? = null,

        val refreshTokenValidity: Int? = null,

        val additionalInformation: String? = null,

        val autoApprove: String? = null
)