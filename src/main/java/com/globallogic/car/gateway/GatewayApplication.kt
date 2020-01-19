package com.globallogic.car.gateway


import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient


@SpringBootApplication
@EnableDiscoveryClient
class GatewayApplication

fun main() {
    SpringApplication.run(GatewayApplication::class.java)
}


