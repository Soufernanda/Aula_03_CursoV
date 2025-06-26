public class Main {
    public static void main(String[] args) {
        Caneta C1= new Caneta();
        C1.cor="Azul";
        C1.ponta=0.5f;
        C1.tampar();
        C1.carga=80;
        C1.modelo="BIC";
        C1.rabiscar();
        C1.status();
        System.out.println("======================");
        Caneta C2= new Caneta();
        C2.cor="Preta";
        C2.ponta=0.7f;
        C2.destampar();
        C2.carga=70;
        C2.modelo="Compac";
        C2.rabiscar();
        C2.status();

    }
}