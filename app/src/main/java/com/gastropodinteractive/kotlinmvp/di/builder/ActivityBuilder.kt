package com.gastropodinteractive.kotlinmvp.di.builder

import com.gastropodinteractive.kotlinmvp.activities.main.MainActivity
import com.gastropodinteractive.kotlinmvp.activities.main.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 *  Created by Kei Lazu on 8/6/2018
 *  check https://github.com/KeiLazu for more
 */

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [
        (
                MainActivityModule::class
                )])
    abstract fun bindMainActivity(): MainActivity

}