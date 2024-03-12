package com.example.midterm.Services;
import com.example.midterm.Models.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.midterm.Models.Cart;
import java.util.List;

    @Service
    public class CartService {
        @Autowired
        private CartRepository cartRepository;

        public List<Cart> getAllCarts() {
            return cartRepository.findAll();
        }

        public Cart getCartById(Long id) {
            return cartRepository.findById(id).orElse(null);
        }

        public List<Cart> getCartsByUserId(Long userId) {
            return cartRepository.findByUserId(userId);
        }

        public Cart addProductToCart(Cart cart) {
            return cartRepository.save(cart);
        }

        public Cart updateProductInCart(Long id, Cart cart) {
            cart.setId(id);
            return cartRepository.save(cart);
        }

        public void deleteCart(Long id) {
            cartRepository.deleteById(id);
        }
    }


