package com.breezefsmsettdeycohomoeolab.features.viewAllOrder.interf

import com.breezefsmsettdeycohomoeolab.app.domain.NewOrderGenderEntity
import com.breezefsmsettdeycohomoeolab.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}