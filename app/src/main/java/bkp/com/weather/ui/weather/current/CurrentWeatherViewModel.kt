package bkp.com.weather.ui.weather.current

import androidx.lifecycle.ViewModel
import bkp.com.weather.data.provider.UnitProvider
import bkp.com.weather.data.repository.ForecastRepository
import bkp.com.weather.internal.UnitSystem
import bkp.com.weather.internal.lazyDeferred

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {

    private val unitSystem = unitProvider.getUnitSystem()

    val isMetric: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(isMetric)
    }

    val weatherLocation by lazyDeferred {
        forecastRepository.getWeatherLocation()
    }

}