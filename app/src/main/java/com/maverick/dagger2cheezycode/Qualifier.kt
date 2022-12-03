package com.maverick.dagger2cheezycode

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier
/**
 * Custom Annotation to avoid Typo
 */

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class EmailQualifier()
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class MessageQualifier()
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class SQLQualifier()
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class FirebaseQualifier()