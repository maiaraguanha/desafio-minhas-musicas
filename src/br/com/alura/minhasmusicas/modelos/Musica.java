package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio{

    // Atributos da classe Musica além dos que estão sendo herdados da classe mãe Audio.

    private String album;
    private String artista;
    private String genero;


    // Métodos getters e setters da classe Musica além dos que estão sendo herdados da classe mãe Audio.

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    // Polimorfismo no metodo get da classe Musica sobrepondo o get herdado da classe mãe Audio.

    @Override
    public int getCassificacao() {
        if (this.getTotalReproducoes() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
