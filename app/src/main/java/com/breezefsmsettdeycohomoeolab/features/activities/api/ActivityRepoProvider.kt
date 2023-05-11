package com.breezefsmsettdeycohomoeolab.features.activities.api

import com.breezefsmsettdeycohomoeolab.features.member.api.TeamApi
import com.breezefsmsettdeycohomoeolab.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}