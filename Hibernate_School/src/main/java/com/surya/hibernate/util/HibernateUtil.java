package com.surya.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.surya.hibernate.entity.Students;

public class HibernateUtil {
    
    private static StandardServiceRegistry registry;
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                // Create the registry using the hibernate.cfg.xml configuration file
                registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

                // Create MetadataSources
                MetadataSources sources = new MetadataSources(registry);

                // Register your annotated entity classes here
                sources.addAnnotatedClass(Students.class);
                
                // Create Metadata
                Metadata metadata = sources.getMetadataBuilder().build();

                // Build the SessionFactory from the Metadata
                sessionFactory = metadata.getSessionFactoryBuilder().build();
            } catch (Exception e) {
                e.printStackTrace();
                if (registry != null) {
                    StandardServiceRegistryBuilder.destroy(registry);
                }
            }
        }
        return sessionFactory;
    }

    public static void shutdown() {
        if (registry != null) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
}
