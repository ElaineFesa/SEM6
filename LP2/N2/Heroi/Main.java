public class Main {
    public static void main(String[] args){
        Heroi heroi = new Heroi("Superman", 300);
        heroi.voar();
        heroi.nadar();
        System.out.println("O heroi " + heroi.getNome() + " tem " + heroi.getqtdVida() + " de vida");
    }
}
