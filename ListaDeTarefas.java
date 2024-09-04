package DesafioAgosto;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ListaDeTarefas {
    public static void main(String[] args) {
        // Variavel da condição do while;
        var Continuar = 0;
        // A Index das tarefas;
        var Index = 1;
        List<String> Tarefas = new ArrayList<>();
        do { 
            // Menu Principal -----
            String Op[] = {"Adicionar", "Marcar", "Listar"};
            Integer Menu = JOptionPane.showOptionDialog(null, "Adicionar Tarefa\nMarcar tarefa como Concluida\nListar Tarefas",
                                 "Menu", 0,  JOptionPane.QUESTION_MESSAGE, null, Op, Op[0]);
            if (Menu.equals(0)) {
                var NewTa = "Texto Da Tarefa";
                var Vazio = "";
                // Caso o usario tente mandar algo sem ter digitado
                while (Vazio.equals("")){
                    NewTa = JOptionPane.showInputDialog(null, "Digite Sua Tarefa: ", "Adicionando Tarefa", 3);
                    // Caso o usario aperte o botão de cancelar ou de X, volta para o menu.
                    if (NewTa == null) {
                        break;
                    }
                    Vazio = NewTa.replaceAll(" ", "");
                    if (Vazio.equals("")) {
                        JOptionPane.showMessageDialog(null, "E necessario Digitar Algo","Tarefa Vazia", JOptionPane.WARNING_MESSAGE);
                    }else {
                        // Tirando os espaços extras entre palavras;
                        var Espaco = NewTa.replaceAll("\\s+", " ");
                        // Adicionando o Texto na arrayList
                        var FnewTa = String.format("Index: %d | Tarefa: %s | Status: Não Concluida", Index, Espaco.trim());
                        Tarefas.add(FnewTa);
                        Index++;
                    }
                }
            }
            else if(Menu.equals(1)) {
                Integer Selecionar = Integer.parseInt("100000");
                var IndexExistente = Tarefas.size();
                while (IndexExistente < Selecionar || Selecionar <= 0) {
                    var MostrarTarefas = Tarefas.size(); 
                    var Es = "-";
                    StringBuilder Formatando = new StringBuilder();
                    String S = "";
                    if (MostrarTarefas == 0) {
                        Formatando.append("SEM TAREFAS\n");
                        S = JOptionPane.showInputDialog(null, Formatando + Es.repeat(40) + "\nInforme a index da tarefa: ", "Marcando Tarefa", 3);
                    }   
                    else {
                        for (var Tarefa : Tarefas) 
                            Formatando.append(Tarefa).append("\n");
                        S = JOptionPane.showInputDialog(null, Formatando + Es.repeat(40) + "\nInforme a index da tarefa: ", "Marcando Tarefa", 3);
                    } 
                   
                    var NotNumber = true;
                    var Exit = false;
                    while (NotNumber) {
                        NotNumber = false;
                        if (S == null) {
                            Exit = true;
                            break;
                        }else {
                            var vazio = S.replaceAll(" ", "");
                            if (vazio.equals("")) {
                                S = "A";
                            }
                            // Tirando os espaços;
                            S = S.trim();
                            for (var c = 0; c < S.length(); c++) {
                                if (S.charAt(c) < '0' || S.charAt(c) > '9') {
                                    JOptionPane.showMessageDialog(null, "Utilize apenas numeros Inteiros", "Tentativa de Inserir numeros não inteiros", JOptionPane.ERROR_MESSAGE);
                                    S = JOptionPane.showInputDialog(null, Formatando + Es.repeat(40) + "\nInforme a index da tarefa: ", "Marcando Tarefa", 3);
                                    NotNumber = true; 
                                    break;
                        }
                    }}}
                    if (Exit) {
                        break;
                    }
                    Selecionar = Integer.parseInt(S);
                    if (IndexExistente < Selecionar || Selecionar <= 0) {
                        JOptionPane.showMessageDialog(null, "Tarefa Não Encontrada");
                    } else {
                        var Tarefa = Tarefas.get(Selecionar - 1);
                        var VerificandoStatus = Tarefa.contains("Não");
                        if (VerificandoStatus == false) {
                            JOptionPane.showMessageDialog(null, "Tarefa Já foi Marcada","", JOptionPane.WARNING_MESSAGE);
                        } else {
                            var AlterarStatus = Tarefa.replace("Não Concluida", "Concluida"); 
                            Tarefas.set(Selecionar - 1, AlterarStatus);
                            JOptionPane.showMessageDialog(null, "Tarefa Marcada com Sucesso");
                        }
                        
                    }
                }
            }
            else if(Menu.equals(2)){
                var MostrarTarefas = Tarefas.size();
                if (MostrarTarefas == 0) {
                    JOptionPane.showMessageDialog(null, "Sem Tarefas", "Adicione Tarefas", JOptionPane.WARNING_MESSAGE);
                }
                else {
                    StringBuilder Formatando = new StringBuilder();
                    for (var Tarefa : Tarefas) 
                        Formatando.append(Tarefa).append("\n");
                    JOptionPane.showMessageDialog(null, Formatando);
                }  
            }else {
                Continuar = 1;
            }
        } while (Continuar == 0);
    }
}