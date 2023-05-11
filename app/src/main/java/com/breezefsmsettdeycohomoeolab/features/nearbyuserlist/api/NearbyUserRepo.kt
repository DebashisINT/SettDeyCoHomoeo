package com.breezefsmsettdeycohomoeolab.features.nearbyuserlist.api

import com.breezefsmsettdeycohomoeolab.app.Pref
import com.breezefsmsettdeycohomoeolab.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefsmsettdeycohomoeolab.features.newcollection.model.NewCollectionListResponseModel
import com.breezefsmsettdeycohomoeolab.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}