package br.com.ip.veiculo.model;

import br.com.ip.veiculo.Enumerador.EnumTipoCombustivel;

public abstract class Veiculo {
    private String modelo;
    private int anoFabricacao;
    private String Placa;
    private EnumTipoCombustivel tipoCombustivel;



    public Veiculo(String modelo, int anoFabricacao, String placa, EnumTipoCombustivel tipoCombustivel) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        Placa = placa;
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public EnumTipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(EnumTipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void Ligar() {
        System.out.println("o carro esta ligado");
    }
}
