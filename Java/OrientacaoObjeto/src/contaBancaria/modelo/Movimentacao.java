package contaBancaria.modelo;

import java.time.OffsetDateTime;

public class Movimentacao {
    private String tipo;
    private double valor;
    private String data;

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setData() {
        this.data = OffsetDateTime.now().getDayOfMonth() + "/"
                + OffsetDateTime.now().getMonthValue() + "/"
                + OffsetDateTime.now().getYear();
    }

    public String getData(){
        return data;
    }
}
