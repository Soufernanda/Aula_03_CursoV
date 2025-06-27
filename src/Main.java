public class Main {
    public static void main(String[] args) {
        Caneta C1=new Caneta("Nic","Amarelo", 0.4f);
        //Metodo Acessor
        C1.status();
        //Outra Caneta
        Caneta C2= new Caneta("bazze","Verde",0.1f);
        C2.status();

    }
}