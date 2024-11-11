package com.Micro_Carrito.Feign.Reposiroty;

import com.Micro_Carrito.Feign.Model.Producto;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductoRepository extends JpaRepository <Producto, Long> {

}
