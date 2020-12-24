package erod.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
@Component
public class LifeCycleDemoBean implements InitializingBean,
DisposableBean,BeanNameAware,
BeanFactoryAware,ApplicationContextAware{

	
	public LifeCycleDemoBean() {
		super();
		System.out.println("I'm in LifeCycleDemoBean constructor");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Application contest  has been set");
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Bean factory has been set");
		
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("My bean name is "+name);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("The LifeCycleDemoBean is destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("The LifeCycleDemoBean has property set");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("The postConstruct method has been called");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("The preDestroy method has been called");
	}
	
	public void beforeInit() {
		System.out.println("The beforeInit method has been called");
	}
	public void afterInit() {
		System.out.println("The afterInit method has been called");
	}
}
