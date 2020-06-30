package bkp.com.weather.data.network

import androidx.lifecycle.LiveData
import bkp.com.weather.data.network.response.CurrentWeatherResponse
import bkp.com.weather.data.network.response.FutureWeatherResponse

interface WeatherNetworkDataSource {

    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>
    val downloadedFutureWeather: LiveData<FutureWeatherResponse>



    suspend fun fetchCurrentWeather(
        location: String,
        languageCode: String
    )

    suspend fun fetchFutureWeather(
        location: String,
        languageCode: String
    )

}