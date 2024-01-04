package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.soap.SOAPConstants;
import jakarta.xml.ws.BindingType;
import model.Book;

import java.util.List;

@WebService(name = "BookService")
@BindingType(SOAPConstants.SOAP_1_2_PROTOCOL)
public interface BookService {
    @WebMethod(operationName = "getBook")
    Book getBook(@WebParam(name="id") int id);
    @WebMethod(operationName = "getBooks")
    List<Book> getBooks();
    @WebMethod(operationName = "getBooksByName")
    List<Book> getBooks(@WebParam(name="bookName") String bookName);
    @WebMethod(operationName = "addBook")
    int addBook(@WebParam(name = "book", targetNamespace="http://model") Book book);
    @WebMethod(operationName = "removeBook")
    int removeBook(@WebParam(name="id") int id);
    @WebMethod(operationName = "updateBook")
    void updateBook(@WebParam(name = "book", targetNamespace="http://model") Book book);
}
