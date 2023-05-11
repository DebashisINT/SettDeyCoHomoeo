package com.breezefsmsettdeycohomoeolab.features.dashboard.presentation.api.dayStartEnd

import com.breezefsmsettdeycohomoeolab.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefsmsettdeycohomoeolab.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}