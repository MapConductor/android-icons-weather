# MapConductor Weather Icons — Android

Weather glyphs for MapConductor Android markers. The pack is region-neutral and selected explicitly by the application.

## Installation

The first registry release is in preparation. Its Gradle coordinate will be:

```kotlin
implementation("com.mapconductor:icons-weather:0.1.0")
```

For source development, clone `android-icons` and this repository beside each other, then run:

```sh
./gradlew :android-icons:publishToMavenLocal
./gradlew -p android-icons-weather build
```

## Quick start

```kotlin
import androidx.compose.ui.graphics.Color
import com.mapconductor.icons.PinGlyphIcon
import com.mapconductor.icons.weather.WeatherMapIcons

val rainMarker = PinGlyphIcon(
    glyph = WeatherMapIcons.rain,
    fillColor = Color(0xFF1565C0),
    glyphColor = Color.White,
)
```

Every weather glyph can be used with `PinGlyphIcon`. Glyph IDs and shapes match the iOS and React packages.

<!-- BEGIN GENERATED ICON CATALOG -->
## Included glyphs

Glyph IDs are stable across Android, iOS, and React.

| Preview | API | Stable ID | Description |
|---|---|---|---|
| <img src="docs/icons/clear_day.svg" width="40" height="40" alt="Clear daytime weather"> | `WeatherMapIcons.clearDay` | `weather.clear_day` | Clear daytime weather |
| <img src="docs/icons/cloud.svg" width="40" height="40" alt="Cloudy weather"> | `WeatherMapIcons.cloud` | `weather.cloud` | Cloudy weather |
| <img src="docs/icons/rain.svg" width="40" height="40" alt="Rain"> | `WeatherMapIcons.rain` | `weather.rain` | Rain |
| <img src="docs/icons/snow.svg" width="40" height="40" alt="Snow"> | `WeatherMapIcons.snow` | `weather.snow` | Snow |
| <img src="docs/icons/thunderstorm.svg" width="40" height="40" alt="Thunderstorm"> | `WeatherMapIcons.thunderstorm` | `weather.thunderstorm` | Thunderstorm |
| <img src="docs/icons/wind.svg" width="40" height="40" alt="Wind"> | `WeatherMapIcons.wind` | `weather.wind` | Wind |
| <img src="docs/icons/fog.svg" width="40" height="40" alt="Fog"> | `WeatherMapIcons.fog` | `weather.fog` | Fog |
<!-- END GENERATED ICON CATALOG -->
