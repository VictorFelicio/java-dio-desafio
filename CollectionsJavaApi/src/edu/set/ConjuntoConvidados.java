package edu.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {

        this.convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigo) {

        Convidado convidadoRemover = null;

        for (Convidado cvd : this.convidados) {
            if (cvd.getCodigoDoConvite() == codigo) {
                convidadoRemover = cvd;
                break;
            }

        }

        this.convidados.remove(convidadoRemover);
    }

    public void contarConvidados() {
        System.out.println(this.convidados.size());

    }

    public void exibirConvidados() {
        System.out.println(this.convidados);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Joao", 1);
        conjuntoConvidados.adicionarConvidado("Joaozinho", 1);
        conjuntoConvidados.adicionarConvidado("Victor", 2);
        conjuntoConvidados.adicionarConvidado("Felicio", 3);

        conjuntoConvidados.contarConvidados();
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(2);

        conjuntoConvidados.contarConvidados();
        conjuntoConvidados.exibirConvidados();

    }

}
