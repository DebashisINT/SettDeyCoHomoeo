package com.breezefsmsettdeycohomoeolab.features.weather.api

import com.breezefsmsettdeycohomoeolab.features.task.api.TaskApi
import com.breezefsmsettdeycohomoeolab.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}