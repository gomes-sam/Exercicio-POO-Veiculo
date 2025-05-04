package br.com.ip.veiculo.model;

import br.com.ip.veiculo.Enumerador.EnumTipoCombustivel;
import br.com.ip.veiculo.contrato.IManutencao;
import br.com.ip.veiculo.contrato.ITributavel;

public class Carro extends Veiculo implements ITributavel, IManutencao {
    private int numeroPortas;

    public Carro(String modelo, int anoFabricacao, String placa, EnumTipoCombustivel tipoCombustivel,int numeroPortas) {
        super(modelo, anoFabricacao, placa, tipoCombustivel);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public boolean verificarManuntencao() {
        return getAnoFabricacao() < 2012;
    }

    @Override
    public boolean calcularImposto() {
        return getAnoFabricacao() < 2012;
    }
    public void Ligar(){
        System.out.println("o carro esta ligado");
    }
    @Override
    public String toString() {
        return  "Modelo: " + getModelo() +
                "\nAno de Fabricação: " + getAnoFabricacao() +
                "\nPlaca: " + getPlaca() +
                "\nTipo de Combustível: " + getTipoCombustivel() +
                "\nNúmero de Portas: " + getNumeroPortas() +
                "\nTem imposto? " + calcularImposto() +
                "\nPrecisa de manutenção? " + verificarManuntencao();
    }



}

