package com.example.corekotlin

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.FilterType

@Configuration
@ComponentScan(
    basePackages = ["com.example.corekotlin"],
    excludeFilters = [ComponentScan.Filter(type = FilterType.ANNOTATION, classes = arrayOf(Configuration::class))]
)
class AutoAppConfig {
}