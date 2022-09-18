# Enunciado

Se desea crear la base de un sistema que muestra información sobre peliculas y series.

Podemos decir que tanto las peliculas como los episodios de una serie son obras. La diferencia, para nosotros, es que un episodio no es una obra independiente sino que está asociado a otros de la siguiente forma: una serie contiene temporadas y cada temporada contiene una cierta cantidad de episodios.

##Tanto de las peliculas como de los episodios deseamos saber
* Titulo
* Duración
* Calificación(Numero entre 0 y 10, siendo 10 la mejor califación)

##De las peliculas en particular deseamos conocer:
* Recaudación
* País

##De los episodios en particular deseamos conocer:
* FechaEmision

##Respecto a las temporadas debemos tener:
* Numero
* Episodios

##Y finalmente las series poseen:
* Titulo
* Temporadas

Para poner a prueba el diseño genere los siguientes casos

## Reglas de impresión
Para una pelicula debe imprimirse titulo, duración, calificación, recaudación y país
Para un episodio debe imprimirse titulo, duración, calificación y emisión
Para una serie debe imprimirse titulo
Para una temporada debe imprimirse su número


## Casos de prueba
Se generan varios casos de prueba para analizar difentes situaciones de manejo de array, simulación de datos y polimorfismo. Además repasamos método de ordenamiento

### Caso 1
Generar una serie con dos temporadas de 10 capitulos cada 1. Los datos de los episodios pueden ser aleatorios

Imprimir en consola los datos de la serie, de cada temporada y de sus episodios en el orden correspondiente.

Ejemplo
Datos de serie
- Datos de temporada 1
-- Datos de cada episodio de temporada 1
- Datos de temporada 2 
-- Datos de cada episodio de temporada 2

### Caso 2
Generar un listado de entre 3 y 6 peliculas. Los datos de las misas pueden ser aleatorios. Finalmente imprimir el listado ordenado por califafición(de mas alta a mas baja)


### Caso 3
Usando los datos del caso 1 y caso 2, imprima el ranking de las 5 obras con mejor calificación.


### Caso 4
Usando los datos del caso 1 y caso 2, imprima el ranking de las 5 obras con mayor duración.