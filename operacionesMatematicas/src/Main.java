public class Main {
    public static void main(String[] args) {
        OperacionesMatematicas suma1 = new OperacionesMatematicas(5, 7);
        System.out.println("El resultado 1: " + suma1.suma(5, 7));
        OperacionesMatematicas suma2 = new OperacionesMatematicas(5, 7, 8);
        System.out.println("El resultado 2: " + suma2.suma(5, 7, 8));
        OperacionesMatematicas suma3 = new OperacionesMatematicas(5.2, 7.4);
        System.out.println("El resultado 3: " + suma3.suma(5.2, 7.4));
    }
}