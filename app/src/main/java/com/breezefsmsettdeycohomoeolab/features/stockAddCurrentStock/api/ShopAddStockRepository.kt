package com.breezefsmsettdeycohomoeolab.features.stockAddCurrentStock.api

import com.breezefsmsettdeycohomoeolab.base.BaseResponse
import com.breezefsmsettdeycohomoeolab.features.location.model.ShopRevisitStatusRequest
import com.breezefsmsettdeycohomoeolab.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefsmsettdeycohomoeolab.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefsmsettdeycohomoeolab.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefsmsettdeycohomoeolab.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}