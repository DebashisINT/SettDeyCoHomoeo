package com.breezefsmsettdeycohomoeolab.features.login.model

import com.breezefsmsettdeycohomoeolab.base.BaseResponse

/**
 * Created by Pratishruti on 23-11-2017.
 */
class LoginResponse : BaseResponse() {
    var session_token: String? = null
    var user_details: UserDetail? = null
    var user_count: UserCount? = null
    var state_list: ArrayList<LoginStateListDataModel>? = null
}