public class OperacionesMatematicas {
    public double a;
    public double b;
    public double c;

    public OperacionesMatematicas(int a, int b){
        this.a = a;
        this.b = b;
    }

    public OperacionesMatematicas(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public OperacionesMatematicas(double a, double b){
        this.a = a;
        this.b = b;
    }


    public int suma(int a, int b){
        return (a + b);
    }
    public int suma(int a, int b, int c){
        return (a + b + c);
    }
    public double suma(double a, double b){
        return (a + b );
    }
}
