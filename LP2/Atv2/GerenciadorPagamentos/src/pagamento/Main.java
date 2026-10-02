package pagamento;

public class Main {
    public static void main(String[] args) {
        
        //Simula requisições simultâneas de pagamento
        for (int i = 1; i <= 3; i++) {
            final int idThread = i;
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    //Cada thread tenta acessar o componente de controle Singleton
                    ControlePagamentos controle = ControlePagamentos.getInstance();
                    System.out.println("Thread " + idThread + " obteve a instância: " + controle);
                }
            });
            
            t.start(); //Inicia a thread
            
            try {
                t.join(); //Faz a thread principal esperar esta thread terminar antes de ir para a próxima
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //Testa as formas de pagamento
        Pagamento pagamentoCartao = new PagamentoCartao();
        Pagamento pagamentoBoleto = new PagamentoBoleto();
        Pagamento pagamentoPix = new PagamentoPix();

        pagamentoCartao.pagamento();
        pagamentoBoleto.pagamento();
        pagamentoPix.pagamento();
    }
}