import CartaoCreditoVirtual.Cartao;

public class Main {

    public static void main(String[] args){

        Cartao cartao1 = new Cartao(124, 1200);
        System.out.println("Cartão de Credito Virtual");
        System.out.println();

        cartao1.imprimir();
    }
}
