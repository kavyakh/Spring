package com.zensar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;

/**
 * @author Kavya KH
 * @Creation_date  10th Oct 2019 4.05pm
 * @modification   10th Oct 2019 4.05pm
 * @version 3.0
 * @copyright ZenSar Technologies. All rights are reserved.
 * @description It is used in persistent layer
 *              It is a DAO class of Product
 */
@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		String sql = "select * from product";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<Product>>() {

			@Override
			public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<Product> products = new ArrayList<Product>();
				while(rs.next()) {
					Product product = new Product();
					product.setProductId(rs.getInt(1));
					product.setName(rs.getString(2));
					product.setBrand(rs.getString(3));
					product.setPrice(rs.getFloat(4));
					products.add(product);
				}
				return products;
			}
		});
	}

	@Override
	public Product getById(int productId) {
		// TODO Auto-generated method stub
		String sql = "select * from product where id=?";
		return jdbcTemplate.query(sql, new Object[]{productId},new ResultSetExtractor<Product>() {

			@Override
			public Product extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				if(rs.next()) {
					Product product = new Product();
					product.setProductId(rs.getInt(1));
					product.setName(rs.getString(2));
					product.setBrand(rs.getString(3));
					product.setPrice(rs.getFloat(4));
					return product;
					
				}else {
				return null;
			}
				}
		});
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		String sql = "update product set name=?,brand=?,price=? where id=?"; 
		jdbcTemplate.update(sql,  product.getName(),product.getBrand(),product.getPrice(),product.getProductId());
		System.out.println("product is Updated");
		
	}

	@Override
	public void insert(Product product) {
		// TODO Auto-generated method stub
		String sql = "Insert into product value(?,?,?,?)";
		jdbcTemplate.update(sql, product.getProductId(), product.getName(),product.getBrand(),product.getPrice());
		System.out.println("New product is Inserted");
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		String sql = "Delete from product where id=?";
		jdbcTemplate.update(sql, product.getProductId());
		System.out.println("product is deleted");
		
	}
	
	
}
