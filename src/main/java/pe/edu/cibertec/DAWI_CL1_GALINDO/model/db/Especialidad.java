package pe.edu.cibertec.DAWI_CL1_GALINDO.model.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="especialidad")
public class Especialidad {
	
	@Id
	private Integer idespecialidad;
	@Column(name="nomesp")
	private String nomesp;
	@Column(name="costo")
	private double costo;
	

}
