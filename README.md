# Proyecto Lista de Empleados en Kotlin

Este proyecto es un ejemplo básico en **Kotlin** que permite trabajar con una lista de empleados. 
Se utiliza una clase `Empleado` y operaciones comunes sobre listas como filtros, agrupaciones y cálculos.

## Estructura del proyecto

```
src/
 ├── main/
 │   ├── kotlin/
 │   │   └── Main.kt        # Punto de entrada del programa
 │   └── model/
 │       └── Empleado.kt    # Definición de la clase Empleado
```

## Funcionalidades principales

1. **Definición de empleados**  
   Se crea una lista de empleados con nombre, edad, salario y departamento.

2. **Filtrado de empleados mayores de 30 años**  
   El programa muestra en consola todos los empleados cuya edad es mayor a 30.

3. **Agrupación por departamento**  
   Los empleados se agrupan en una lista según el departamento al que pertenecen.

4. **Cálculo de salario promedio por departamento**  
   Se calcula el promedio de salarios dentro de cada departamento.

5. **Mapa nombre -> salario**  
   Se genera un mapa donde la clave es el nombre del empleado y el valor es su salario.

## Ejemplo de salida

```
Empleados mayores de 30 años:
 - Laura Torres, 35 años
 - Pedro Sánchez, 40 años
 - Ana Morales, 32 años
 - Sofía Castro, 31 años
 - David Vargas, 36 años
 - Héctor Ruiz, 38 años
 - Felipe Díaz, 33 años
 - Gabriel Méndez, 34 años
 - Ricardo Romero, 37 años
 - Daniela Suárez, 35 años
 - Tomás Jiménez, 41 años
 - Alejandro León, 39 años
 - Rodrigo Campos, 36 años
 - Mariana Peña, 32 años
 - Julieta Cortés, 34 años

---
Empleados agrupados por departamento:
Ventas: [Carlos Pérez, Lucía Fernández, Carolina Ríos, Camila Ortega, Daniela Suárez, Rodrigo Campos]
Recursos Humanos: [María Gómez, Ana Morales, Isabella López, Ricardo Romero, Natalia Pardo, Mariana Peña]
IT: [Juan Rodríguez, Andrés Ramírez, Jorge Herrera, Valentina Silva, Sebastián Navarro, Paula Mendoza, Esteban Aguilar]
Marketing: [Laura Torres, Sofía Castro, Felipe Díaz, Martina Chávez, Alejandro León, Julieta Cortés]
Finanzas: [Pedro Sánchez, David Vargas, Héctor Ruiz, Gabriel Méndez, Tomás Jiménez]

---
Salario promedio por departamento:
Ventas -> 3166.67
Recursos Humanos -> 3250.0
IT -> 2764.29
Marketing -> 3750.0
Finanzas -> 4340.0

---
Mapa nombre -> salario:
Carlos Pérez -> 2500.0
María Gómez -> 3200.0
Juan Rodríguez -> 2800.0
Laura Torres -> 4000.0
Andrés Ramírez -> 2600.0
Lucía Fernández -> 3100.0
Pedro Sánchez -> 4500.0
Ana Morales -> 3300.0
Jorge Herrera -> 2700.0
Sofía Castro -> 3500.0
David Vargas -> 4200.0
Carolina Ríos -> 2400.0
Héctor Ruiz -> 4400.0
Isabella López -> 2950.0
Felipe Díaz -> 3600.0
Valentina Silva -> 2600.0
Gabriel Méndez -> 3900.0
Camila Ortega -> 2800.0
Ricardo Romero -> 4100.0
Martina Chávez -> 3250.0
Sebastián Navarro -> 2750.0
Daniela Suárez -> 4050.0
Tomás Jiménez -> 4700.0
Natalia Pardo -> 2550.0
Alejandro León -> 4300.0
Paula Mendoza -> 3000.0
Rodrigo Campos -> 4150.0
Mariana Peña -> 3400.0
Esteban Aguilar -> 2900.0
Julieta Cortés -> 3850.0
```

## Requisitos

- Kotlin 1.8+
- IntelliJ IDEA o cualquier editor compatible

## Ejecución

1. Clonar el repositorio.
2. Abrir el proyecto en IntelliJ IDEA.
3. Ejecutar el archivo `Main.kt`.
4. Observar la salida en la consola.
