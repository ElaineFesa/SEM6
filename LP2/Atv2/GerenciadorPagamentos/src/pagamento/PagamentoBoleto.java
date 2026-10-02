package pagamento;

public class PagamentoBoleto extends Pagamento {

    @Override
    public void pagamento() {
        System.out.println("Processando pagamento via Boleto.");
    }
}
