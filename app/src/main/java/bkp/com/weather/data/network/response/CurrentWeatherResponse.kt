package bkp.com.weather.data.network.response

import bkp.com.weather.data.db.entity.CurrentWeatherEntry
import bkp.com.weather.data.db.entity.Location
import com.google.gson.annotations.SerializedName


data class CurrentWeatherResponse(
    val location: Location,
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry

)