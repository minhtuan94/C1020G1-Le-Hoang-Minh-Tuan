package com.example.service.impl;


import com.example.model.Product;
import com.example.service.ProductService;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.Collections;
import java.util.List;

@Service
public class HibernateCustomerServiceImpl implements ProductService {

    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> findAll() {
        String query = "SELECT p from Product AS p";
        TypedQuery<Product> typedQuery = entityManager.createQuery(query,Product.class);
        return typedQuery.getResultList();
    }

    @Override
    public Product findById(int id) {
        String query = "SELECT p FROM Product AS p WHERE p.id = :id";
        TypedQuery<Product> typedQuery = entityManager.createQuery(query,Product.class);
        typedQuery.setParameter("id",id);
        return typedQuery.getSingleResult();
    }

    @Override
    public Product save(Product product) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            Product saveProduct;
            if (product.getId() != null) {
                saveProduct = findById(product.getId());
                saveProduct.setName(product.getName());
                saveProduct.setPrice(product.getPrice());
                saveProduct.setDate(product.getDate());

            } else {
                saveProduct = product;
            }
            session.saveOrUpdate(saveProduct);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return null;
    }

    @Override
    public boolean exists(int id) {
        List<Product> products = findAll();
        Product product = products.get(id);
        return (product != null);
    }

    @Override
    public void delete(int id) {
        Transaction transaction = null;

        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            Product product = findById(id);
            session.delete(product);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}
