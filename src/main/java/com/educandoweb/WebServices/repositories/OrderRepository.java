package com.educandoweb.WebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.WebServices.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
