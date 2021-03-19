package com.seine.main

import javax.inject.Inject

class UserEntity @Inject constructor() {
    var userName: String = ""
    var userAge: Int = 0
    var userNumber: Int = 0
}