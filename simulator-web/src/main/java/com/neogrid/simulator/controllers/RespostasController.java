package com.neogrid.simulator.controllers;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.neogrid.simulator.dao.LayoutRepository;
import com.neogrid.simulator.dao.RespostaRepository;
import com.neogrid.simulator.dao.TipoRepository;
import com.neogrid.simulator.form.SearchForm;
import com.neogrid.simulator.model.Resposta;

@Controller
@RequestMapping("/respostas")
public class RespostasController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	private static final String SUCCESS = "sucesso";

	@Autowired
	private RespostaRepository respostaRepository;
	
	@Autowired
	private LayoutRepository layoutRepository;
	
	@Autowired
	private TipoRepository tipoRepostory;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		//binder.addValidators(new ProdutoValidation());
	}

	@RequestMapping("/form")
	public ModelAndView form(Resposta resposta) {
		ModelAndView modelAndView = new ModelAndView("respostas/form");

		modelAndView.addObject("tipos", tipoRepostory.findAll());
		modelAndView.addObject("layouts", layoutRepository.findAll());
		
		return modelAndView;
	}

	@RequestMapping(path="gravar", method = RequestMethod.POST)
	public ModelAndView gravar(Resposta resposta, BindingResult result,
			RedirectAttributes attributes, HttpServletRequest request) {
		
		String remoteAddr = request.getRemoteAddr();
		logger.info("Salvando resposta com o IP do cliente remoteaddr = " + request.getRemoteAddr());
		
		
		if(remoteAddr != null && !"0:0:0:0:0:0:0:1".equals(remoteAddr)){
			resposta.setIp(remoteAddr);
		}
		
		respostaRepository.save(resposta);
		attributes.addFlashAttribute(SUCCESS, "Resposta salva com sucesso!");
		
		return new ModelAndView("redirect:/respostas");
	}
	
	@RequestMapping("/update/{id}")
	public ModelAndView update(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
		ModelAndView modelAndView = new ModelAndView("redirect:/respostas/form");
		Resposta resposta = respostaRepository.findOne(id);
		
		redirectAttributes.addFlashAttribute("resposta", resposta);
		
		return modelAndView;
	}
	
	@RequestMapping("/remove/{id}")
	public ModelAndView remove(@PathVariable("id") Long id, RedirectAttributes attributes) {
		
		Resposta resposta = respostaRepository.findOne(id);
		respostaRepository.delete(resposta);
		attributes.addFlashAttribute(SUCCESS, "Resposta removida com sucesso!");
		
		return new ModelAndView("redirect:/respostas");
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listar(HttpServletRequest request, @PageableDefault(size=5) Pageable pageable, Model model) {
		Page<Resposta> respostas = respostaRepository.findAllByIp(request.getRemoteAddr(), pageable);
		ModelAndView modelAndView = new ModelAndView("respostas/lista");
		modelAndView.addObject("respostas", respostas);
		
		model.addAttribute("searchForm", new SearchForm());
		
		return modelAndView;
		
	}
	
	@RequestMapping(path="/default", method = RequestMethod.GET)
	public ModelAndView listAllDefaultParameters(@PageableDefault(size=5) Pageable pageable, Model model) {
		Page<Resposta> respostas = respostaRepository.findAllByIpIsNull(pageable);
		
		ModelAndView modelAndView = new ModelAndView("respostas/lista");
		modelAndView.addObject("respostas", respostas);
		
		model.addAttribute("searchForm", new SearchForm());
		
		return modelAndView;
	}
	
	@RequestMapping(path="/search", method = RequestMethod.POST)
	public ModelAndView search(@ModelAttribute(value="searchForm") SearchForm form, HttpServletRequest request, @PageableDefault(size=5) Pageable pageable) {
		Page<Resposta> respostas;
		
		if(form.getSearch().trim().isEmpty()) {
			respostas = respostaRepository.findAllByIp(request.getRemoteAddr(), pageable);
		} else {
			respostas = respostaRepository.findByNomeLikeAndIp(form.getSearch(), request.getRemoteAddr(), pageable);
		}

		ModelAndView modelAndView = new ModelAndView("respostas/lista");
		modelAndView.addObject("respostas", respostas);
		
		return modelAndView;
	}
	
	@RequestMapping(path="/default/search", method = RequestMethod.POST)
	public ModelAndView searchDefault(@ModelAttribute(value="searchForm") SearchForm form, HttpServletRequest request, @PageableDefault(size=5) Pageable pageable) {
		Page<Resposta> respostas;
		
		if(form.getSearch().trim().isEmpty()) {
			respostas = respostaRepository.findAllByIpIsNull(pageable);
		} else {
			respostas = respostaRepository.findByNomeContainingAndIpIsNull(form.getSearch(), pageable);
		}
		
		ModelAndView modelAndView = new ModelAndView("respostas/lista");
		modelAndView.addObject("respostas", respostas);
		
		return modelAndView;
	}
	
}