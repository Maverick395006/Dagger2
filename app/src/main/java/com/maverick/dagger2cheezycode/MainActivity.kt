package com.maverick.dagger2cheezycode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    @Inject
    lateinit var emailService1: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as UserApplication).appComponent
        val userRegistrationServiceComponent = appComponent.getUserRegistrationComponentFactory().create(3)
//        val userRegistrationServiceComponent = appComponent.getUserRegistrationComponentBuilder().retryCount(3).build()
        userRegistrationServiceComponent.inject(this)

        userRegistrationService.registerUser("abcd@gmail.com","11111")
    }
}