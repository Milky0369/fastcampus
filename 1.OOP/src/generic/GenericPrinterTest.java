package generic;

public class GenericPrinterTest {

    public static void main(String[] args) {

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        Powder powder = new Powder();

        powderPrinter.setMeterial(powder);

        System.out.println(powderPrinter.toString());

        powderPrinter.printing();


        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        Plastic plastic = new Plastic();

        plasticPrinter.setMeterial(plastic);

        System.out.println(plasticPrinter.toString());

        plasticPrinter.printing();


//        GenericPrinter<Water> waterPrinter = new GenericPrinter<>();
//        Water water = new Water();
//
//        waterPrinter.setMeterial(water);
//
//        System.out.println(waterPrinter.toString());

    }

}
