package bkp.com.weather.data.network.response

import bkp.com.weather.data.db.entity.CurrentWeatherEntry
import bkp.com.weather.data.db.entity.WeatherLocation
import com.google.gson.annotations.SerializedName


data class CurrentWeatherResponse(
    val location: WeatherLocation,
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry

)