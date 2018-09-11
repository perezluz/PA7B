impor java.util.scanner;
public class constructionArea{
  public static void main(String[] args) {
    scanner basetri = new scanner (system.in);
    scanner heighttri = new scanner (system.in);
    scanner baserec = new scanner (system.in);
    scanner heightrec = new scanner (system.in);
    system.out.printl("enter the basetri double");
    double basetri = input.nextDouble();
    system.out.printl("enter the heighttri double");
    double heighttri = input.nextDouble();
    system.out.printl("enter the baserec double");
    double baserec = input.nextDouble();
    system.out.printl("enter the heightrec double");
    double heightrec = input.nextDouble();
    int areatri = (basetri + heighttri)/2;
    int arearec= (baserec * heightrec);
    int areacons = areatri + arearec;
    system.out.System.out.println("your construction Area is" + areacons);
  }
}
