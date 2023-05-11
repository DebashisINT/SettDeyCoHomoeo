package com.breezefsmsettdeycohomoeolab.features.viewAllOrder.interf

import com.breezefsmsettdeycohomoeolab.app.domain.NewOrderProductEntity
import com.breezefsmsettdeycohomoeolab.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}