package com.gastropodinteractive.kotlinmvp.di.components

import com.gastropodinteractive.kotlinmvp.di.builder.ActivityBuilder
import com.gastropodinteractive.kotlinmvp.di.modules.AppModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 *  Created by Kei Lazu on 8/6/2018
 *  check https://github.com/KeiLazu for more
 */
@Singleton
@Component (modules = [(AndroidInjectionModule::class), (AppModule::class), (ActivityBuilder::class)])
interface AppComponent {
}