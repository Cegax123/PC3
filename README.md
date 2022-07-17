# PC3

---

## SRP

1. **Muestra la salida y explica los resultados en función de los métodos entregados**

    El resultado que se obtuvo es el siguiente:

    ```
    Demostracion sin SRP
    Nombre del empleado: Abejita,Jessica
    Este empleado tiene 7.5 años de experiencia.
    El ID del empleado es: J673
    Este empleado es un empleado senior
    
    ----
    
    Nombre del empleado: Smart,Chalito
    Este empleado tiene 3.2 años de experiencia.
    El ID del empleado es: C399
    Este empleado es un empleado junior
    ```
    
    Se muestran los datos de ambos empleados. Llamando a los tres métodos de `Empleado` para cada instancia.


   
2. **¿Cuál es el problema con este diseño y las razones posibles del problema?**
   
   - En cada ejecución el ID generado para un empleado será diferente. Por lo que tendríamos que definir una semilla o buscar otra solución.
   - Sea el caso en que tengamos 2 empleados con la misma inicial de nombre podríamos tener un mismo ID para ambos.
   - El método `checkSeniority()` retorna un string, lo cual es peligroso, pues podemos escribir `Senior` en vez de `senior` y nos referiremos a dos estados diferentes. Por lo cual deberíamos usar `enum`
   - Ambos métodos `checkSeniority()` y `generateEmpId()` deberían ser estáticos, pues no utilizan ningun atributo de la clase.
   
   Aparte de los problemas mencionados arriba, podemos observar que existen dos razones de cambio en nuestro módulo `Empleado`.
   - Si quiero modificar la forma de generación del ID del empleado
   - Si quiero modificar en `checkSeniority()` el umbral entre senior y junior
   
   Por lo que estamos violando el principio SRP.

3. **Modifica la clase Empleado**
   
   Modificamos los archivos `Empleado`, `GeneradorIDEmpleado`, `SeniorityChecker` y `Cliente` del package `Solid.SRP`

4. **Realiza una demostración completa que sigue a SRP. Explica tus resultados**
   
   Ahora tendremos que mover los dos métodos de la clase `Empleado` a una nueva clase cada uno. De esta forma, nos queda que la clase `Empleado` puede verse como un contenedor de datos (por lo cual, podríamos modificar el nombre de la clase a `EmpleadoData`, para una mejor comprensión).
   Y las dos nuevas clases solo tendrán una razón de cambio cada una, por lo cual nuestro sistema sigue a SRP.

   Por lo que, el método `showEmpDetail()` quedaría de la siguiente manera:
   ![img.png](images/srpimg.png)
