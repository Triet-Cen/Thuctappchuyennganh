package com.example.doan.dao;

import com.example.doan.entity.Category;
import com.example.doan.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Repository
public class ProductDAOImp implements ProductDAO {

    private EntityManager em;
    @Autowired
    public ProductDAOImp(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Product> findAll() {
        TypedQuery<Product> query = em.createQuery(" FROM Product",
                Product.class);
        return query.getResultList();
    }

    @Override
    public Product findById(int id) {
        return em.find(Product.class,id);
    }

    @Override
    @Transactional
    public Product save(Product product) {
        Product saved= em.merge(product);
        return saved;
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Product product=em.find(Product.class,id);
        em.remove(product);
    }
}