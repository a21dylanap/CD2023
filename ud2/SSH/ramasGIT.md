Partiendo del repositorio libro creado en el ejercicio anterior:

- Crea una nueva rama bibliografía y muestra las ramas del respositorio.
```bash
git branch bibliografia

```

- Cambia a la rama bibliografía y crea el fichero bibliografía.txt y añade la siguiente referencia:

```
caperucita roja,  Trina Schart Hyman, Charles Perrault
```
```bash
git checkout bibliografia
```




- Comitea los cambios con el mensaje “Añadida primera referencia bibliográfica”.



- Fusionar la rama bibliografía con la rama master y eliminar la rama bibliografía.



- Crea la rama harrypotter. En esta rama modifica el fichero bibliografía.txt para que contenga las siguientes referencias:
 Harry Potter y la piedra filosofal, J. K. Rowling
 Harry Potter y el cáliza de fuego, J. K. Rowling


- Comitea los cambios con el mensaje “Añadida bibliografía de harry potter”.


- En la rama master modifica el fichero bibliografía.txt y añadie la siguiente línea:
```
El Rey León, Rob Minkoff, Roger Allers
```

Fusiona la rama harrypotter con la rama master. Resuelve el conflicto y comitea los cambios.