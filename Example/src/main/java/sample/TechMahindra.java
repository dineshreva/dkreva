package sample;

import org.springframework.stereotype.Component;

@Component
public class TechMahindra {
    int id;
	String name;
    public TechMahindra() {
    	id=123456;
    	name="Shami"; 			
    }
    
    public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}
