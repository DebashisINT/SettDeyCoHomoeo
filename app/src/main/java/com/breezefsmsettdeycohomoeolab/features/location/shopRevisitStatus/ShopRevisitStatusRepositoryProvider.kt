package com.breezefsmsettdeycohomoeolab.features.location.shopRevisitStatus

import com.breezefsmsettdeycohomoeolab.features.location.shopdurationapi.ShopDurationApi
import com.breezefsmsettdeycohomoeolab.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}