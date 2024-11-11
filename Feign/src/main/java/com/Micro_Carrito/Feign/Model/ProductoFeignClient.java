package com.Micro_Carrito.Feign.Model;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "producto-service", url = "http://localhost:9093/api/productos")
public interface ProductoFeignClient {
    // Obtener todos los productos
    @GetMapping
    List<Producto> obtenerTodos();

    // Obtener un producto por ID
    @GetMapping("/{id}")
    Producto obtenerPorId(@PathVariable("id") Long id);

    // Crear un nuevo producto
    @PostMapping
    Producto crearProducto(@RequestBody Producto producto);

    // Actualizar un producto existente
    @PutMapping("/{id}")
    Producto actualizarProducto(@PathVariable("id") Long id, @RequestBody Producto producto);

    // Eliminar un producto por ID
    @DeleteMapping("/{id}")
    void eliminarProducto(@PathVariable("id") Long id);
}
