package com.maverick.dagger2cheezycode

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {

    /**
     * Factory Method
     */

    fun getUserRegistrationComponentFactory(): UserRegistrationComponent.Factory

    /**
     *  Component Builder
     */

//    fun getUserRegistrationComponentBuilder(): UserRegistrationComponent.Builder

}