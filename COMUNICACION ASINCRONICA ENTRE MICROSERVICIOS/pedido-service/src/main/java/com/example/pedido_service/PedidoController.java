package main.java.com.example.pedido_service;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @GetMapping("/crear")
    public String crearPedido() {
        return "El pedido se encuentra en proceso y se recibirá en cuanto llegue el mensaje asíncrono.";
    }
}
