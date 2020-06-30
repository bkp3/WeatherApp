package bkp.com.weather.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import bkp.com.weather.data.db.entity.CURRENT_WEATHER_ID
import bkp.com.weather.data.db.entity.CurrentWeatherEntry
import bkp.com.weather.data.db.unitlocalized.current.ImperialCurrentWeatherEntry
import bkp.com.weather.data.db.unitlocalized.current.MetricCurrentWeatherEntry

//import bkp.com.weather.data.db.unitlocalized.current.ImperialCurrentWeatherEntry
//import bkp.com.weather.data.db.unitlocalized.current.MetricCurrentWeatherEntry


@Dao
interface CurrentWeatherDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(weatherEntry: CurrentWeatherEntry)

    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID")
    fun getWeatherMetric(): LiveData<MetricCurrentWeatherEntry>

    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID")
    fun getWeatherImperial(): LiveData<ImperialCurrentWeatherEntry>
}