impor java.util.Scanner;
public class AreaFigura2{
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    System.out.printl("porfavor inserte la base del triangulo y radio:");
    double R = input.nextDouble();
    System.out.printl("inserte la hipotenusa del triangulo rectangulo:");
    double H = input.nextDouble();
    double SQRT = (H*H)-(R*R);
    double C = Math.sqrt(SQRT);
    double AT = 2*(R/2);
    double PI = 3.1416;
    double AC = (PI * Math.pow(R,2))/2;
    double area = AT + AC;
    System.out.System.out.println("el cateto faltante es:" + C);
    System.out.System.out.println("el area del triangulo es" + AT);
    System.out.System.out.println("el area del circulo es " + AC);
    System.out.System.out.println("el area de la figura es " + area);
  }
}
