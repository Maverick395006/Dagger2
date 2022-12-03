package com.maverick.dagger2cheezycode

import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule() {

    @EmailQualifier
    @Provides
    @ActivityScope
    fun getEmailService(emailService: EmailService): NotificationService = emailService

    @MessageQualifier
    @Provides
    @ActivityScope
    fun getMessageService(): NotificationService = MessageService(3)
}