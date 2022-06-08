package com.example.configs

import com.fasterxml.jackson.databind.ObjectMapper
import io.quarkus.jackson.ObjectMapperCustomizer
import javax.inject.Singleton

@Singleton
class RegisterCustomModuleCustomizer : ObjectMapperCustomizer {

    override fun customize(objectMapper: ObjectMapper) {
    }

}