package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import entity.Product;

@Repository("productRepository")
public interface ProductRepository extends CrudRepository<Product, Integer> {}
//public interface ProductRepository extends JpaRepository<Product, Integer> {}