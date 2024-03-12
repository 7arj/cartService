package com.example.midterm.controllers;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.midterm.Services.CartService;
import com.example.midterm.Models.Cart;
import java.util.List;

@RestController
@RequestMapping("/carts")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping
    public List<Cart> getAllCarts() {
        return cartService.getAllCarts();
    }

    @GetMapping("/{id}")
    public Cart getCart(@PathVariable Long id) {
        return cartService.getCartById(id);
    }

    @GetMapping("/user/{userId}")
    public List<Cart> getUserCarts(@PathVariable Long userId) {
        return cartService.getCartsByUserId(userId);
    }

    @PostMapping
    public Cart addProductToCart(@RequestBody Cart cart) {
        return cartService.addProductToCart(cart);
    }

    @PutMapping("/{id}")
    public Cart updateProductInCart(@PathVariable Long id, @RequestBody Cart cart) {
        return cartService.updateProductInCart(id, cart);
    }

    @DeleteMapping("/{id}")
    public void deleteCart(@PathVariable Long id) {
        cartService.deleteCart(id);
    }
}


