package casaV4.controle;

import casaV4.modelo.Aberturas;
import casaV4.modelo.Casa;
import casaV4.modelo.Janela;
import casaV4.modelo.Porta;
import casaV4.visualizacao.EntradaSaida;

import javax.swing.*;
import java.util.ArrayList;

public class Controladora {

    private Casa casa = null;

    public void exibeMenu() {
        int opcao;
        do{
            opcao = EntradaSaida.solicitaOpcao();

            switch (opcao) {
                case 0: {
                    this.casa = new Casa();

                    String descricao = EntradaSaida.solicitaDescricao("casa", 0);
                    String cor = EntradaSaida.solicitaCor();
                    int qtdePortas = EntradaSaida.solicitaQtdeAberturas("portas");
                    int qtdeJanelas = EntradaSaida.solicitaQtdeAberturas("janelas");

                    ArrayList<Aberturas> listaDePortas = new ArrayList<>();
                    for(int i = 0; i < qtdePortas; i++){
                        Porta porta = new Porta();
                        porta.setDescricao(EntradaSaida.solicitaDescricao("porta", (i+1)));
                        porta.setEstado(EntradaSaida.solicitaEstado("porta"));
                        listaDePortas.add(porta);
                    }

                    ArrayList<Aberturas> listaDeJanelas = new ArrayList<>();
                    for(int i = 0; i < qtdeJanelas; i++){
                        Janela janela = new Janela();
                        janela.setDescricao(EntradaSaida.solicitaDescricao("janela", (i+1)));
                        janela.setEstado(EntradaSaida.solicitaEstado("janela"));
                        listaDePortas.add(janela);
                    }

                    this.casa.constroiCasa(descricao, cor, listaDePortas, listaDeJanelas);

                    System.out.println("Descricao da casa: " + casa.getDescricao());
                    System.out.println("Cor da casa: " + casa.getCor());

                    for(Aberturas porta : casa.getListaDePortas()){
                        System.out.println("Descricao da porta: " + porta.getDescricao());
                        System.out.println("Estado da porta: " + porta.getEstado() + "\n" );
                    }

                    for(Aberturas janela : casa.getListaDeJanelas()){
                        System.out.println("Descricao da porta: " + janela.getDescricao());
                        System.out.println("Estado da porta: " + janela.getEstado() + "\n" );
                    }
                    break;
                }
                case 1: {
                    if(casa == null){
                        JOptionPane.showMessageDialog(null, "Casa ainda nao construida!");
                        break;
                    }
                    String tipoAbertura = EntradaSaida.solicitaTipoAbertura();

                    ArrayList<Aberturas> listaDeAberturas = new ArrayList<>();

                    if(tipoAbertura.equals("porta")) {
                        listaDeAberturas = this.casa.getListaDePortas();
                    } else {
                        listaDeAberturas = this.casa.getListaDeJanelas();
                    }

                    int posicao = EntradaSaida.solicitaAberturaMover(listaDeAberturas);
                    int novoEstado = 0;

                    if(posicao != -1) {
                        novoEstado = EntradaSaida.solicitaEstado(tipoAbertura);
                        Aberturas abertura = this.casa.retornaAbertura(posicao, tipoAbertura);
                        this.casa.moverAbertura(abertura, novoEstado);
                        System.out.println("Novo estado da " + tipoAbertura + ": " + abertura.getEstado());
                    } else {
                        EntradaSaida.exibeMsgAbertura();
                    }

                    break;
                }
                case 2: {
                    if(casa == null){
                        JOptionPane.showMessageDialog(null, "Casa ainda nao construida!");
                        break;
                    }
                    String informacoes = this.casa.geraInfoCasa();
                    EntradaSaida.exibeInforCasa(informacoes);
                    break;
                }
            }
        } while( opcao != 3 );

        EntradaSaida.exibeMsgEncerrarPrograma();

        System.exit(0);
    }
}
