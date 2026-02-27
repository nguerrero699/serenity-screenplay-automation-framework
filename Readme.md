# 🚀 Serenity Screenplay Automation Framework

Framework de automatización construido con **Serenity BDD** utilizando el patrón **Screenplay**, diseñado para soportar pruebas **UI y API** bajo una arquitectura escalable, mantenible y orientada a buenas prácticas.

---

## 🧱 Tech Stack

- Java 17+
- Serenity BDD
- Screenplay Pattern
- Selenium WebDriver
- Cucumber (BDD)
- Gradle

---

## 📂 Estructura del Proyecto

    src
     ├── main
     └── test
         ├── java
         │   └── com.nycoodev.automation
         │       ├── api
         │       │   ├── interactions
         │       │   ├── questions
         │       │   └── tasks
         │       ├── ui
         │       │   ├── interactions
         │       │   ├── questions
         │       │   ├── tasks
         │       │   ├── stepdefinitions
         │       │   └── userinterfaces
         │       ├── runners
         │       ├── config
         │       └── utils
         └── resources
             ├── features
             └── serenity.conf

---

## 🧠 Arquitectura

El framework implementa el patrón **Screenplay**, promoviendo:

- Separación clara de responsabilidades
- Bajo acoplamiento
- Alta reutilización
- Escalabilidad para proyectos enterprise

### 🔹 API Layer
Contiene:
- Tasks
- Questions
- Interactions

### 🔹 UI Layer
Contiene:
- Tasks
- Questions
- Interactions
- Step Definitions
- Page Objects (userinterfaces)

### 🔹 Runners
Clases encargadas de ejecutar los escenarios de Cucumber.

### 🔹 Config
Configuraciones globales del proyecto.

### 🔹 Utils
Clases utilitarias reutilizables.

---

## ▶️ Ejecución del Proyecto

### Ejecutar todas las pruebas

En Linux / Mac:

    ./gradlew clean test aggregate

En Windows:

    .\gradlew clean test aggregate

---

## 📊 Reportes

Después de la ejecución, el reporte de Serenity se genera en:

    target/site/serenity/index.html

Incluye:

- Resultado detallado de escenarios
- Evidencias (screenshots)
- Tiempo de ejecución
- Detalle paso a paso

---

## 🧩 Capacidades

- UI Testing
- API Testing
- BDD con Cucumber
- Arquitectura preparada para CI/CD
- Soporte para ejecución escalable

---

## 🔮 Próximas Mejoras

- Integración con GitHub Actions
- Ejecución paralela
- Manejo avanzado de datos
- Integración UI + API en un mismo flujo
- Dockerización

---

## 👨‍💻 Autor

Framework desarrollado como base para automatización profesional siguiendo estándares de industria y buenas prácticas de diseño.

---

⭐ Si este proyecto te resulta útil, no olvides darle una estrella en GitHub.