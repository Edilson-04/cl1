package pe.edu.cibertec.DAWI_CL1_GALINDO.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.DAWI_CL1_GALINDO.model.db.Especialidad;
import pe.edu.cibertec.DAWI_CL1_GALINDO.repository.EspecialidadRepository;



@Service
public class Especialidadservice {
	
	@Autowired
	private EspecialidadRepository especialidadRepository;
	
	public List<Especialidad> listarEspecialidad(){
		return especialidadRepository.findAll();
	}
	
	public void registrarEspecialidad(Especialidad especialidad) {
		especialidadRepository.save(especialidad);
	}
	

}
