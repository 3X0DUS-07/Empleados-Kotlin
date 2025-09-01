package com.yohusseffcaffella.listaempleado

import com.yohusseffcaffella.listaempleado.model.Empleado

fun main() {
    val empleados = mutableListOf(
        Empleado("Carlos Pérez", 25, 2500.0, "Ventas"),
        Empleado("María Gómez", 30, 3200.0, "Recursos Humanos"),
        Empleado("Juan Rodríguez", 28, 2800.0, "IT"),
        Empleado("Laura Torres", 35, 4000.0, "Marketing"),
        Empleado("Andrés Ramírez", 26, 2600.0, "IT"),
        Empleado("Lucía Fernández", 29, 3100.0, "Ventas"),
        Empleado("Pedro Sánchez", 40, 4500.0, "Finanzas"),
        Empleado("Ana Morales", 32, 3300.0, "Recursos Humanos"),
        Empleado("Jorge Herrera", 27, 2700.0, "IT"),
        Empleado("Sofía Castro", 31, 3500.0, "Marketing"),
        Empleado("David Vargas", 36, 4200.0, "Finanzas"),
        Empleado("Carolina Ríos", 24, 2400.0, "Ventas"),
        Empleado("Héctor Ruiz", 38, 4400.0, "Finanzas"),
        Empleado("Isabella López", 29, 2950.0, "Recursos Humanos"),
        Empleado("Felipe Díaz", 33, 3600.0, "Marketing"),
        Empleado("Valentina Silva", 26, 2600.0, "IT"),
        Empleado("Gabriel Méndez", 34, 3900.0, "Finanzas"),
        Empleado("Camila Ortega", 28, 2800.0, "Ventas"),
        Empleado("Ricardo Romero", 37, 4100.0, "Recursos Humanos"),
        Empleado("Martina Chávez", 30, 3250.0, "Marketing"),
        Empleado("Sebastián Navarro", 27, 2750.0, "IT"),
        Empleado("Daniela Suárez", 35, 4050.0, "Ventas"),
        Empleado("Tomás Jiménez", 41, 4700.0, "Finanzas"),
        Empleado("Natalia Pardo", 25, 2550.0, "Recursos Humanos"),
        Empleado("Alejandro León", 39, 4300.0, "Marketing"),
        Empleado("Paula Mendoza", 29, 3000.0, "IT"),
        Empleado("Rodrigo Campos", 36, 4150.0, "Ventas"),
        Empleado("Mariana Peña", 32, 3400.0, "Recursos Humanos"),
        Empleado("Esteban Aguilar", 28, 2900.0, "IT"),
        Empleado("Julieta Cortés", 34, 3850.0, "Marketing")
    )

    val mayoresDe30 = empleados.filter { it.edad > 30 }
    println("Empleados mayores de 30 años:")
    mayoresDe30.forEach { println(" - ${it.nombre}, ${it.edad} años") }

    println("\n---------------")

    val agrupados = empleados.groupBy { it.departamento }
    println("Empleados agrupados por departamento:")
    agrupados.forEach { (departamento, lista) ->
        println("$departamento: ${lista.map { it.nombre }}")
    }

    println("\n---------------")

    val salarioPromedio = empleados
        .groupBy { it.departamento }
        .mapValues { (_, lista) -> lista.map { it.salario }.average() }

    println("Salario promedio por departamento:")
    salarioPromedio.forEach { (departamento, promedio) ->
        println("$departamento -> $promedio")
    }

    println("\n---------------")

    val mapaNombreSalario = empleados.associate { it.nombre to it.salario }
    println("Mapa nombre -> salario:")
    mapaNombreSalario.forEach { (nombre, salario) ->
        println("$nombre -> $salario")
    }
}