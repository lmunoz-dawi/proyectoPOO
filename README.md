# Proyecto POO: Gestión de ventas en una tienda de anime

Descripción:

Este proyecto consiste en una aplicación de gestión de ventas para una tienda de anime.

La aplicación permitirá al usuario:
1. Gestionar productos de anime:
- Agregar nuevos productos (mangas, figuras, ropa, etc.).
- Editar los detalles de los productos existentes (nombre, precio, stock, descripción, etc.).
- Eliminar productos.
- Consultar la información de los productos.

2. Realizar ventas:
- Agregar productos al carrito de compras.
- Eliminar productos del carrito de compras.
- Modificar la cantidad de productos en el carrito de compras.
- Calcular el total de la compra.
- Procesar el pago de la compra (efectivo, tarjeta de crédito, etc.).

3. Clases principales:

- Manga: Clase concreta que hereda de la clase abstracta Producto y define los atributos y métodos específicos de un manga (número de páginas, tomo, etc.).
- Figura: Clase concreta que hereda de la clase abstracta Producto y define los atributos y métodos específicos de una figura (material, escala, fabricante, etc.).
- Ropa: Clase concreta que hereda de la clase abstracta Producto y define los atributos y métodos específicos de una prenda de ropa de anime (talla, material, diseño, etc.).
- Carrito: Clase que representa el carrito de compras del usuario. Permite agregar, eliminar, modificar y calcular el total de la compra.
- Producto: Clase abstractas donde se instancian los atributos principales de cada producto.
- TarjetaPago: Clase donde se podra guardar la tarjeta de credito del usuario si este lo desea para futuras compras
- Main: Menu donde se realizan todas las acciones a nivel de usuario
