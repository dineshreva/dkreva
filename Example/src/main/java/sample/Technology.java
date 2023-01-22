package sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Technology {
	int techId;
	String techName;
	@Autowired
	private TechMahindra mahindra;
	
	public TechMahindra getMahindra() {
		return mahindra;
	}
	public void setMahindra(TechMahindra mahindra) {
		this.mahindra = mahindra;
	}
	public int getTechId() {
		return techId;
	}
	public void setTechId(int techId) {
		this.techId = techId;
	}
	public String getTechName() {
		return techName;
	}
	public void setTechName(String techName) {
		this.techName = techName;
	}
	
	public void institute() {
		System.out.println(" Most demanding Technology ");
		System.out.println(mahindra.getId());
		System.out.println(mahindra.getName());
		
	}
	

}
