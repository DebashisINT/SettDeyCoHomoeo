package com.breezefsmsettdeycohomoeolab.features.login.model.productlistmodel

import com.breezefsmsettdeycohomoeolab.app.domain.ModelEntity
import com.breezefsmsettdeycohomoeolab.app.domain.ProductListEntity
import com.breezefsmsettdeycohomoeolab.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}