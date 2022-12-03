package com.maverick.dagger2cheezycode

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    @SQLQualifier private val userRepository: UserRepository,
    @MessageQualifier private val notificationService: NotificationService,
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "no-reply@gmail.com", "User Registered")
    }
}