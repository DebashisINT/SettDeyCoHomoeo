package com.breezefsmsettdeycohomoeolab.features.location.shopRevisitStatus

import com.breezefsmsettdeycohomoeolab.base.BaseResponse
import com.breezefsmsettdeycohomoeolab.features.location.model.ShopDurationRequest
import com.breezefsmsettdeycohomoeolab.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}