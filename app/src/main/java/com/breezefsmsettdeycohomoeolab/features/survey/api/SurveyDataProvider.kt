package com.breezefsmsettdeycohomoeolab.features.survey.api

import com.breezefsmsettdeycohomoeolab.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefsmsettdeycohomoeolab.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}