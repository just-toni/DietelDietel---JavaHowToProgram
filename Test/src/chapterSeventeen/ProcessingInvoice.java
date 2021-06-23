package chapterSeventeen;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ProcessingInvoice {

    public static void main(String[] args) {
        ManipulatingStreamsInvoice[] invoice ={
                new ManipulatingStreamsInvoice(83, "Electric sander", 7, 57.98),
                new ManipulatingStreamsInvoice(24, "Power saw", 18, 99.99),
                new ManipulatingStreamsInvoice(7, "Sledge hammer", 11, 21.50),
                new ManipulatingStreamsInvoice(77, "Hammer", 76, 11.99),
                new ManipulatingStreamsInvoice(39, "Lawn mower", 3, 79.50),
                new ManipulatingStreamsInvoice(68, "Screwdriver", 106, 6.99),
                new ManipulatingStreamsInvoice(56, "Jig saw", 21, 11.00),
                new ManipulatingStreamsInvoice(3, "Wrench", 34, 7.50)
        };

        List<ManipulatingStreamsInvoice> list = Arrays.asList(invoice);
        System.out.println("Complete Invoice List: ");
        list.stream().forEach(System.out::println);

        System.out.println("Invoice according to Part Description");
        list.stream()
                .sorted(Comparator.comparing(ManipulatingStreamsInvoice::getPartDescription))
                .forEach(System.out::println);
        System.out.println("Invoice according to Price");
        list.stream()
                .sorted(Comparator.comparing(ManipulatingStreamsInvoice::getPrice))
                .forEach(System.out::println);

    }

}
