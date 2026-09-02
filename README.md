# S35 - Evidencia de aprendizaje 2 - Taller práctico

## Descripción del Proyecto
Este proyecto es una aplicación Android desarrollada en Kotlin que demuestra la comunicación entre actividades mediante el uso de `Intents` y el API moderno `registerForActivityResult`. La aplicación permite al usuario navegar de una pantalla principal a una secundaria, realizar una selección y recibir dicha respuesta de vuelta en la pantalla de inicio.

## Equipo de Trabajo
Somos estudiantes con alta experiencia de conocimientos en la universidad digital de antioquia, año 2026.

*   **Brayan Alejandro Durango Urrea**
*   **Juan Pedro Montoya Vélez**
*   **Víctor Manuel Quiceno Guerra**
*   **Juan Camilo Velásquez**

## Características Técnicas
*   **Lenguaje:** Kotlin
*   **Arquitectura:** Basada en Actividades (AppCompatActivity)
*   **SDK Mínimo:** 24 (Android 7.0)
*   **SDK Objetivo:** 37
*   **Herramientas de UI:** XML Layouts con `LinearLayout` y `RelativeLayout`.

## Estructura del Código
*   **MainActivity:** Pantalla principal que inicia la transición a la segunda pantalla y procesa el resultado devuelto.
*   **Activity2:** Pantalla receptora donde el usuario puede elegir entre dos opciones ("Aceptar" o "Rechazar"), enviando la elección de vuelta a la actividad anterior.

## Instrucciones de Uso
1.  Clonar el repositorio.
2.  Abrir el proyecto en Android Studio.
3.  Sincronizar los archivos de Gradle.
4.  Ejecutar en un emulador o dispositivo físico con Android 7.0 o superior.

Este proyecto esta preparado para abrirse en Android Studio y cumple la pratica de actividades Android:

- `MainActivity` permite escribir un mensaje.
- El boton `Enviar` abre `Activity2`.
- `Activity2` muestra el mensaje recibido.
- El boton `Recibido` vuelve a la pantalla principal y muestra `Resultado: recibido`.
- El boton `Cancelado` vuelve a la pantalla principal y muestra `Resultado: cancelado`.
- Las clases principales estan en Java, como solicita la evidencia.

## Como abrirlo en Android Studio

1. Descomprime el archivo del proyecto.
2. Abre Android Studio.
3. Selecciona `Open`.
4. Busca la carpeta `first_android_app`.
5. Espera a que Android Studio haga `Gradle Sync`.
6. Si Android Studio pregunta por instalar Android SDK o Gradle, acepta la instalacion.
7. Crea o abre un emulador Android.
8. Presiona el boton verde `Run`.

## Archivos principales

- `app/src/main/java/com/example/actividad1/MainActivity.java`
- `app/src/main/java/com/example/actividad1/Activity2.java`
- `app/src/main/res/layout/activity_main.xml`
- `app/src/main/res/layout/activity_2.xml`
- `app/src/main/AndroidManifest.xml`

## Prueba esperada

1. En la pantalla principal escribe: `Hola desde MainActivity`.
2. Presiona `Enviar`.
3. En `Activity2` debe aparecer ese mismo texto.
4. Presiona `Recibido`.
5. La app vuelve a la pantalla principal y muestra `Resultado: recibido`.
6. Repite el proceso y presiona `Cancelado`.
7. La app vuelve a la pantalla principal y muestra `Resultado: cancelado`.

## Nota de verificacion

El codigo fue preparado y se intento compilar con Gradle. La compilacion local se detuvo porque esta maquina no tiene Android SDK instalado. En Android Studio, el SDK se instala o configura automaticamente durante el `Gradle Sync`.
