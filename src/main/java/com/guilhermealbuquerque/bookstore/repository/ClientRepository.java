package com.guilhermealbuquerque.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermealbuquerque.bookstore.entity.ClientEntity;

public interface ClientRepository extends JpaRepository<ClientEntity, String> {

}
