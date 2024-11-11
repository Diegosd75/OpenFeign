package com.Micro_Carrito.Feign.Service;

import com.Micro_Carrito.Feign.Model.Producto;
import com.Micro_Carrito.Feign.Reposiroty.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {


    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> obtenerTodos(){
        return productoRepository.findAll();
    }

    public Producto guardarProducto(Producto producto){
        return productoRepository.save(producto);
    }

    public Producto obtenerPorId(Long id){
        return productoRepository.findById(id).orElse(null);
    }

    public void eliminarProducto(Long id){
        productoRepository.deleteById(id);
    }

}
