package GerenciadorDeLog;

public class GerenciadorDeLog {
    private static GerenciadorDeLog instance;

    private GerenciadorDeLog() {}
       
    public static GerenciadorDeLog getInstance() {
        if (instance == null) {
            instance = new GerenciadorDeLog();
        }
        return instance;
    }

}