package com.gastropodinteractive.kotlinmvp.base

/**
 *  Created by Kei Lazu on 8/9/2018
 *  check https://github.com/KeiLazu for more
 */
interface MvpPresenter<V : MvpView> {

    fun onAttach(view: V?)

    fun onDetach()

    fun getView(): V?

}