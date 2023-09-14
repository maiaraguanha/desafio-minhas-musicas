package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    // MinhasPreferidas classe criada para diminuir código, criando um método para incluir meus titulos favoritos
    // e passando como parametro a classe mãe, assim quando o metodo inclui for chamado ele vai buscar na classe
    // filha especifica assim não preciso copiar e colar o metodo nas duas subclasses.

    public void inclui (Audio audio){
        if (audio.getCassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto " +
                    "e preferido por todos!");
        } else {
            System.out.println(audio.getTitulo() + " também é um dos que todo mundo está " +
                    "curtindo");
        }
    }

}
