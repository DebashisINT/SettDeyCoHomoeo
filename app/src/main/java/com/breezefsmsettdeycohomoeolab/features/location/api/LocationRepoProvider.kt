package com.breezefsmsettdeycohomoeolab.features.location.api

import com.breezefsmsettdeycohomoeolab.features.location.shopdurationapi.ShopDurationApi
import com.breezefsmsettdeycohomoeolab.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}