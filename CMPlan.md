<center>_________________________________

<br />
#  #
<br />
# CONFIGURATION MANAGEMENT PLAN #
<br />
_________________________________</center>
<br />
<br />
##Autores:

-	Gatica, Carolina
-	Heredia, Marco
-	Vazquez, Franco
			
<br />
##Versión del documento: 1.0.0




<br /><br />



----------
<br /><br />
#Indice de contenidos


1. Introduccion...............................................pág 
 
1.1	Propósito y alcance

1.2	Propósito de las prácticas de SCM

1.3 	Glosario.......................................................pág 

2.	Control de versiones..................................pág 

3.	Integracion continua...................................pág 

4.	Gestion de defectos...................................pág 

5.	Modo de reporte de defectos.....................pág 

6.	Esquema de directorios.............................pág 

7.	Normas de etiquetado y nombramiento de archivos.....................................................pág 

8.	Plan del esquema de ramas a usar............pág 

9.	Politica de fusion de archivos y etiquetado.pág 

10.	Gestion de lanzamiento de releases...........pág 

11.	Change Control Board................................pág 

11.1	Miembros de la CCB...................................pág 

11.2	Periodicidad de las reuniones de la CCB....pág 


<br /><br />

<center>
######Página 1
</center>
----------


# 1. Introducción

##1.1	Propósito y alcance

Este documento cubre el plan de Configuation Managment(CM) que se usará para el proyecto. Este abarca el seguimiento del control de versiones, integración continua, gestión de defectos, esquema de directorios, normas de etiquetado de archivos, esquema de ramas a usar, configuración de la CCB, entre otras cuestiones.Las herramientas usadas son de código libre, pertenecientes a distintos entes.
<br /><br />

##1.2	Propósito de las prácticas de SCM: 
-	Asegurar consistencia en las actividades prácticas de SCM
-	Definir los organismos competentes para apoyar las prácticas de SCM
-	Garantizar que no se realicen cambios de forma inapropiada
-	Informar a los grupos e individuos involucrados sobre el estado del proyecto
-	Garantizar integridad del producto a lo largo de	su ciclo de vida
-	Crear un historial de los estados actuales y anteriores de los productos en desarrollo
-	Evitar problemas por falta de estandarización de las distintas actividades
-	Mejorar procesos
<br /><br />


##GLOSARIO

-	CCB: Change Control Board
-	CM: Configuration Managment
-	SCM: Software Configuration Manager
-	PCM: Project Configuration Management
-	SCM: Software Configuration Management
-	Tag: Etiqueta
-	CI: Configuration Item

<br /><br />

<center>
######Página 2
</center>
----------
#Control de Versiones
    
Como su nombre lo indica, le concierne el control de versiones de un componente o de un producto o programa. Se trata con conjuntos de items elementales que están bajo el control de configuracion, con el fin de producir un componente o producto coherente. En consecuencia esta actividad esta basada en una generación controlada de un número de versiones para items del proyecto. 

En nuestro caso utilizaremos Git y GitHub como la herramientas para el control de versiones, que no es necesario confiar todo en un repositorio central lo cual nos permite que se pueda trabajar sobre copias de trabajo o hacer nuevos modelos de trabajo a partir de dicho repositorio como si fuera el proyecto general.

Se accedera al repositorio de trabajo creando una cuenta de usuario en GitHub y luego se obtendran los permisos de edicion correspondientes para poder editar el proyecto a traves de la siguiente direccion URL:
<br />

[https://github.com/francovqz/IngSoft-2016-Enigma](https://github.com/francovqz/IngSoft-2016-Enigma)
<br />
<br />
<center>
######Página 3
</center>
----------
#Integracion Continua	
   
La integracion continua constituye una parte importate al Sofware Configuration Management ya que se asegura que cada cambio realizado sea integrado al proyecto principal lo antes posible lo cual proporciona una informacion viable sobre la salud del proyecto. 

La idea basica es integrar nuevas partes de codigo tan rapido como sea posible y testear las modificaciones en el contexto del proyecto en su totalidad. Para alcanzar este objetivo un servidor de integraion continua recupera la fuente del codigo del proyecto despues de cada cambio producido, lo compila y corre los tests correspondientes para verificar la funcionalidad.   

Se utilizara Travis CI ya que es bastante convenido con GitHub. Tiene varias ventajas, entre ellas; no es necesario tener proporcionado un server de IC dedicado ademas de que el servicio es gratuito para proyectos de open source.

Para usar Travis , el usuario debe entrar en su cuenta de GitHub, luego la pagina de perfil de Travis permite al usuario activar IC para cualquiera de sus proyectos. Despues de la activacion, un build sera ejecutado cada vez que se produzcan cambios (push) al repositorio.

Para decirle a Travis como  construir el proyecto, un archivo config llamado .travis.yml debe ser agregado al directorio del repositorio. La configuración contiene el lenguaje del programa que es usado en el proyecto asi como tambien todas las versiones con las que el sofware sera testeado.

La direccion del servidor de Integracion continua de Travis es la siguiente:

[https://travis-ci.org/francovqz/IngSoft-2016-Enigma](https://travis-ci.org/francovqz/IngSoft-2016-Enigma)

<br />


Junto con Travis se utilizará la herramienta Gradle para la realización de los builds y su comprobación. El link de descarga de Gradle es el siguiente:

[http://gradle.org/gradle-download/](http://gradle.org/gradle-download/)

Se deberá incluir en el repositorio los archivos necesarios para que gradle realice los builds. Debido a que en el proyecto no utilizamos Test Unitarios por lo cual gradle será configurado unicamente para realizar los builds de java.
<br /><br />
<center>
######Página 4
</center>
----------
#Gestion de defectos

Para nuestro proyecto utilizaremos la herramienta Issues proporcionada por GitHub para el reporte de defectos y su seguimiento. Para acceder a la misma es necesario entrar al apartado de Issues de GitHub con las cuentas de en las cuales tienen acceso como colaboradores al proyecto principal.

Los permisos de acceso a esta herramienta están incluidos al pertenecer al grupo de colaboradores al repositorio de GitHub.

Es importante revisar el apartado en el cual se publican todos los defectos para no tener problemas con los mismos.

[https://github.com/francovqz/IngSoft-2016-Enigma/issues](https://github.com/francovqz/IngSoft-2016-Enigma/issues)


#Modo de reporte de Defectos


En caso de observar algún defecto en el proyecto es importante dirigirse inmediatamente a la herramienta Issues y crear un nuevo reporte explicando detalladamente el defecto que se encontró, el lugar en el cual se encuentra el defecto y una posible solución del mismo. Es importante garantizar que realmente el defecto existe antes de realizar un reporte.


El Issue Coordinator determinará quién se hará cargo de resolver el defecto y realizará un seguimiento del mismo hasta garantizar que el defecto está solucionado. Una vez solucionado se cerrará el Issue en la herramienta dejando activos únicamente los defectos que todavìa no fueron resueltos.

La prioridad de resoluciòn del defecto va a ser determinada por el Issue Coordinator, teniendo en cuenta los problemas que puedan causar el postergar la resoluciòn del defecto.



<br /><br />
<center>
######Página 5
</center>
----------
