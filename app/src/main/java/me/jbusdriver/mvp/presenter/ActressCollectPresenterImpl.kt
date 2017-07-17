package me.jbusdriver.mvp.presenter

import me.jbusdriver.common.CollectManager
import me.jbusdriver.mvp.ActressCollectContract
import me.jbusdriver.mvp.bean.ActressInfo

class ActressCollectPresenterImpl : BaseAbsDataPresenter<ActressCollectContract.ActressCollectView,ActressInfo>(), ActressCollectContract.ActressCollectPresenter {

    override fun onFirstLoad() {
    }

    override fun getData() = CollectManager.actress_data

    override fun onStart(firstStart: Boolean) {
        super.onStart(firstStart)
        onRefresh()
    }
}