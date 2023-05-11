package com.breezefsmsettdeycohomoeolab.features.weather.api

import com.breezefsmsettdeycohomoeolab.base.BaseResponse
import com.breezefsmsettdeycohomoeolab.features.task.api.TaskApi
import com.breezefsmsettdeycohomoeolab.features.task.model.AddTaskInputModel
import com.breezefsmsettdeycohomoeolab.features.weather.model.ForeCastAPIResponse
import com.breezefsmsettdeycohomoeolab.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}