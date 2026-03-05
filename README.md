# Conversor de Monedas Java 💱

Este es un proyecto de consola desarrollado en **Java** que permite realizar conversiones de divisas en tiempo real. Utiliza la arquitectura de separación de responsabilidades para mantener un código limpio, escalable y fácil de mantener.

## 🚀 Características

* **Tasas en tiempo real:** Conexión directa con la API de [ExchangeRate-API](https://www.exchangerate-api.com/).
* **Menú Interactivo:** Interfaz amigable por consola con validación de opciones.
* **Modularidad:** Código dividido en clases específicas (API, Lógica de Negocio, Menú y Principal).
* **Manejo de JSON:** Utiliza la librería **Gson** para procesar las respuestas de la API.

---

## 📋 Estructura del Código

El proyecto está organizado en las siguientes clases:

| Clase | Función |
| :--- | :--- |
| **`Principal`** | Punto de entrada del programa. |
| **`Menu`** | Gestiona la interacción con el usuario y el bucle del sistema. |
| **`ConversorLogic`** | Procesa los datos y realiza los cálculos de conversión. |
| **`ConsultaMoneda`** | Gestiona la solicitud HTTP y el consumo de la API externa. |

---

## 🛠️ Requisitos e Instalación

### 1. Requisitos previos
* **Java SDK 17** o superior.
* Librería **Gson**.
