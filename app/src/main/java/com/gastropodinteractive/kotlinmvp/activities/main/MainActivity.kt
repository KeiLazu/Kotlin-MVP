package com.gastropodinteractive.kotlinmvp.activities.main

import android.os.Bundle
import android.support.v4.app.Fragment
import com.gastropodinteractive.kotlinmvp.R
import com.gastropodinteractive.kotlinmvp.base.BaseActivity
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject

class MainActivity : BaseActivity(), IMainView {

    @Inject
    internal lateinit var presenter: IMainPresenter<IMainView>
    @Inject
    internal lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    override fun onFragmentAttached() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFragmentDetached(tag: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.onAttach(this)
    }
}
