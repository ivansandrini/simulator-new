package com.neogrid.simulator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.neogrid.simulator.dao.LayoutRepository;
import com.neogrid.simulator.model.Layout;

@Controller
@RequestMapping("/layouts")
public class LayoutController {

	private static final String SUCCESS = "sucesso";
	
	@Autowired
	private LayoutRepository layoutRepository;

	@RequestMapping("/form")
	public ModelAndView form(final Layout layout) {
		ModelAndView modelAndView = new ModelAndView("layouts/form");

		return modelAndView;
	}

	@RequestMapping(path="gravar", method = RequestMethod.POST)
	public ModelAndView gravar(Layout layout, BindingResult result,
			RedirectAttributes attributes) {

		layoutRepository.save(layout);
		attributes.addFlashAttribute(SUCCESS, "Layout salvo com sucesso!");
		
		return new ModelAndView("redirect:/layouts");
	}
	
	@RequestMapping("/update/{id}")
	public ModelAndView update(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
		ModelAndView modelAndView = new ModelAndView("redirect:/layouts/form");
		Layout layout = layoutRepository.findOne(id);
		
		redirectAttributes.addFlashAttribute("layout", layout);
		
		return modelAndView;
	}
	
	@RequestMapping("/remove/{id}")
	public ModelAndView remove(@PathVariable("id") Long id, RedirectAttributes attributes) {
		
		Layout layout = layoutRepository.findOne(id);
		
		layoutRepository.delete(layout);
		attributes.addFlashAttribute(SUCCESS, "Layout removido com sucesso!");
		
		return new ModelAndView("redirect:/layouts");
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listar() {
		Iterable<Layout> layouts = layoutRepository.findAll();
		ModelAndView modelAndView = new ModelAndView("layouts/lista");
		modelAndView.addObject("layouts", layouts);

		return modelAndView;
	}

}
