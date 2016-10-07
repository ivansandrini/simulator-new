package com.neogrid.simulator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.neogrid.simulator.dao.TipoRepository;
import com.neogrid.simulator.model.Tipo;

@Controller
@RequestMapping("/tipos")
public class TiposController {

	private static final String SUCCESS = "sucesso";
	
	@Autowired
	private TipoRepository tipoRepository;

	@RequestMapping("/form")
	public ModelAndView form(final Tipo tipo) {
		ModelAndView modelAndView = new ModelAndView("tipos/form");

		return modelAndView;
	}

	@RequestMapping(path="gravar", method = RequestMethod.POST)
	public ModelAndView gravar(Tipo tipo, BindingResult result,
			RedirectAttributes attributes) {
		
		tipoRepository.save(tipo);
		attributes.addFlashAttribute(SUCCESS, "Tipo salvo com sucesso!");
		
		return new ModelAndView("redirect:/tipos");
	}
	
	@RequestMapping("/update/{id}")
	public ModelAndView update(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
		ModelAndView modelAndView = new ModelAndView("redirect:/tipos/form");
		Tipo tipo = tipoRepository.findOne(id);
		
		redirectAttributes.addFlashAttribute("tipo", tipo);
		
		return modelAndView;
	}
	
	@RequestMapping("/remove/{id}")
	public ModelAndView remove(@PathVariable("id") Long id, RedirectAttributes attributes) {
		
		Tipo tipo = tipoRepository.findOne(id);
		tipoRepository.delete(tipo);
		
		attributes.addFlashAttribute(SUCCESS, "Resposta removida com sucesso!");
		
		return new ModelAndView("redirect:/tipos");
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listar() {
		Iterable<Tipo> tipos = tipoRepository.findAll();
		ModelAndView modelAndView = new ModelAndView("tipos/lista");
		modelAndView.addObject("tipos", tipos);

		return modelAndView;
	}

}
