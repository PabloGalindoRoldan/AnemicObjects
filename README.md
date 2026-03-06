COSIGNA: Implemente una clase Tiempo y una clase Main (la cual instancia y utiliza la clase
Tiempo), que impriman por consola (sysout), la fecha/hora de hoy en dos formatos diferentes:
Largo, del tipo “Lunes 3 de Abril de 2020”. Y otro en formato corto del tipo: “03/04/2020”.
Debe implementarlo de dos formas diferentes: 1) Anémica (según lo que entiendan del artículo) y
no anémica (según lo que entiendan del artículo).
En ambos casos deben explicar por qué uno y el otro.

TRABAJO: 
 1.- Cree una clase Tiempo que maneja la lógica de la recuperación de la fecha y el formateo de la misma, así como los métodos para imprimir la fecha larga y la fecha corta.
 2.- Cree una clase TiempoAn que es un objeto anémico donde se definen únicamente los atributos privados y los getters y setters y se deriva toda la lógica de negocio a un servicio.
 3.- Cree un servicio TiempoService que maneja la lógica de negocio del objeto TiempoAn,

 RESPUESTAS: El objeto tradicional maneja la lógica que es inherente al objeto, esto no quiere decir que no haya servicios y helpers fuera del objeto que resuelvan ciertas tareas,
 pero las tareas que sean propias de ese objeto las resuelve ese objeto. 

 En los objetos anémicos, el objeto pasa a ser algo así como un DTO encargado de la transmisión de datos y no resuelve lógica de ningún tipo. Tiene que apoyarse en algun servicio que se lo resuelva. 
