package com.maverick.dagger2cheezycode

import android.util.Log
import javax.inject.Inject

interface NotificationService {
    fun send(to: String, from: String, body: String?)
}

@ActivityScope
class EmailService @Inject constructor() : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d(TAG, "Email Sent")
    }
}

class MessageService(private val retryCount: Int) : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        if (retryCount == 0)
            Log.d(TAG, "Message Sent - Sent in First Attempt")
        else
            Log.d(TAG, "Message Sent - Retry Count $retryCount")
    }
}