//package com.algaworks.algafood.api.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.algaworks.algafood.domain.model.Estado;
//import com.algaworks.algafood.domain.repository.EstadoRepository;
//
//@Controller
//@ResponseBody
//@RequestMapping("/estados")
//public class EstadoController {
//
//	@Autowired
//	private EstadoRepository estadoRepository;
//		
//	@GetMapping
//	public List<Estado> listar(){
//		return estadoRepository.listar();
//	}
//}