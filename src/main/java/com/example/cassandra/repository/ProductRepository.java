package com.example.cassandra.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.example.cassandra.model.Product;

public interface ProductRepository extends CassandraRepository<Product, Integer>
{
}
