package com.example

import javax.ws.rs.GET
import javax.ws.rs.Path
import org.slf4j.LoggerFactory

@Path("/hello")
class ExampleResource {

    private val logger = LoggerFactory.getLogger(ExampleResource::class.java)

    @GET
    fun hello(): Response {
        logger.info("Calling hello")
        return Response("Hello from RESTEasy Reactive")
    }

    data class Response(
        val status: String
    )
}