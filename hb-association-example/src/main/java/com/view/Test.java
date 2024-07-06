package com.view;

import org.hibernate.Session;
import org.hibernate.Transaction;



public class Test {
   public static void main(String args[]) {
	   Transaction tr = null;
	   try(Session ses = HBUtil.getSesFactory().openSession()){
		   tr = ses.beginTransaction();
		   Employee e = new Employee();
		   e.setName("Kavinilavu");
		   e.setEmail("nilavueshanth@gmail.com");
		   Address a = new Address();
		   a.setLin1("22/7 , Thathikadu");
		   a.setLine2("Kangeyam");
		   a.setCity("Tiruppur");
		   a.setState("TamilNadu");
		   
		   a.setPin(638701);
		   a.setE(e);
		   e.setAddr(a);
		   ses.persist(e);
		   ses.persist(a);
		   tr.commit();
		   ses.close();		  
		   
	   }
   }
}
