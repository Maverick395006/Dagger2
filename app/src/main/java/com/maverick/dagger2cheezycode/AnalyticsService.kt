package com.maverick.dagger2cheezycode

import android.util.Log
import javax.inject.Inject

interface AnalyticsService {
    fun trackEvent(eventName: String, eventType: String)
}

class MixPanel @Inject constructor() : AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, "MixPanel - $eventName - $eventType")
    }
}

class FirebaseAnalytics : AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, "FirebaseAnalytics - $eventName - $eventType")
    }
}