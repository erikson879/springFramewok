package erod.springFramework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import erod.springFramework.constroller.ConstructorInjectedController;
import erod.springFramework.constroller.MyController;
import erod.springFramework.constroller.PropertyInjectedController;
import erod.springFramework.constroller.SetterInjectedController;

@SpringBootApplication
@ComponentScan(value = {"erod.services","erod.springFramework.constroller"})
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		
		MyController controller = (MyController)ctx.getBean("myController");
		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
		
	}

}
