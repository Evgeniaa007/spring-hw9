package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiGateway {
    public static void main(String[] args) {
        SpringApplication.run(ApiGateway.class, args);
    }

    @Bean
    public RouteLocator routeLocator (RouteLocatorBuilder builder){
        return builder.routes()
                .route("BoardGameCatalog",r->r.path("/boardgames/**")
                        .uri("http://localhost:8081/"))
                .route("ReviewServer",r->r.path("/reviews/**")
                        .uri("http://localhost:8082/")).build();

    }
}
