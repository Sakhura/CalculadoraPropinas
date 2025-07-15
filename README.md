# CalculadoraPropinas
Ejercicio 1: Calculadora de Propinas
Nivel: Básico
Conceptos: Kotlin básico, UI simple, eventos
Objetivo: Crear una aplicación que calcule propinas basándose en el total de la cuenta y el porcentaje de propina seleccionado.

Funcionalidades Requeridas
•	Campo de entrada para el monto total
•	Selector de porcentaje de propina (10%, 15%, 20%)
•	Mostrar el monto de la propina calculado
•	Mostrar el total final (cuenta + propina)
•	Botón para limpiar los campos

Estructura de Archivos
app/src/main/java/com/tuapp/calculadorapropinas/
├── MainActivity.kt
└── utils/
    └── CalculadoraUtils.kt

app/src/main/res/layout/
└── activity_main.xml

Retos Adicionales
•	Validar que el monto ingresado sea válido
•	Permitir propinas personalizadas
•	Guardar la preferencia de porcentaje usando SharedPreferences
•	Agregar animaciones suaves
