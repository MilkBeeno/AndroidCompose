package com.seine.main

import dagger.Component

@Component
interface ApplicationGraph {
    fun repository(): UserRepository
}