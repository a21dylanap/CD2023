# Instalación de NetBeans

## Antes de nada

El primero paso es instalar el jdk de java ya que es un IDE dirigido a JAVA.

Pasos:

Actualizar repositorios
```bash
sudo apt update
```
Instalar el JDK
```bash
sudo apt install default-jdk
```
Ver la version de JAVA
```bash
java --version
```
Una vez instalado pasariamos al IDE

## Instalar el IDE NetBeans utilizando el repositorio apt de Ubuntu

Paso 1: Añadir el repositorio universe de Ubuntu
```bash
sudo add-apt-repository "deb http://archive.ubuntu.com/ubuntu focal universe"
```


Paso 2: Actualizar la lista de paquetes apt de Ubuntu
```bash
sudo apt update
```


Paso 3: Instalar NetBeans con apt
```bash
sudo apt install netbeans
```

Y ya estaria.





