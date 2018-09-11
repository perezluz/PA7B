import java.util.scanner;
public class PagoAgua{
public static void main(String[] args) {
  scanner input = new scanner (system.in);
  //
  system.out.printl("ingresa la altura de la alberca");
  double altura = input.nextDouble();
  system.out.printl("ingrese el largo de la alberca");
  double Largo = input.nextDouble();
  system.out.printl("ingresa el ancho  de la alberca");
  double ancho = input.nextDouble();
  system.out.printl("ingresa el costo de la alberca");
  double costo = input.nextDouble();

  int volumen = altura * Largo * ancho ;
  int pago = volumen * costo;
  system.out.System.out.println("el pago a realizar" + pago);
}
}
