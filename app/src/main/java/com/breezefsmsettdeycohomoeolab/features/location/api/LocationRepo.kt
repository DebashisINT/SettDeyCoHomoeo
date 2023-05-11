package com.breezefsmsettdeycohomoeolab.features.location.api

import com.breezefsmsettdeycohomoeolab.app.Pref
import com.breezefsmsettdeycohomoeolab.base.BaseResponse
import com.breezefsmsettdeycohomoeolab.features.location.model.AppInfoInputModel
import com.breezefsmsettdeycohomoeolab.features.location.model.AppInfoResponseModel
import com.breezefsmsettdeycohomoeolab.features.location.model.GpsNetInputModel
import com.breezefsmsettdeycohomoeolab.features.location.model.ShopDurationRequest
import com.breezefsmsettdeycohomoeolab.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }

    fun gpsNetInfo(appInfo: GpsNetInputModel?): Observable<BaseResponse> {
        return apiService.submitGpsNetInfo(appInfo)
    }
}