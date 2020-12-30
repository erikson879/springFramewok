package erod.springFramework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import erod.springFramework.config.GreetingServiceConfig;
import erod.springFramework.constroller.ConstructorInjectedController;
import erod.springFramework.constroller.MyController;
import erod.springFramework.constroller.PropertyInjectedController;
import erod.springFramework.constroller.SetterInjectedController;
import erod.springFramework.examplebeans.FakeDataSource;
import erod.springFramework.examplebeans.FakeJmsBroker;

@SpringBootApplication
//@ComponentScan(value = {"erod.services","erod.springFramework.constroller","erod.springFramework.config.PropertyConfig"})
@ComponentScan(basePackages = {"erod.services","erod.springFramework.constroller","erod.springFramework.config"}, excludeFilters={
		  @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE, value=GreetingServiceConfig.class)})
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController)ctx.getBean("myController");
		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello(
				));
		FakeDataSource fakeDataSource = (FakeDataSource)
				ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getUrl());
		
		FakeJmsBroker fjb = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
		System.out.println(fjb.getUser());
		System.out.println(fjb.getPassword());
		System.out.println(fjb.getUrl());
	}
}
