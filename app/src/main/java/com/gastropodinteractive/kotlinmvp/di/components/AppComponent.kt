package com.gastropodinteractive.kotlinmvp.di.components

import android.app.Application
import com.gastropodinteractive.kotlinmvp.MvpApp
import com.gastropodinteractive.kotlinmvp.di.builder.ActivityBuilder
import com.gastropodinteractive.kotlinmvp.di.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 *  Created by Kei Lazu on 8/6/2018
 *  check https://github.com/KeiLazu for more
 */
@Singleton
@Component (modules = [(AndroidInjectionModule::class), (AppModule::class), (ActivityBuilder::class), (AndroidSupportInjectionModule::class)])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
    fun application(application: Application): Builder

        fun build(): AppComponent

    }

    fun inject(app: MvpApp)

}