package Recursividad;

public class Recursividad {
    public static void main(String[] args) {
        Recursividad r = new Recursividad();
        System.out.println(r.sumaSuceciva(5));
        System.out.println(r.DigitosNumero(123456));
        System.out.println();
        System.out.println(r.multi(5, 4));
        System.out.println(r.div(11, 3));
        System.out.println(r.residuo(11, 3));
        r.numeros(9);
        System.out.println();
        System.out.println(r.numerosInversos(9));
        System.out.println(r.factorial(5));
        r.impresionInversa(5768);
    }

    public int sumaSuceciva(int n){
        return (n == 1) ? 1 : n + sumaSuceciva(n-1);
    }

    public int suma(int x, int y){
        return (x + y);
    }

    //Crear un metodo recursivo de obtener los digitos 
    public int DigitosNumero(int numero){
        return (numero < 10) ? 1 : 1+DigitosNumero(numero/10);
    }


    public int multi(int x, int y) {
        return (x == 0 || y == 0) ?  0 :  x  + multi(x, y - 1);
    }

    public int div(int x, int y) {
        return (x < y) ? 0 : 1 + div(x - y, y);
    }

    public int residuo(int x, int y) {
        return (x < y) ? x :  residuo(x - y, y);
    }

    public void numeros(int n) {
        if (n > 0) {
            numeros(n - 1);
            System.out.print(n+" ");
        }
    }

    public int numerosInversos(int n){
        if (n == 1) {
            return 1;
            }
        else{
            System.out.print(n+" ");
            return numerosInversos(n-1);
        }
    }   

    public int factorial(int n){
        if (n < 2)
            return 1;
        else
        return n * factorial(n-1);
    }

    public void impresionInversa(int n){
        if (n > 0){
            System.out.print(n%10);
            impresionInversa(n/10);
        }
    }
}