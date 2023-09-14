package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio{

    // Atributos da classe Podcast além dos que estão sendo herdados da classe mãe Audio.

    private String apresentador;
    private String descricao;

    // Métodos getters e setters da classe Podcast além dos que estão sendo herdados da classe mãe Audio.

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    // Polimorfismo no metodo get da classe Podcast sobrepondo o get herdado da classe mãe Audio.

    @Override
    public int getCassificacao() {
        if (this.getTotalCurtidas() > 500){
            return 10;
        } else {
            return 8;
        }

    }
}
