package com.example.midterm.Models;


import org.springframework.stereotype.Repository;
import  com.example.midterm.Models.CartRepository;
import java.util.List;
@Repository
public interface CartRepository {
    Cart save(Cart cart);
    Cart findById(Long id);
    void deleteById(Long id);
   List<Cart> findAll();
    List<Cart> findByUserId(Long userId);
    Iterable<Cart> findByProductId(Long productId);
    void deleteByUserId(Long userId);
    void deleteByProductId(Long productId);
    void deleteByUserIdAndProductId(Long userId, Long productId);
    void deleteAll();
}
