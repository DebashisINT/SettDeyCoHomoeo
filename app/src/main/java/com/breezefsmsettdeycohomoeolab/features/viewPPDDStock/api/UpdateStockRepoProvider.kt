package com.breezefsmsettdeycohomoeolab.features.viewPPDDStock.api

/**
 * Created by Saikat on 05-10-2018.
 */
object UpdateStockRepoProvider {
    fun provideOrderDetailsListRepository(): UpdateStockRepo {
        return UpdateStockRepo(UpdateStockApi.create())
    }
}