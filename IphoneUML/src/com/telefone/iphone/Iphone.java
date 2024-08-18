package com.telefone.iphone;

import java.util.Random;

import com.interfaces.aparelho.AparelhoTelefonico;
import com.interfaces.navegador.NavegadorInternet;
import com.interfaces.reprodutor.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    Random random = new Random();
    int limiteInferior = 1;
    int limiteSuperior = 10;
    int numeroAleatorio = limiteInferior + random.nextInt(limiteSuperior - limiteInferior);

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página https://www." + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo à ligação");
    }

    @Override
    public void iniciarCorreiroVoz() {
        System.out.println("Seu correio de voz, você possui " + numeroAleatorio + " mensagens");
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Tocando música escolhida " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada " + musica);
        tocar(musica);
    }
}
