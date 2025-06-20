#####  DOCUMENTACIÓN DE PRUEBAS EN POSTMAN

- ###### Entidad probada: Usuario
- ###### Fecha: 19/06/2025
- ###### Responsable: Yair Cañate
- ###### Herramienta: Postman

En el siguiente repositorio encontrarás el laboratorio de un CRUD (Crear, Leer, Actualizar, Eliminar) implementado con Spring Boot. Este proyecto permite gestionar usuarios en una base de datos.
Adicionalmente, se incluye el archivo JSON de la colección de Postman, con las pruebas realizadas para cada una de las funcionalidades.

#### Resumen General
Se realizaron pruebas funcionales al servicio REST que gestiona la entidad Usuario, validando operaciones de tipo CRUD:

#### Detalle de cada prueba
1. Crear usuario - POST /usuario

Request Body:
```json
{
  "nombre": "luis murillo",
  "email": "yaircs16@gmail.com",
  "prioridad": 3
}
```

Response esperado:
```json
{
    "id": 3,
    "nombre": "luis murillo",
    "email": "yaircs16@gmail.com",
    "prioridad": 3
}
```
:fa-check-circle: Código de respuesta: 200 OK
:fa-check-circle: Resultado:  Usuario creado exitosamente.

2 Listar usuarios - GET /usuario

Response esperado:
```json
[
    {
        "id": 1,
        "nombre": "Yair Cañate",
        "email": "yaircs16@gmail.com",
        "prioridad": 2
    },
    {
        "id": 2,
        "nombre": "carlos hernandez",
        "email": "yaircs16@gmail.com",
        "prioridad": 5
    },
    {
        "id": 3,
        "nombre": "luis murillo",
        "email": "yaircs16@gmail.com",
        "prioridad": 3
    }
]
```
- GET /usuario/[id]
Response esperado:
```json
{
    "id": 2,
    "nombre": "carlos hernandez",
    "email": "yaircs16@gmail.com",
    "prioridad": 5
}
```
:fa-check-circle: Código de respuesta: 200 OK
:fa-check-circle: Resultado:  Usuario creado exitosamente.

#### Evidencias Postman
A continuación se presentan capturas de pantalla que evidencian la ejecución exitosa de las pruebas realizadas mediante Postman:
![image](https://github.com/user-attachments/assets/29e6d056-376a-435e-a24f-d30b19a40cb2)



#### Conclusiones
- Todos los endpoints del CRUD fueron verificados con éxito.
- Se validaron códigos HTTP y estructuras JSON de entrada y salida.
- Sin embargo, aún faltan pruebas adicionales para validar el manejo de errores ante escenarios como datos inválidos, usuarios inexistentes, o formatos incorrectos. Estas validaciones son necesarias para certificar completamente la robustez del código ante fallos y errores esperados.
