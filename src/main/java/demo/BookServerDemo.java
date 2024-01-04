package demo;

import jakarta.xml.ws.Endpoint;
import jakarta.xml.ws.soap.SOAPBinding;
import service.BookServiceImpl;

import java.util.Scanner;

public class BookServerDemo {
    public static final BookServiceImpl implementor = new BookServiceImpl();
    public static final String ADDRESS = "http://localhost:9090/books";

    public static void main(String[] args) {
        System.out.println("Starting Server");

        Endpoint endpoint = Endpoint.create(SOAPBinding.SOAP12HTTP_BINDING, implementor);
        endpoint.publish(ADDRESS);

        System.out.println("Server ready... at " + ADDRESS);

        System.err.println("Press <enter> to stop service... ");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        sc.close();
        endpoint.stop();
        System.out.println("Server exit");
    }
}
