## Análisis del Problema

El programa procesa un número N de estudiantes (validando que N sea mayor que 0). Para cada estudiante se solicita el nombre, tres calificaciones (con validación de 0 a 10) y el porcentaje de asistencia (con validación de 0 a 100).

Cálculo: Se calcula el promedio ponderado aplicando los porcentajes de 30%, 30% y 40%. 

Estructuras de Condición (if / else-if): Clasifica al estudiante según su promedio en Excelente (>= 9), Aprobado (>= 7), Supletorio (>= 5) o Reprobado (< 5), y define si aprueba (promedio >= 7 y asistencia >= 75%) o reprueba.

Resultados Finales: Muestra el promedio general del curso, el total de aprobados y reprobados, y destaca al estudiante con el mejor promedio.

**Entrada**

Cantidad de estudiantes (N).   

Nombre del estudiante.   

Nota 1, Nota 2 y Nota 3 (valores de 0 a 10).   

Porcentaje de asistencia (valor de 0 a 100).

**Procesos**

Validar mediante bucles while que N > 0, las notas estén entre 0 y 10 y la asistencia entre 0 y 100.   

Calcular el promedio ponderado: promedio = (nota1 * 0.30) + (nota2 * 0.30) + (nota3 * 0.40).   

Evaluar el nivel de rendimiento mediante estructuras condicionales if / else-if.   

Acumular las notas para el promedio general y actualizar dinámicamente el mejor promedio del curso.

**Salidas**

Promedio individual y su respectiva clasificación.

Promedio general del curso.   

Cantidad total de aprobados y reprobados.   

Nombre y valor del mejor estudiante/promedio. 

## Prueba de escritorio
<img width="1870" height="841" alt="image" src="https://github.com/user-attachments/assets/d07e59bd-fd32-4cea-96d0-957ce5f9df35" />

## Diagrama 
<img width="622" height="1070" alt="WhatsApp Image 2026-10-01 at 12 00 22 PM" src="https://github.com/user-attachments/assets/e5c93d85-ee0d-4bf1-b323-4bad0c478e3f" />

