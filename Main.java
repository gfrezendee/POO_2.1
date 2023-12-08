public class Main {

    public static void main(String[] args) {

        DVD dvd = new DVD();
        dvd.inserirDados();

        CD cd = new CD();
        cd.inserirDados();

        System.out.println("DVD:");
        dvd.printDados();

        System.out.println("CD:");
        cd.printDados();
    }
}
