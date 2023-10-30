## Probar Prolog

#### Descargar imagen

```bash
docker pull wipl
```

#### Iniciar 

```bash
docker run -it
```

#### Si da error por no tener permisos (Meter usuiario en docker)

```bash
sudo usermod -aG docker
```

#### Entrar con un terminal interactivo

```bash
docker run -it swipl bash
```

#### Salir prolog:

```bash
ctrl D
```

#### Instalar nano

```bash
apt update
apt upgrade
apt install nano
```
#### Crear nano

```bash
nano programaprolog.pl
```

#### Una vez con el nano instalado y de hacer un nano con extensión .pl habrá que pegar las instrucciones que le queremos dar al programa

```bash
mujer(marge).
mujer(lisa).
mujer(maggie).
mujer(selma).

progenitor(abraham, homer).
progenitor(homer, bart).
progenitor(marge, bart).
progenitor(homer, lisa).
progenitor(marge, lisa).

abuelo(X, Y):- progenitor(X, Z), progenitor(Z, Y), hombre(X).
tia(X,Y):- hermana(X,Z), progenitor(Z,Y).
```
#### Una vez guardado el .pl iniciaremos el programa con:

```bash
swipl
consult('programaprolog.pl').
```
#### Y ahora ya puedes hacer consultas al programa:

```bash
mujer(marge).
hombre(juan).
progenitor(abraham, homer).
progenitor(marge, lisa).
```







