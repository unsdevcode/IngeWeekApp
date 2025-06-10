# IngeWeekApp

IngeWeekApp es una aplicación Android de ejemplo que muestra una lista de eventos programados para **IngeWeek**. La pantalla principal contiene un `RecyclerView` que lista el día, hora, lugar, tema y disertante de cada evento. La aplicación también incluye un interruptor en la actividad principal para alternar entre los modos claro y oscuro mediante `AppCompatDelegate`.

## Compilación

Este proyecto utiliza [Gradle](https://gradle.org/) con Kotlin DSL. Puede compilarlo desde la línea de comandos o con Android Studio.

### Línea de comandos

1. Asegúrese de tener instalados los SDK de Android apropiados.
2. Desde la raíz del proyecto ejecute:

```bash
./gradlew assembleDebug
```

Esto generará un APK de depuración en `app/build/outputs/apk/`.

### Android Studio

1. Abra Android Studio y elija **Open** proyecto existente.
2. Seleccione el directorio `IngeWeekApp`.
3. Presione **Run** para compilar y desplegar en un dispositivo o emulador conectado.

## Versiones de SDK

- **Compile SDK:** 35
- **Target SDK:** 35
- **Minimum SDK:** 21

## Pruebas

Las pruebas unitarias e instrumentadas se pueden ejecutar con Gradle:

```bash
./gradlew test            # ejecuta pruebas unitarias
./gradlew connectedAndroidTest  # ejecuta pruebas instrumentadas en un dispositivo/emulador
```

## Capturas de pantalla

- Pantalla principal  
  ![Pantalla principal](https://i.imgur.com/rn5IG6M.png)
- Vista de eventos programados  
  ![Vista de eventos programados](https://i.imgur.com/EZzBcra.png)

## Licencia

Este proyecto se encuentra bajo la [Licencia MIT](LICENSE).
