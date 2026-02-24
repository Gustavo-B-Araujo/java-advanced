import model.Carro;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fusca", 1975, "vw");
        System.out.println(carro.toString());
        carro.ligar();
        }
    }
