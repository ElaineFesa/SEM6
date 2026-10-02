package pagamento;

public class PagamentoCartao extends Pagamento {

    @Override
    public void pagamento() {
        System.out.println("Processando pagamento via Cartão de Crédito.");
    }
}
