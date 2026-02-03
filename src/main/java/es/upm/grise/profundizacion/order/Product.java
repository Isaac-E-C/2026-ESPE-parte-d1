package es.upm.grise.profundizacion.order;

public class Product {
	
	// Please notice the difference between the class diagram and this implementation
	// The reason is to facilitate unit testing
	
	long id;
	
	void setId(long id) {
		
		this.id = id;
		
	}
	
	long getId() {
		
		return id;
		
	}

}
