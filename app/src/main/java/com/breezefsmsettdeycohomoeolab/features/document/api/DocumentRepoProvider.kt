package com.breezefsmsettdeycohomoeolab.features.document.api

import com.breezefsmsettdeycohomoeolab.features.dymanicSection.api.DynamicApi
import com.breezefsmsettdeycohomoeolab.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}