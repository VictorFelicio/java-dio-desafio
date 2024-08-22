package edu.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agenda;

    public AgendaContatos() {
        this.agenda = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        this.agenda.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!this.agenda.isEmpty()) {
            this.agenda.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(this.agenda);
    }

    public void pesquisarPorNome(String nome) {
        if (!this.agenda.isEmpty()) {
            System.err.println(this.agenda.get(nome));

        }

    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Joao", 111);
        agendaContatos.adicionarContato("Victor", 222);
        agendaContatos.adicionarContato("Felicio", 333);
        agendaContatos.removerContato("Felicio");
        agendaContatos.exibirContatos();
        agendaContatos.pesquisarPorNome("Joao");
    }
}
