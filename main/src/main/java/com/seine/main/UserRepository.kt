package com.seine.main

import javax.inject.Inject

class UserRepository @Inject constructor(val userEntity: UserEntity) {
}