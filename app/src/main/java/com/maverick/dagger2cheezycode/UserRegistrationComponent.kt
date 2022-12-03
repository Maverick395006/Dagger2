package com.maverick.dagger2cheezycode

import dagger.BindsInstance
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    /**
     * Factory Method
     */

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance retryCount: Int): UserRegistrationComponent
    }

    /**
     *  Component Builder
     */

//    @Subcomponent.Builder
//    interface Builder {
//        fun build(): UserRegistrationComponent
//        fun retryCount(@BindsInstance retryCount: Int): Builder
//    }

}