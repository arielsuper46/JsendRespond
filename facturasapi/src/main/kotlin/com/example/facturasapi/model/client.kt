package com.example.facturasapi.model

import jakarta.annotation.Generated
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Table

@Entity
@Table(name = "client")

class client {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @id
    @Column(updatable = false)
    var id: Long? = null
    var nui: String? = null
    var fullname: String? = null
    var address: String? = null
}