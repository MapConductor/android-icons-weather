package com.mapconductor.icons.weather

import org.junit.Assert.assertEquals
import org.junit.Test

class WeatherMapIconsTest {
    @Test
    fun initialCollectionHasSevenGlyphs() {
        assertEquals(7, listOf(
            WeatherMapIcons.clearDay,
            WeatherMapIcons.cloud,
            WeatherMapIcons.rain,
            WeatherMapIcons.snow,
            WeatherMapIcons.thunderstorm,
            WeatherMapIcons.wind,
            WeatherMapIcons.fog,
        ).size)
    }
}
