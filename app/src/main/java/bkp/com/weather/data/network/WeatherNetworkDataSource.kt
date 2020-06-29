package bkp.com.weather.data.network

import androidx.lifecycle.LiveData
import bkp.com.weather.data.network.response.CurrentWeatherResponse

interface WeatherNetworkDataSource {

    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>


    suspend fun fetchCurrentWeather(
        location: String,
        languageCode: String
    )

}