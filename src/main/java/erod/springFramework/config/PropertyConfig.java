package erod.springFramework.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import erod.springFramework.examplebeans.FakeDataSource;
import erod.springFramework.examplebeans.FakeJmsBroker;

/**
*@author erod 2020-12-30
*/
@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
@PropertySources({
	@PropertySource("classpath:datasource.properties"),
	@PropertySource("classpath:jms.properties"),
})
public class PropertyConfig {
	
	@Autowired
	Environment envi; 
	
	@Value("${erod.username}")
	String user;
	
	@Value("${erod.password}")
	String password;
	
	@Value("${erod.dburl}")
	String url;
	
	@Value("${erod.jms.username}")
	String jmsUserName;
	
	@Value("${erod.jms.password}")
	String jmsPassword;
	
	@Value("${erod.jms.url}")
	String jmsUrl;
	
	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(envi.getProperty("USERNAME"));
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		return fakeDataSource;
	}
	
	@Bean
	public FakeJmsBroker fakeJmsBroker() {
		FakeJmsBroker fjmsb = new FakeJmsBroker();
		fjmsb.setUser(jmsUserName);
		fjmsb.setPassword(jmsPassword);
		fjmsb.setUrl(jmsUrl);
		return fjmsb;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer= new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}

}
