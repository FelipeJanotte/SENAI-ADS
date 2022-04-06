package casaV4.modelo;

import java.util.ArrayList;

public class Casa {

    private String descricao;
    private String cor;
    private ArrayList<Aberturas> listaDePortas = new ArrayList<>();
    private ArrayList<Aberturas> listaDeJanelas = new ArrayList<>();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public ArrayList<Aberturas> getListaDePortas() {
        return listaDePortas;
    }

    public void setListaDePortas(ArrayList<Aberturas> listaDePortas) {
        this.listaDePortas = listaDePortas;
    }

    public ArrayList<Aberturas> getListaDeJanelas() {
        return listaDeJanelas;
    }

    public void setListaDeJanelas(ArrayList<Aberturas> listaDeJanelas){
        this.listaDeJanelas = listaDeJanelas;
    }

    public void constroiCasa(String descricao,
                             String cor,
                             ArrayList<Aberturas> listaDePortas,
                             ArrayList<Aberturas> listaDeJanelas){
        setDescricao(descricao);
        setCor(cor);
        setListaDeJanelas(listaDeJanelas);
        setListaDePortas(listaDePortas);
    }

    public Aberturas retornaAbertura (int posicao, String tipoAbertura) {
        if(tipoAbertura.equals("porta")) {
            return this.listaDePortas.get(posicao);
        } else {
            return this.listaDeJanelas.get(posicao);
        }
    }

    public void moverAbertura(Aberturas abertura, int novoEstado) {
        abertura.setEstado(novoEstado);
    }

    public String geraInfoCasa() {
        String informacoes = "Descricao " + this.descricao + "\n" +
                "Cor: " + this.cor + "\n" +
                "Lista de portas: \n";

        for(Aberturas abertura: this.listaDePortas) {
            int estado = abertura.getEstado();
            String estadoString = "";
            if(estado == 0) {
                estadoString = "Fechada";
            } else {
                estadoString = "Aberta";
            }
            informacoes += abertura.getDescricao() + " Estado " + estadoString + "\n";
        }

        informacoes += "\nLista de janelas:\n";

        for(Aberturas abertura: this.listaDeJanelas){
            int estado = abertura.getEstado();
            String estadoString = "";
            if(estado == 0) {
                estadoString = "Fechada";
            } else {
                estadoString = "Aberta";
            }
            informacoes += abertura.getDescricao() + " Estado: " + estadoString + "\n";
        }

        return informacoes;
    }
}
