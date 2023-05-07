package pe.edu.cibertec.DAWI_CL1_GALINDO.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.cibertec.DAWI_CL1_GALINDO.service.Especialidadservice;

@Controller
@RequestMapping("/Especialidad")
public class EspecialidadController {
	
	@Autowired
	private Especialidadservice especialidadService;
	
	
	@GetMapping("/frmMantEspecialidad")
	public String frmMantEspecialidad(Model model) {
		model.addAttribute("listaespecialidad", especialidadService.listarEspecialidad());
		return "Estado/frmMantEspecialidad";
	}
	

}
