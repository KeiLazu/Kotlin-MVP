package com.gastropodinteractive.kotlinmvp

import android.app.Activity
import android.app.Application
import com.gastropodinteractive.kotlinmvp.di.components.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 *  Created by Kei Lazu on 8/6/2018
 *  check https://github.com/KeiLazu for more
 */

class MvpApp : Application(), HasActivityInjector {

    @Inject
    lateinit internal var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector() = activityDispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this)
    }

}