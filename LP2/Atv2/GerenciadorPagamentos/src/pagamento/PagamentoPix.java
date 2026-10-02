package pagamento;

public class PagamentoPix extends Pagamento {

    @Override
    public void pagamento() {
        System.out.println("Processando pagamento via Pix.");
    }
}
