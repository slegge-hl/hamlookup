/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hamlookup.web.model.PubaccAm;
import org.hamlookup.web.model.PubaccCo;
import org.hamlookup.web.model.PubaccCoId;
import org.hamlookup.web.model.PubaccEn;
import org.hamlookup.web.model.PubaccHd;
import org.hamlookup.web.model.PubaccHs;
import org.hamlookup.web.model.PubaccHsId;
import org.hamlookup.web.model.PubaccLa;
import org.hamlookup.web.model.PubaccSc;
import org.hamlookup.web.model.PubaccSf;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.handler.AbstractHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("org.hamlookup.web")
@EnableTransactionManagement
public class ApplicationContextConfig extends WebMvcConfigurationSupport {
    @Bean(name = "viewResolver")
    public InternalResourceViewResolver getViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
     
    
    @Bean(name = "dataSource")
    public DataSource getDataSource() {
    	BasicDataSource dataSource = new BasicDataSource();
    	dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    	dataSource.setUrl("jdbc:mysql://localhost:3306/l_amat?zeroDateTimeBehavior=convertToNull");
    	dataSource.setUsername("username");
    	dataSource.setPassword("password");
    	
    	return dataSource;
    }
    
    
    private Properties getHibernateProperties() {
    	Properties properties = new Properties();
    	properties.put("hibernate.show_sql", "true");
    	properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
//
//		UN-COMMENT this to UPDATE TABLE SCHEMA!  (only use 'create' when prepared to START OVER)  
//    	
    	properties.put("hibernate.hbm2ddl.auto", "update");
//    	
//    	
    	return properties;
    }
    
    @Autowired
    @Bean(name = "sessionFactory")
    public SessionFactory getSessionFactory(DataSource dataSource) {
    	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
    	sessionBuilder.addProperties(getHibernateProperties());
    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	// 
    	// ADD MODEL CLASSES HERE
    	//
    	//

    	sessionBuilder.addAnnotatedClasses(PubaccHd.class);
    	sessionBuilder.addAnnotatedClasses(PubaccAm.class);
    	sessionBuilder.addAnnotatedClasses(PubaccEn.class);
    	sessionBuilder.addAnnotatedClasses(PubaccCo.class);
    	sessionBuilder.addAnnotatedClasses(PubaccCoId.class);
    	sessionBuilder.addAnnotatedClasses(PubaccHs.class);
    	sessionBuilder.addAnnotatedClasses(PubaccHsId.class);
    	sessionBuilder.addAnnotatedClasses(PubaccSf.class);
    	sessionBuilder.addAnnotatedClasses(PubaccSc.class);
    	sessionBuilder.addAnnotatedClasses(PubaccLa.class);
    	
    	return sessionBuilder.buildSessionFactory();
    }
    
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(
			SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(
				sessionFactory);

		return transactionManager;
	}
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Override
    @Bean
    public HandlerMapping resourceHandlerMapping() {
        AbstractHandlerMapping handlerMapping = (AbstractHandlerMapping) super.resourceHandlerMapping();
        handlerMapping.setOrder(-1);
        return handlerMapping;
    }
}
