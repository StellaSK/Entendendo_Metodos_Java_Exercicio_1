public class Mensagem {
    public static void mensagem(int hora){

        switch (hora) {
            case 5, 6, 7, 8, 9, 10, 11, 12 -> bomDia();
            case 13, 14, 15, 16, 17 -> boaTarde();
            case 18, 19, 20, 21, 22, 23, 0, 1, 2, 3, 4 -> boaNoite();
            default -> System.out.println("Horario invalido!");
        }
    }

    public static void bomDia() {
        System.out.println("Bom dia!");
    }

    public static void boaTarde() {
        System.out.println("Boa Tarde!");
    }

    public static void boaNoite() {
        System.out.println("Boa Noite!");
    }
}
