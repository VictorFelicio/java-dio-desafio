package edu.list.tarefas;

public class ListExercism {
    public static void main(String[] args) {
        ListaTarefas listMain = new ListaTarefas();

        listMain.adicionarTarefa("jogar futebol");
        listMain.adicionarTarefa("estudar java");
        listMain.adicionarTarefa("descansar depois");

        System.out.println(listMain.obterTotalDeTarefas());

        listMain.obterDescricaoTarefas();
        listMain.removerTarefa("jogar futebol");
        listMain.obterDescricaoTarefas();
    }
}
