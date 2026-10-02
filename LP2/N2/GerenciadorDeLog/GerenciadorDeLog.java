package GerenciadorDeLog;

public class GerenciadorDeLog {
    private static GerenciadorDeLog instancia;

    private GerenciadorDeLog() {}
       
    public static synchronized GerenciadorDeLog getInstancia() {
        if (instancia == null) {
            instancia = new GerenciadorDeLog();
        }
        return instancia;
    }

}
