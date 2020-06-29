package bkp.com.weather.data.repository

import androidx.lifecycle.LiveData
import bkp.com.weather.data.db.unitlocalized.UnitSpecificCurrentWeatherEntry

interface ForecastRepository {

    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecificCurrentWeatherEntry>
}