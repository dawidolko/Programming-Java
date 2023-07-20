package pl.jaknauczycsieprogramowania;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    private static List<Book> books = new ArrayList();

    static {
        books.add(new Book("Lord of the Rings", "J.R.R. Tolkien", 5));
        books.add(new Book("1984", "George Orwell", 5));
        books.add(new Book("Harry Potter", "J.K. Rowling", 4));
    }

    @GetMapping("/books/all")
    @ResponseBody
    public String getAllBooks() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(books);
    }
}
