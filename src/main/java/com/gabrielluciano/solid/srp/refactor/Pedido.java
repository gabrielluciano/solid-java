package com.gabrielluciano.solid.srp.refactor;

public class Pedido {
    private final CarrinhoCompra carrinhoCompra;
    private String status;

    public Pedido(CarrinhoCompra carrinhoCompra) {
        if (carrinhoCompra == null)
            throw new IllegalArgumentException("Carrinho não pode ser vazio");
        this.carrinhoCompra = carrinhoCompra;
        status = "aberto";
    }

    public CarrinhoCompra getCarrinhoCompra() {
        return carrinhoCompra;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getValorPedido() {
        return carrinhoCompra.calcularTotal();
    }

    public boolean confirmar() {
        if (!carrinhoCompra.isVazio()) {
            setStatus("confirmado");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "carrinhoCompra=" + carrinhoCompra +
                ", status='" + status + '\'' +
                ", valorPedido=" + getValorPedido() +
                '}';
    }
}
