package br.com.ip.veiculo.model;

import br.com.ip.veiculo.Enumerador.EnumTipoCombustivel;
import br.com.ip.veiculo.contrato.IManutencao;
import br.com.ip.veiculo.contrato.ITributavel;

public class Caminhao extends  Veiculo implements ITributavel, IManutencao {
    private double capacidadeMaxima;
    public Caminhao(String modelo, int anoFabricacao, String placa, EnumTipoCombustivel tipoCombustivel, Proprietario proprietario,double capacidadeMaxima) {
        super(modelo, anoFabricacao, placa, tipoCombustivel);
        this.capacidadeMaxima=capacidadeMaxima;

    }

    public double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(double capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    @Override
    public boolean verificarManuntencao() {
        return false;
    }

    @Override
    public boolean calcularImposto() {
        return false;
    }

    public void Ligar(){
        System.out.println("o caminhão esta ligado");
    }
}
