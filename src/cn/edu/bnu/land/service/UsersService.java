package cn.edu.bnu.land.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bnu.land.model.Users;

@Service
public class UsersService {
	 private SessionFactory sessionFactory;
	   
	   @Autowired
		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}
	   public boolean confirmDeviceUser(String a,String b){
		   
		   
		   return true;
		   
	   
	   }
	   public Map<String, Object> getUserData(String searchKey) {

			String hql = "from Users ";
			System.out.println(hql);
			List<Users> results = null;
			try {
				org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
				results = (List<Users>) query.list();
			} catch (Exception e) {
				e.printStackTrace();
			}

			Map<String, Object> myMapResult = new TreeMap<String, Object>();
			myMapResult.put("root", results);
			myMapResult.put("success", true);

			return myMapResult;

		}
}
