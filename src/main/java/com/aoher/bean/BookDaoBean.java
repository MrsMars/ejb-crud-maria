package com.aoher.bean;

import com.aoher.model.Book;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class BookDaoBean {

    @PersistenceContext
    private EntityManager em;

    public List<Book> getAll() {
        return em.createNamedQuery("Book.getAll", Book.class)
                .getResultList();
    }

    public Book find(Long id) {
        return em.createNamedQuery("Book.findOne", Book.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    public void save(Book book) {
        em.persist(book);
    }

    public void update(Book book) {
        em.merge(book);
    }

    public void delete(Book book) {
        em.remove(book);
    }
}
