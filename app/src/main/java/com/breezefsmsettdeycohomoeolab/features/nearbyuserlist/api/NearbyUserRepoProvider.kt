package com.breezefsmsettdeycohomoeolab.features.nearbyuserlist.api



object NearbyUserRepoProvider {
    fun getNearbyUserListRepository(): NearbyUserRepo {
        return NearbyUserRepo(NearbyUserApi.create())
    }
}