package br.com.ip.veiculo.model;

import br.com.ip.veiculo.Enumerador.EnumTipoCombustivel;
import br.com.ip.veiculo.contrato.ITributavel;

public class Moto extends Veiculo implements ITributavel {
    private int Cilindrada;
    public Moto(String modelo, int anoFabricacao, String placa, EnumTipoCombustivel tipoCombustivel,int cilindrada) {
        super(modelo, anoFabricacao, placa, tipoCombustivel);
        this.Cilindrada=cilindrada;
    }

    public int getCilindrada() {
        return Cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        Cilindrada = cilindrada;
    }

    @Override
    public boolean calcularImposto() {
        return false;

    }

    public String toString() {
        return "\n modelo: "+ getModelo()+
                "\n Ano de fabricação: " + getAnoFabricacao() +
                "\n placa: " + getPlaca() +
                "\n Tipo de Combustivel: "+ getTipoCombustivel() +
                "\n Cilindrada: " + getCilindrada()+
                "\n Tem imposto?: " + calcularImposto();

    }

    @Override
    public void Ligar() {
        System.out.println("a moto esta ligada");
    }
}
