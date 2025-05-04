package br.com.ip.veiculo.main;

import br.com.ip.veiculo.Enumerador.EnumTipoCombustivel;
import br.com.ip.veiculo.model.*;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("hotwells",2010,"213556545", EnumTipoCombustivel.GASOLINA,4);
        Proprietario proprietario = new Proprietario("Samuel","2022565668");
        Motor motor = new Motor(4);

        carro.Ligar();
        System.out.println(carro);
        System.out.println("------------------------");


        Moto moto = new Moto("MT-07",2017,"2164545",EnumTipoCombustivel.GASOLINA,10);
        Proprietario samu = new Proprietario("bastião","25545366");
        System.out.println(moto);
        moto.Ligar();
        System.out.println(samu.getCpf());
        System.out.println(samu.getNome());








    }

}
