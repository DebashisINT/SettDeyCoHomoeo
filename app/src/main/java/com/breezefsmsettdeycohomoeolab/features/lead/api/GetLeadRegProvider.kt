package com.breezefsmsettdeycohomoeolab.features.lead.api

import com.breezefsmsettdeycohomoeolab.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefsmsettdeycohomoeolab.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}