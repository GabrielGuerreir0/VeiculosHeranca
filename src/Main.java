import model.Caminhao;
import model.Carro;
import model.Moto;
import model.Onibus;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("nisan", "350z", 2006, 2);
        Moto moto = new Moto("Honda", "CBR1000", 2019, 1000);
        Caminhao caminhao = new Caminhao("Volvo", "FH16", 2020, 18);
        Onibus onibus = new Onibus("Mercedes", "OF 1721", 2015, 50);

        // Exibindo detalhes
        System.out.println("Detalhes do Carro:");
        carro.exibirDetalhes();
        carro.mover();

        System.out.println("\nDetalhes da Moto:");
        moto.exibirDetalhes();
        moto.mover();

        System.out.println("\nDetalhes do Caminhão:");
        caminhao.exibirDetalhes();
        caminhao.mover();

        System.out.println("\nDetalhes do Ônibus:");
        onibus.exibirDetalhes();
        onibus.mover();
    }
}
