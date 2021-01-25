# Proyecto-final
Se encuentra el código para el proyecto final de la materia de Programación Orientada a Objetos
El usuario (en este caso el empleado) realiza una solicitud dependiendo del rol que desempeña, ya sea que pueda agregar (crear) empleados o productos, buscar información (leer), actualizar y borrar información. Esta petición es recibida por el controlador (clase), quien llama a la clase Servicio y ésta a la clase Acceso, en donde se busca la información en la base de datos y, si se encuentra lo que se busca, se regresa la información deseada al usuario por medio de la clase Vista.
Paquete ‘acceso.datos’: Este paquete cuenta con las clases ‘AccesoEmpleado’, ‘AccesoPermiso’, ‘AccesoProducto’ y ‘AccesoRol’. Aquí se encuentra la información de la base de datos.
Paquete ‘modelo’: Sus clases son ‘Empleado’, ‘Permiso’, ‘Producto’ y ‘Rol’. 
Paquete ‘servicio’: Sus clases son ‘ServicioEmpleado’, ‘ServicioPorducto’, ‘ServicioPermiso’ y ‘ServicioRol’. Se realizan los accesos para responder al controlador.
Paquete ‘controlador’: Cuenta con las clases ‘ControladorEmpleado’, ‘ControladorProducto’, ‘ControladorPermiso’ y ‘ControladorRol’. Recibe las solicitudes.
Paquete ‘vista’: Aquí está el código para la ventana de ‘’Login’’, el cual mostrará el menú de productos. Se encuentran los códigos para el marco, los paneles, etiquetas, campos de texto, áreas de texto.
Paquete prueba: Aquí es donde se realizaron las pruebas unitarias y la prueba principal para mostrar la aplicación.
La clase FileWriter es para crear, actualizar y borrar información, y la clase FileReader para la lectura de empleados / productos.
El código UUID (Universally Unique IDentifier) genera un identificador único universal al momento de crear un empleado o un producto.
