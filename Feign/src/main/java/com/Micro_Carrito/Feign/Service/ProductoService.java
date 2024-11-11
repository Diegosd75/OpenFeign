package com.Micro_Carrito.Feign.Service;

import com.Micro_Carrito.Feign.Model.Producto;
import com.Micro_Carrito.Feign.Model.ProductoFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoFeignClient productoFeignClient;

    // Obtener todos los productos
    public List<Producto> obtenerTodos() {
        return productoFeignClient.obtenerTodos();
    }

    // Obtener un producto por ID
    public Optional<Producto> obtenerPorId(Long id) {
        Producto producto = productoFeignClient.obtenerPorId(id);
        return Optional.ofNullable(producto);
    }

    // Guardar o actualizar un producto
    public Producto guardarProducto(Producto producto) {
        if (producto.getId() == null) {
            return productoFeignClient.crearProducto(producto);
        } else {
            return productoFeignClient.actualizarProducto(producto.getId(), producto);
        }
    }

    // Eliminar un producto
    public void eliminarProducto(Long id) {
        productoFeignClient.eliminarProducto(id);
    }

}
