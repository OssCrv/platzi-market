## Platzi Market

Este es el proyecto que hace parte del curso de Java Spring de Platzi.

Se realiza una API dónde se tiene una estructura básica de entidades de Cliente, Compra, Productos y  Categorias con sus respectivas relaciones.

Se tiene el modelo de entidades de la base de datos para la persistencia de estos, se genera una capa de comunicación con la base de datos (Repository), de esta manera si hay una migración a un motor de base de datos diferente no habrá que hacer muchos cambios.

Para no exponer directamente la estructura de la base de datos al dominio se generan unas clases adicionales que luego son mapeadas a las de la estructura de la base de datos. Estas clases del dominio son las que se exponen al servicio que usa el controlador para responder a las peticiones de los datos.

Se tienen tres controladores, uno de Productos, otro de Compras y finalmente uno para la autenticación. Se usan JWT para la seguridad.
