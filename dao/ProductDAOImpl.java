package com.niit.cricketbackend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.niit.Cricketbakend.model.Product;


@Respository
@EnableTransactionManagement
@Transactional
public class ProductDAOImpl  implements ProductDao{
	
	@Autowired
	SessionFactory sessionFactory;

	public void addProduct(Product p) {
		Session session=sessionFactory.getCurrentSession();
		session.persist(p);
		
	}

	public void updateProduct(Product p) {
		Session session=sessionFactory.getCurrentSession();
		session.update(p);
		
	}

	public List<Product> listProduct() {
		Session session=sessionFactory.getCurrentSession();
		List<Product> product=session.createQuery("from Product").getResultList();
		return product;
	}

	public Product getProductById(int id) {
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.createQuery("from Person where id="+id).getSingleResult();
		return product;
		
	}
	
	public List<Product> getProductByCategory(String category) {
		Session session=sessionFactory.getCurrentSession();
		List<Product> product=session.createQuery("from Person where id="+String).getSingleResult();
		return product;
		
	}
	
	

	public void deleteProduct(int id) {
		Product session=sessionFactory.getCurrentSession();
		Person product=(Product)session.createQuery("from Product where id="+id).getSingleResult();
		session.delete(Product);
		
	}


}
