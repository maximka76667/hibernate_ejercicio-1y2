package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger("org.hibernate");
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.OFF);

		Configuration config = new Configuration();
		config.configure("./hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();

		// Leer
		Seguro seguroLeer = session.get(Seguro.class, 5);
		System.out.println(seguroLeer);

		// Insertar
//		Seguro seguroNuevo = new Seguro("12345678H", "Misha");
//
//		session.beginTransaction();
//		session.save(seguroNuevo);
//		session.getTransaction().commit();

		// Actualizar
//		Seguro seguroActualizar = session.get(Seguro.class, 10);
//
//		seguroActualizar.setApe1("Martinez");
//
//		session.beginTransaction();
//		session.update(seguroActualizar);
//		session.getTransaction().commit();
		
		// Borrar
//		Seguro seguroBorrar = session.get(Seguro.class, 52);
//
//		session.beginTransaction();
//		session.delete(seguroBorrar);
//		session.getTransaction().commit();
		
		System.out.println("Fin");
		session.close();
		factory.close();
	}

}
