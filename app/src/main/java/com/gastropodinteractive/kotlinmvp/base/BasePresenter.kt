package com.gastropodinteractive.kotlinmvp.base

import com.gastropodinteractive.kotlinmvp.utils.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable

/**
 *  Created by Kei Lazu on 8/9/2018
 *  check https://github.com/KeiLazu for more
 */
abstract class BasePresenter<V: MvpView>
        internal
        constructor(protected var schedulerProvider: SchedulerProvider, protected var compositeDisposable: CompositeDisposable)
        : MvpPresenter<V> {

    private var view: V? = null
    private val isViewAttached: Boolean get() = view != null

    override fun onAttach(view: V?) {
        this.view = view
    }

    override fun onDetach() {
        compositeDisposable.dispose()
        view = null
    }

    override fun getView(): V? = view

}