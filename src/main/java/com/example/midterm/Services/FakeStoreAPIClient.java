package com.example.midterm.Services;
import com.example.midterm.Models.Cart;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpMethod;

@Service
class FakeStoreApiClient {

    private final RestTemplate restTemplate;
    private final String baseUrl = "https://fakestoreapi.com/carts";

    public FakeStoreApiClient() {
        this.restTemplate = new RestTemplate();
    }

    public Cart[] getAllCarts() {
        return restTemplate.getForObject(baseUrl, Cart[].class);
    }

    public Cart getCart(Long id) {
        return restTemplate.getForObject(baseUrl + "/" + id, Cart.class);
    }

    public Cart[] getCartsInDateRange(String startDate, String endDate) {
        return restTemplate.getForObject(baseUrl + "?startdate=" + startDate + "&enddate=" + endDate, Cart[].class);
    }

    public Cart[] getUserCarts(Long userId) {
        return restTemplate.getForObject(baseUrl + "/user/" + userId, Cart[].class);
    }

    public Cart addProductToCart(Cart cart) {
        HttpEntity<Cart> request = new HttpEntity<>(cart);
        return restTemplate.postForObject(baseUrl, request, Cart.class);
    }

    public Cart updateProductInCart(Long id, Cart cart) {
        HttpEntity<Cart> request = new HttpEntity<>(cart);
        ResponseEntity<Cart> response = restTemplate.exchange(baseUrl + "/" + id, HttpMethod.PUT, request, Cart.class);
        return response.getBody();
    }

    public void deleteCart(Long id) {
        restTemplate.delete(baseUrl + "/" + id);
    }
}

