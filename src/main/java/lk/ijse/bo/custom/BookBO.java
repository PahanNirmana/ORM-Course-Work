package lk.ijse.bo.custom;

import lk.ijse.bo.SuperBO;
import lk.ijse.dto.BookDTO;

import java.io.IOException;
import java.util.List;

public interface BookBO extends SuperBO {
    public String generateNewUserID() throws IOException;

    public List<BookDTO> getAllBookes() throws Exception;

    public boolean addBook(BookDTO dto) throws Exception;

    public boolean updateBook(BookDTO dto) throws Exception;

    public boolean deleteBook(String id) throws Exception;
}
