# Actividad 1: Comunicación entre Actividades
### Institución Universitaria Digital de Antioquia

<p align="left">
  <img src="https://img.shields.io/badge/Kotlin-1.9.0-purple.svg?style=for-the-badge&logo=kotlin" alt="Kotlin">
  <img src="https://img.shields.io/badge/Android-Target_37-green.svg?style=for-the-badge&logo=android" alt="Android">
  <img src="https://img.shields.io/badge/Material_Design-3.0-blue.svg?style=for-the-badge&logo=materialdesign" alt="Material 3">
</p>

---

## 📝 Descripción del Proyecto
Esta aplicación es una implementación técnica avanzada diseñada para demostrar la **comunicación bidireccional** y el flujo de datos entre componentes de Android. Utiliza el patrón moderno de `ActivityResultLauncher` para una gestión eficiente del ciclo de vida y la integridad de los datos.

La solución integra principios de **arquitectura modular** y diseño centrado en el usuario, priorizando una interfaz limpia y profesional.

---

## 🚀 Características Principales
*   ✨ **Interoperabilidad:** Flujo de datos robusto entre `MainActivity` y `DosActivity`.
*   🛡️ **Validación de Datos:** Control preventivo de entrada de texto para evitar errores de ejecución.
*   🎨 **Arquitectura Material 3:** Uso de componentes avanzados como `TextInputLayout`, `MaterialCardView` y tipografía optimizada.
*   🌈 **Feedback Dinámico:** Notificaciones visuales mediante tarjetas adaptativas que cambian de color según el resultado (Éxito/Error).
*   📱 **Diseño Edge-to-Edge:** Adaptación nativa a las dimensiones y barras del sistema para una inmersión completa.

---

## 🏗️ Estructura del Proyecto
Organización de archivos siguiendo las mejores prácticas de desarrollo Android:

```text
📂 first_android_app
├── 📂 app
│   ├── 📂 src
│   │   ├── 📂 main
│   │   │   ├── 📂 java/com/example/actividad1
│   │   │   │   ├── 📄 MainActivity.kt  # Núcleo de interacción y gestión de resultados
│   │   │   │   └── 📄 DosActivity.kt   # Procesamiento y retorno de información
│   │   │   ├── 📂 res
│   │   │   │   ├── 📂 drawable         # Recursos gráficos y vectores
│   │   │   │   ├── 📂 layout           # Definiciones de UI (activity_main, activity_2)
│   │   │   │   └── 📂 values           # Temas, colores (M3) y strings
│   │   │   └── 📄 AndroidManifest.xml
│   └── 📄 build.gradle.kts
├── 📄 build.gradle.kts
└── 📄 settings.gradle.kts
```

---

## 🛠️ Stack Tecnológico
| Componente | Especificación |
| :--- | :--- |
| **Lenguaje** | Kotlin |
| **SDK Mínimo** | 24 (Android 7.0 Nougat) |
| **SDK Objetivo** | 37 (Android 15) |
| **UI Framework** | Material Components (AndroidX) |
| **Build System** | Gradle (Kotlin DSL) |

---

## ⚙️ Instalación y Configuración

### 1. Requisitos
*   Android Studio **Iguana** (2023.2.1) o superior.
*   Conexión a internet para la descarga de dependencias.

### 2. Pasos para la Ejecución
1.  **Importar:** En Android Studio, seleccione `Open` y localice la carpeta raíz del proyecto.
2.  **Sincronizar:** Permita que Gradle finalice el proceso de `Sync`.
3.  **Despliegue:** Utilice el botón **Run** (Play verde) para instalar la app en un emulador o dispositivo físico.

---

## 👥 Equipo de Desarrollo
**Estudiantes de Ingeniería de Software - IU Digital de Antioquia**

*   👤 **Brayan Alejandro Durango Urrea**
*   👤 **Juan Pedro Montoya Vélez**
*   👤 **Víctor Manuel Quiceno Guerra**
*   👤 **Juan Camilo Velásquez**

---

> [!IMPORTANT]
> **Nota Académica:** Este proyecto cumple con los requisitos de evidencia para el fortalecimiento de competencias en programación móvil y manejo de componentes del sistema Android.

---
<p align="center">
  <i>Desarrollado con ❤️ por el grupo de Programación Móvil - 2026</i>
</p>
