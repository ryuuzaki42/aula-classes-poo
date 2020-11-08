public class CanetaMainVer3 {
    public static void main(String[] args) {
        CanetaVer3 c1 = new CanetaVer3();
        c1.setCor("azul");
        c1.setCarga(90);
        System.out.println("Status c1");
        c1.status();

        CanetaVer3 c2 = new CanetaVer3("verde", 55);
        System.out.println("Status c2");
        c2.status();
    }
}
