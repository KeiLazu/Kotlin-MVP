package com.gastropodinteractive.kotlinmvp.activities.main

import dagger.Module
import dagger.Provides

/**
 *  Created by Kei Lazu on 8/9/2018
 *  check https://github.com/KeiLazu for more
 */
@Module
class MainActivityModule {

    @Provides
    internal fun provideMainPresenter(mainPresenter: MainPresenter<IMainView>): IMainPresenter<IMainView> = mainPresenter

}