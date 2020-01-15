package com.globallogic.car.gateway

import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.cloud.gateway.route.builder.filters
import org.springframework.cloud.gateway.route.builder.routes
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class GatewayRoutes {

    @Bean
    fun carDashboardRoutes(routeLocatorBuilder: RouteLocatorBuilder): RouteLocator {
        return routeLocatorBuilder.routes {
            route {
                path("/api/**")
                filters {
                    stripPrefix(1)
                    prefixPath("/rest") }
                uri("http://localhost:8080")
            }
        }
    }

}