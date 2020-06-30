package bkp.com.weather.ui.base

import androidx.lifecycle.ViewModel
import bkp.com.weather.data.provider.UnitProvider
import bkp.com.weather.data.repository.ForecastRepository
import bkp.com.weather.internal.UnitSystem
import bkp.com.weather.internal.lazyDeferred

abstract class WeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {

    private val unitSystem = unitProvider.getUnitSystem()

    val isMetricUnit: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weatherLocation by lazyDeferred {
        forecastRepository.getWeatherLocation()
    }
}