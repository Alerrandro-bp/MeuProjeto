package test.java.Teste;

public class DadosUsuario {
    private String nome;
    private int idade;
    private double peso;
    //SETS
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome.substring(0,1).toUpperCase(); //Motra no 0 e terminha no 1 mas não mostra 1...!
    }                                                 //"zuleide" = 0-Z
    public void setPeso(double peso) {
        this.peso = peso;
    }
    //GETS
    public double getPeso() {
        return peso;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
}