package com.breezefsmsettdeycohomoeolab.features.dashboard.presentation.api.dayStartEnd

import com.breezefsmsettdeycohomoeolab.app.Pref
import com.breezefsmsettdeycohomoeolab.base.BaseResponse
import com.breezefsmsettdeycohomoeolab.features.dashboard.presentation.model.DaystartDayendRequest
import com.breezefsmsettdeycohomoeolab.features.dashboard.presentation.model.StatusDayStartEnd
import com.breezefsmsettdeycohomoeolab.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefsmsettdeycohomoeolab.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }

    fun daystartendDelete(sessionToken:String,usrID:String,date:String,dayStDel:String,dayEndDel:String): Observable<BaseResponse> {
        return apiService.submitDayStartEndDelApi(sessionToken,usrID,date,dayStDel,dayEndDel)
    }


}