package com.gastropodinteractive.kotlinmvp.base

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import dagger.android.support.AndroidSupportInjection

/**
 *  Created by Kei Lazu on 8/9/2018
 *  check https://github.com/KeiLazu for more
 */
abstract class BaseFragment: Fragment() , MvpView {

    private var parentActivity: BaseActivity? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is BaseActivity) {
            val activity = context as BaseActivity?
            this.parentActivity = activity
            activity?.onFragmentAttached()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDependencyInjection()
        setHasOptionsMenu(false)

    }

    private fun performDependencyInjection() = AndroidSupportInjection.inject(this)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUp()
    }

    fun getBaseActivity() = parentActivity

    abstract fun setUp()

    interface Callback {
        fun onFragmentAttached()
        fun onFragmentDetached(tag: String)
    }

}