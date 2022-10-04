package main;

import java.sql.Date;

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
//		Seguro seguroLeer = session.get(Seguro.class, 5);
//		System.out.println(seguroLeer);

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

		java.sql.Timestamp fechasql = new java.sql.Timestamp(new java.util.Date().getTime());

		Seguro seguro = new Seguro(311, "12345678Z", "Juan", "Cano", "Morales", 38, 3, fechasql);

		session.beginTransaction();
		session.save(seguro);
		session.getTransaction().commit();

		Asistenciamedica asistenciaMedica1 = new Asistenciamedica(311, seguro, "Ir al médico de cabecera por fiebre",
				"Valencia");

		session.beginTransaction();
		session.save(asistenciaMedica1);
		session.getTransaction().commit();

		Asistenciamedica asistenciaMedica2 = new Asistenciamedica(312, seguro, "Operacion de apendicitis", "Castellón");

		session.beginTransaction();
		session.save(asistenciaMedica2);
		session.getTransaction().commit();

		System.out.println("Fin");
		session.close();
		factory.close();
	}

}
