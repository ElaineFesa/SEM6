package pagamento;

public class ControlePagamentos {
    private static ControlePagamentos instancia;

    private ControlePagamentos() {
        System.out.println("Componente de controle inicializado (Conexões e filas ativadas).");
    }

    public static synchronized ControlePagamentos getInstance() {
        if (instancia == null) {
            instancia = new ControlePagamentos();
        }
        return instancia;
    }
}
