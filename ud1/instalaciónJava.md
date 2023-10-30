## Crear un programa en JAVA

### Pasos

   - Abre el terminal

   - Actualiza el índice de paquetes

   - Comprueba si Java ya está instalado en Ubuntu

   - Instalar jdk

   - Crear programa java

   - Compilarlo con "javac"

   - Ejecutarlo con "java"

### Como instalar JDK


#### Lo primero es saber que version de ubuntu

```bash
lsb_release -a
```


#### Una vez que ya sabemos la version de nuestro ubuntu tendriamos que actualizar los paquetes con:

```bash
sudo apt-get update
```


#### Comprueba si Java ya está instalado en Ubuntu

```bash
javac --version
```


#### La forma más sencilla de instalar JDK en Ubuntu es utilizar la oferta estándar de Ubuntu:

```bash
sudo apt install default-jdk
```


#### Ahora que java está instalado correctamente hay que creear el programa(tenemos que ir al directorio con "cd"):

```bash
javac holamundo.java
```


#### Ejemplo usar cd para moverse entre directorios:
```bash
cd /Desktop/Repos/a21dylanapDAW/ud1
```


#### Una vez compilado ya se puede ejecutar con:
```bash
java holamundo.java
```
#### Si da error "error: no class declared in file"

Es porque el archivo no se llama igual que la clase

#### Y vemos que funciona
```bash
java holamundo.java
Hola Mundo
```