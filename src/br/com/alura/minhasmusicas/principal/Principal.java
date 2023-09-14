package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {


        // criando objeto da classe Musica e atribuindo argumentos aos atributos.

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");


        // laço para gerar reprodução e curtidas para o método reproduz e curte acessado pelo objeto da classe Musica.

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }


        // criando objeto da classe Podcast e atribuindo argumentos aos atributos.

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("TheBookIsOnTheTable");
        meuPodcast.setApresentador("Raphael");
        meuPodcast.setDescricao("Podcast sobre conhecimento na area tecnologica");


        // laço para gerar reprodução e curtidas para o método reproduz e curte acessado pelo objeto da classe Podcast.

        for (int i = 0; i < 3000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }


        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}
