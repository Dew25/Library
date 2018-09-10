/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import entity.Book;
import entity.LibHistory;
import entity.Reader;
import interfaces.Retentive;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author melnikov
 */
public class BaseStorage implements Retentive{

    @Override
    public void saveBook(Book book) {
        
    }

    @Override
    public void saveReader(Reader reader) {

    }

    @Override
    public void saveLibHistory(LibHistory libHistory) {

    }

    @Override
    public List<Book> loadListBooks() {
        List<Book> books = new ArrayList<>();
        return books;
    }

    @Override
    public List<Reader> loadListReaders() {
        List<Reader> readers = new ArrayList<>();
        return readers;
    }

    @Override
    public List<LibHistory> loadLibHistories() {
        List<LibHistory> libHistories = new ArrayList<>();
        return libHistories;
    }

   

    
}
