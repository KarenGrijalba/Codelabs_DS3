package co.edu.univalle.pedidoservice.controller;

import co.edu.univalle.pedidoservice.client.DTOs.ProductoDTO;
import co.edu.univalle.pedidoservice.client.ProductoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final ProductoClient productoClient;

    @Autowired
    public PedidoController(ProductoClient productoClient) {
        this.productoClient = productoClient;
    }

    @GetMapping("/crear")
    public ResponseEntity<?> crearPedido() {
        List<ProductoDTO> productos = productoClient.obtenerProductos();
        return ResponseEntity.ok("El pedido fue creado con los siguientes productos: " + productos);
    }
}
