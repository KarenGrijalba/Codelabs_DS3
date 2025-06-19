package co.edu.univalle.pedidoservice.entitys;

import co.edu.univalle.pedidoservice.client.DTOs.ProductoDTO;

public record Pedido(String id, ProductoDTO producto, int cantidad) {}
