/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package wsCalculadora;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        System.out.println(new App().getGreeting());
        System.out.println("CALCULADORA");
        System.out.println("===========");
        System.out.println("2+3="+ c.suma(2, 3));
        System.out.println("2*3=" + c.multiplica(2, 3));
        System.out.println("3.4 * 4.5=" + c.multiplica(3.4,4.5));

        System.out.println("Sen(0)="+c.seno(0));
        System.out.println("Cos(0)="+c.coseno(0));
        System.out.println("Tan(0)="+c.tangente(0));
        System.out.println("5^2 ="+c.exponencial( 5.00 , 2.00 ));
        System.out.println("144^1/2 ="+c.exponencial( 144.0 , 0.5 ));
    }
}
