package com.breezefsmsettdeycohomoeolab.features.photoReg.adapter

import com.breezefsmsettdeycohomoeolab.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}