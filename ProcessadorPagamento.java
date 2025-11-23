package Exercicio14;

public class ProcessadorPagamento {

    public static void processar(MetodoPagamento metodo, double valor) {
        metodo.realizarPagamento(valor);
    }
}