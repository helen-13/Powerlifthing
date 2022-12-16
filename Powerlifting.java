import java.util.Scanner;

class Atletas{
    private String nome;
    private String sobrenome;
    private String equipe;
    private String peso;
    
        public Atletas(String nome, String sobrenome, String equipe, int[] peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.equipe = equipe;
        this.peso = peso;
    }
    public Atletas() {}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getEquipe() {
        return equipe;
    }
    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }
    public String[] getPeso() {
        return peso;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }
    
}
