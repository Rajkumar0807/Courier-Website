package com;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TPCE {
	public static void main(String[]args) {
		Transaction tr=null;
		try (Session ses=HbUtil.getSesFactory().openSession()){
			tr=ses.beginTransaction();
			Emp e1=new Emp("raj");
			RegEmp e2=new RegEmp(500,"sales","Suresh");
			Trainee e3=new Trainee(200,"6-months","kumar");
			
			
			ses.persist(e1); ses.persist(e2); ses.persist(e3);
			
			tr.commit();
			ses.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
