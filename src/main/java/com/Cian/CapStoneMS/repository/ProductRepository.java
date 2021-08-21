package com.Cian.CapStoneMS.repository;


import com.Cian.CapStoneMS.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <Product, Long> {

}
