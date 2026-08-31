# Plan de Mejora Visual y Funcional de Actividad1

Este plan detalla 5 modificaciones clave para transformar la interfaz actual de una simple a una profesional, moderna e intuitiva, siguiendo las directrices de **Material Design 3**.

## User Review Required

> [!NOTE]
> Se han creado 4 nuevos iconos en formato Vector Drawable (`ic_send`, `ic_check`, `ic_close`, `ic_input_text`) para ser utilizados en la interfaz.

## Proposed Changes

### 1. Integración de Toolbar (Barra Superior)
Añadiremos una `MaterialToolbar` en la parte superior de ambas actividades. Esto proporciona contexto al usuario sobre dónde se encuentra y mejora la navegación.

### 2. Modernización del Campo de Entrada
Sustituiremos el `EditText` básico por un `TextInputLayout`. Esto permite:
- Etiquetas flotantes.
- Iconos iniciales (Leading Icons).
- Bordes redondeados y estados visuales claros.

### 3. Cabecera Visual Impactante
Añadiremos una sección de cabecera en la pantalla principal con un icono grande o ilustración para hacer la aplicación más amigable visualmente desde el primer contacto.

### 4. Enriquecimiento de Botones con Iconos
Los botones "Submit", "Correct" e "Incorrect" incluirán iconos representativos. Esto no solo es atractivo, sino que ayuda a la comprensión rápida de la acción (intuitividad).

### 5. Tarjeta de Resultado Dinámica
En `MainActivity`, el resultado que vuelve de la segunda pantalla se mostrará dentro de una tarjeta con colores dinámicos (rojo/verde) y un icono de estado, en lugar de un simple cambio de color de texto.

---

## Archivos a Modificar

#### [MODIFY] [activity_main.xml](file:///C:/Users/JUANK/AndroidStudioProjects/first_android_app/app/src/main/res/layout/activity_main.xml)
- Implementación de `AppBarLayout` y `MaterialToolbar`.
- Adición de un `ImageView` para la cabecera.
- Cambio de `EditText` a `TextInputLayout`.
- Adición de icono al botón "Submit".

#### [MODIFY] [activity_2.xml](file:///C:/Users/JUANK/AndroidStudioProjects/first_android_app/app/src/main/res/layout/activity_2.xml)
- Implementación de `AppBarLayout` y `MaterialToolbar`.
- Adición de iconos a los botones "Correct" e "Incorrect".

#### [MODIFY] [MainActivity.kt](file:///C:/Users/JUANK/AndroidStudioProjects/first_android_app/app/src/main/java/com/example/actividad1/MainActivity.kt)
- Ajustes menores para referenciar el nuevo ID del `EditText` dentro del `TextInputLayout`.

---

## Plan de Verificación

### Verificación Manual
1. Abrir la aplicación y verificar que la cabecera y el Toolbar se vean correctamente.
2. Interactuar con el campo de texto y notar el comportamiento del `TextInputLayout`.
3. Pulsar "Submit" y verificar que los botones en la segunda pantalla tengan sus respectivos iconos.
4. Seleccionar una opción y verificar que en la pantalla principal el resultado se muestre de forma clara y atractiva.
