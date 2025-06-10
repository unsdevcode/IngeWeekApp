# IngeWeekApp

IngeWeekApp is a sample Android application that displays a list of scheduled events for **IngeWeek**. The main screen hosts a `RecyclerView` listing the day, time, location, topic and speaker of each event. The app also includes a switch in the main activity to toggle between light and dark modes using `AppCompatDelegate`.

## Build

This project uses [Gradle](https://gradle.org/) with Kotlin DSL. You can build it either from the command line or with Android Studio.

### Command line

1. Ensure you have the appropriate Android SDKs installed.
2. From the project root run:

```bash
./gradlew assembleDebug
```

This will produce a debug APK under `app/build/outputs/apk/`.

### Android Studio

1. Open Android Studio and choose **Open** existing project.
2. Select the `IngeWeekApp` directory.
3. Press **Run** to build and deploy to a connected device or emulator.

## SDK versions

- **Compile SDK:** 35
- **Target SDK:** 35
- **Minimum SDK:** 21

## Testing

Unit tests and instrumentation tests can be executed with Gradle:

```bash
./gradlew test            # run unit tests
./gradlew connectedAndroidTest  # run instrumentation tests on a device/emulator
```

