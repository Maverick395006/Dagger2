package com.maverick.dagger2cheezycode

import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModule {

    @FirebaseQualifier
    @Provides
    @ActivityScope
    fun getFirebaseRepository(): UserRepository = FirebaseRepository()

    @SQLQualifier
    @Provides
    @ActivityScope
    fun getSQlRepository(sqlRepository: SQLRepository): UserRepository = sqlRepository
}