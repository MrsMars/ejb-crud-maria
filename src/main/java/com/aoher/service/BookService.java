package com.aoher.service;

import com.aoher.model.Book;

import javax.ejb.Remote;

@Remote
public interface BookService {

    Book find(Object id);
    Book createOrUpdate(Book book);
    void remove(Book book);
}
