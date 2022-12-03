package com.maverick.dagger2cheezycode

import android.util.Log
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)
}

@ActivityScope
class SQLRepository @Inject constructor(private val analyticsService: AnalyticsService) :
    UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Saved in DB")
        analyticsService.trackEvent("Save User","CREATE_USER")
    }
}

class FirebaseRepository() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Saved in Firebase")
    }
}