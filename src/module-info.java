/**
 * 
 */
/**
 * Ejemplo del framework Spring con Java 11. Utilizando la anotación configuration.
 * @author Ricardo Presilla.
 * @version 1.0.
 */
module Spring7 {
	exports DemoAnotaciones;
	requires spring.core;
	requires spring.context;
	requires spring.beans;
	requires java.base;
	requires java.annotation;
}