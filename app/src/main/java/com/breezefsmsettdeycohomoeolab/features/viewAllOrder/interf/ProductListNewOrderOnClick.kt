package com.breezefsmsettdeycohomoeolab.features.viewAllOrder.interf

import com.breezefsmsettdeycohomoeolab.app.domain.NewOrderGenderEntity
import com.breezefsmsettdeycohomoeolab.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}