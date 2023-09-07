package pl.globallogic.exercises;

public class ex38Main {

        public static void main(String[] args) {
            ex38Printer printer = new ex38Printer(50, true);
            System.out.println(printer.addToner(50));
            System.out.println("Initial page count = " + printer.getPagesPrinted());

            int pagesPrinted = printer.printPages(4);
            System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

            pagesPrinted = printer.printPages(2);
            System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        }

}
