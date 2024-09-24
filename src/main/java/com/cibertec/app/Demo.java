package com.cibertec.app;

import java.util.List;

import com.cibertec.model.Brand;
import com.cibertec.model.Category;
import com.cibertec.model.Color;
import com.cibertec.model.Department;
import com.cibertec.model.Material;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Demo {
	
	public static void main(String[] args) {
		EntityManagerFactory conexion = Persistence.createEntityManagerFactory("jpa_cibertec");
		EntityManager em = conexion.createEntityManager();
		
		List<Brand> listBrand = em.createNativeQuery("select * from tb_brand", Brand.class).getResultList();
		
		System.out.println("#################################################################");
		for (Brand b : listBrand) {
			System.out.println("Las marcas que hay son : " + b.getId() + "\t" + b.getBrand());
			System.out.println("---------------");
		}
		
		//#################################################################
		
		List<Category> listCategory = em.createNativeQuery("select * from tb_category", Category.class).getResultList();
		
		System.out.println("#################################################################");
		for (Category c : listCategory) {
			System.out.println("Las marcas que hay son : " + c.getId() + "\t" + c.getCategory());
			System.out.println("---------------");
		}
		
		//#################################################################
		
		List<Color> listColor = em.createNativeQuery("select * from tb_color", Color.class).getResultList();
		
		System.out.println("#################################################################");
		for (Color c : listColor) {
			System.out.println("Las marcas que hay son : " + c.getId() + "\t" + c.getColor());
			System.out.println("---------------");
		}
		
		//#################################################################
		
		List<Department> listDepartment = em.createNativeQuery("select * from tb_department", Department.class).getResultList();
		
		System.out.println("#################################################################");
		for (Department d : listDepartment) {
			System.out.println("Las marcas que hay son : " + d.getId() + "\t" + d.getDepartment());
			System.out.println("---------------");
		}
		
		//#################################################################
		
		List<Material> listMaterial = em.createNativeQuery("select * from tb_material", Material.class).getResultList();
		
		System.out.println("#################################################################");
		for (Material m : listMaterial) {
			System.out.println("Las marcas que hay son : " + m.getId() + "\t" + m.getMaterial());
			System.out.println("---------------");
		}
		
		
	}
	
	
	
	
	
}
