package com.nagarro.AdvanceJavaAssignment3;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import com.nagarro.data.*;

public class Configure {
	
	List<Tshirt> searchedItems = new ArrayList<Tshirt>();

	@SuppressWarnings("unchecked")
	public List<Tshirt> searchItem(String color, String gender, String size,OutputPreference op) {
		
		Configuration configure = new Configuration().configure().addAnnotatedClass(Tshirt.class);
		StandardServiceRegistryBuilder serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configure.getProperties());
		SessionFactory sessionFactory = configure.buildSessionFactory(serviceRegistry.build());
		Session session = sessionFactory.openSession();
		
		try {
			if(op == OutputPreference.PRICE) {
				String hql = " from Tshirt where color="+"\'"+color+"\'"+" and gender="+"\'"+gender+"\'"+" and size="+"\'"+size+"\' order by price asc"; 
	     		@SuppressWarnings("rawtypes")
				Query query = session.createQuery(hql);
				searchedItems =query.list();
			}
			else if (op == OutputPreference.RATING) {
				String hql = " from Tshirt where color="+"\'"+color+"\'"+" and gender="+"\'"+gender+"\'"+" and size="+"\'"+size+"\' order by rating asc"; 
	     		@SuppressWarnings("rawtypes")
				Query query = session.createQuery(hql);
				searchedItems =query.list();
			}
			else { 
				String hql = " from Tshirt where color="+"\'"+color+"\'"+" and gender="+"\'"+gender+"\'"+" and size="+"\'"+size+"\' order by price,ratings asc";
	     		@SuppressWarnings("rawtypes")
				Query query = session.createQuery(hql);
				searchedItems =query.list();
			}
		} 
		catch (IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		} 
	
		return searchedItems;
	}
}
