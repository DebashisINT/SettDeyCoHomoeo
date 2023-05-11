package com.breezefsmsettdeycohomoeolab.features.viewAllOrder.interf

import com.breezefsmsettdeycohomoeolab.app.domain.NewOrderGenderEntity
import com.breezefsmsettdeycohomoeolab.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}