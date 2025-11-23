package Exercicio14;

public class TestePolimorfismo {

    public static void main(String[] args) {

        MetodoPagamento cartao = new CartaoCredito("1234-5678-9999-1111");
        MetodoPagamento boleto = new Boleto("83640000001");
        MetodoPagamento pix = new Pix("email@exemplo.com");

        ProcessadorPagamento.processar(cartao, 150.75);
        ProcessadorPagamento.processar(boleto, 499.00);
        ProcessadorPagamento.processar(pix, 25.50);
    }
}
