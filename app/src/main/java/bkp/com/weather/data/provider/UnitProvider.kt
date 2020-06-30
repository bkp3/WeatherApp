package bkp.com.weather.data.provider

import bkp.com.weather.internal.UnitSystem

interface UnitProvider {
    fun getUnitSystem(): UnitSystem
}