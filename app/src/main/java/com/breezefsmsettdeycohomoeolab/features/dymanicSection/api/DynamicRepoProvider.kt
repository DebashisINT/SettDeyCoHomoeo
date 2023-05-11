package com.breezefsmsettdeycohomoeolab.features.dymanicSection.api

import com.breezefsmsettdeycohomoeolab.features.dailyPlan.api.PlanApi
import com.breezefsmsettdeycohomoeolab.features.dailyPlan.api.PlanRepo

/**
 * Created by Saikat on 19-Aug-20.
 */
object DynamicRepoProvider {
    fun dynamicRepoProvider(): DynamicRepo {
        return DynamicRepo(DynamicApi.create())
    }

    fun dynamicRepoProviderMultipart(): DynamicRepo {
        return DynamicRepo(DynamicApi.createImage())
    }
}