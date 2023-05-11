package com.breezefsmsettdeycohomoeolab.features.photoReg.present

import com.breezefsmsettdeycohomoeolab.app.domain.ProspectEntity
import com.breezefsmsettdeycohomoeolab.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}