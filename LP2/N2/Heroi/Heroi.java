public class Heroi implements Voador, Nadar{

    public String nome;
    public int qtdVida;
    public Heroi(String nome, int qtdVida){
        this.nome = nome;
        this.qtdVida = qtdVida;
    }
    public int getqtdVida(){
        return qtdVida;
    }
    public void setqtdVida(int qtdVida){
        this.qtdVida = qtdVida;
    }
    public String getNome(){
        return nome;
    }
    public void voar(){
        System.out.println("O heroi " + nome + " esta voando");
    }
    public void nadar(){
        System.out.println("O heroi " + nome + " esta nadando");
    }
}