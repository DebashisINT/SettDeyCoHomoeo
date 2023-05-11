package com.breezefsmsettdeycohomoeolab.features.viewAllOrder.orderOptimized

import com.breezefsmsettdeycohomoeolab.app.domain.ProductOnlineRateTempEntity
import com.breezefsmsettdeycohomoeolab.base.BaseResponse
import com.breezefsmsettdeycohomoeolab.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}