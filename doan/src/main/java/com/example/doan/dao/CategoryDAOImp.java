package com.example.doan.dao;

import com.example.doan.entity.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CategoryDAOImp implements  CategoryDAO {
    private EntityManager em;
    @Autowired
    public CategoryDAOImp(EntityManager em) {
        this.em = em;
    }
    @Override
    public List<Category> findAll() {
        TypedQuery<Category> query = em.createQuery(" FROM Category", Category.class);
        return query.getResultList();
    }

    @Override
    public Category findById(int id) {
        return em.find(Category.class,id);
    }

    @Override
    @Transactional
    public Category save(Category category) {
        Category saved = em.merge(category);
        return saved;
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Category category= em.find(Category.class,id);
        em.remove(category);
    }
}
