package com.breezefsmsettdeycohomoeolab.features.viewAllOrder.interf

import com.breezefsmsettdeycohomoeolab.app.domain.NewOrderColorEntity
import com.breezefsmsettdeycohomoeolab.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}