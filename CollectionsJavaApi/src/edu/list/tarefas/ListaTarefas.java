package edu.list.tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> listaDeTarefas;

    public ListaTarefas() {
        this.listaDeTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        this.listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : this.listaDeTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }
        this.listaDeTarefas.removeAll(tarefasParaRemover);
    }

    public int obterTotalDeTarefas() {
        return this.listaDeTarefas.size();
    }

    public void obterDescricaoTarefas() {

        System.out.println(this.listaDeTarefas);
    }

}
