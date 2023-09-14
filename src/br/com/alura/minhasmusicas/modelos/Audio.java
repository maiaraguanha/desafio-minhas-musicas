package br.com.alura.minhasmusicas.modelos;

public class Audio {

    // Atributos da classe mãe.

    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int cassificacao;


    // Métodos getters e setters da classe mãe.

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }


    // método getter modificado em duas classes filhas.
    public int getCassificacao() {
        return cassificacao;
    }

    // Métodos criado na classe mãe.

    public void curte(){
        this.totalCurtidas++; // adiciona curtidas.
    }

    public void reproduz(){
        this.totalReproducoes++; // adiciona reproduções.
    }

}
