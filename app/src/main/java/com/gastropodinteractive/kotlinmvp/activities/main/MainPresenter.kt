package com.gastropodinteractive.kotlinmvp.activities.main

import com.gastropodinteractive.kotlinmvp.base.BasePresenter
import com.gastropodinteractive.kotlinmvp.utils.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 *  Created by Kei Lazu on 8/9/2018
 *  check https://github.com/KeiLazu for more
 */
class MainPresenter<V: IMainView>
    @Inject internal constructor(schedulerProvider: SchedulerProvider, compositeDisposable: CompositeDisposable)
    : BasePresenter<V>(schedulerProvider = schedulerProvider, compositeDisposable = compositeDisposable), IMainPresenter<V> {

    override fun onAttach(view: V?) {
        super.onAttach(view)
    }
}