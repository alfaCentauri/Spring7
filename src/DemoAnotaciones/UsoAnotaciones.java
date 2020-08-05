package DemoAnotaciones;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.beans.*;

public class UsoAnotaciones {

	public static void main(String[] args) {
		System.out.println("Demostración del uso de anotaciones con Configuraton en Spring.");
		try {
			AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
			Empleados Pedro = contexto.getBean("comercialExperimentado", Empleados.class);
			System.out.println(Pedro.getInforme());
			System.out.println(Pedro.getTareas());
			contexto.close();
		}catch(BeansException ex){
			System.out.println("Error: Con la creación del bean.");
		}
	}

}
