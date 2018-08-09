package com.gastropodinteractive.kotlinmvp.di.modules

import android.app.Application
import android.content.Context
import com.gastropodinteractive.kotlinmvp.utils.SchedulerProvider
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

/**
 *  Created by Kei Lazu on 8/6/2018
 *  check https://github.com/KeiLazu for more
 */
@Module
class AppModule {

    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context = application

    @Provides
    internal fun provideSchedulerProvider(): SchedulerProvider = SchedulerProvider()

    @Provides
    internal fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()

}