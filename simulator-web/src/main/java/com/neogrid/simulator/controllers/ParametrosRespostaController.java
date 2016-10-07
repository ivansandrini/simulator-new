package com.neogrid.simulator.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.neogrid.simulator.dao.ParametroRespostaRepository;
import com.neogrid.simulator.dao.RespostaRepository;
import com.neogrid.simulator.form.SearchForm;
import com.neogrid.simulator.model.ParameterType;
import com.neogrid.simulator.model.ParametroResposta;
import com.neogrid.simulator.model.Resposta;

@Controller
@RequestMapping("/parametros")
public class ParametrosRespostaController {

	private static final String SUCCESS = "sucesso";

	@Autowired
	private ParametroRespostaRepository parametroRespostaRepository;
	
	@Autowired 
	private RespostaRepository respostaRepository;
	
	@RequestMapping("/form")
	public ModelAndView form(final ParametroResposta parametroResposta, HttpServletRequest request, Pageable pageable) {
		ModelAndView modelAndView = new ModelAndView("parametros/form");
		String remoteAddr = request.getRemoteAddr();
		
		Page<Resposta> respostas;
		if(remoteAddr != null && !"0:0:0:0:0:0:0:1".equals(remoteAddr)){
			respostas = respostaRepository.findAllByIp(remoteAddr, pageable);
		} else {
			respostas = respostaRepository.findAllByIpIsNull(pageable);
		}
		
		modelAndView.addObject("respostas", respostas);
		modelAndView.addObject("tipos", ParameterType.values());
		
		return modelAndView;
	}

	@RequestMapping(path="gravar", method = RequestMethod.POST)
	public ModelAndView gravar(ParametroResposta parametroResposta, BindingResult result,
			RedirectAttributes attributes, HttpServletRequest request) {

		String remoteAddr = request.getRemoteAddr();
		
		if(remoteAddr != null && !"0:0:0:0:0:0:0:1".equals(remoteAddr)){
			parametroResposta.setIp(remoteAddr);
		}
		
		parametroRespostaRepository.save(parametroResposta);
		attributes.addFlashAttribute(SUCCESS, "Parâmetro salvo com sucesso!");
		
		return new ModelAndView("redirect:/parametros");
	}
	
	@RequestMapping("/update/{id}")
	public ModelAndView update(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
		ModelAndView modelAndView = new ModelAndView("redirect:/parametros/form");
		ParametroResposta parametroResposta = parametroRespostaRepository.findOne(id);
		
		redirectAttributes.addFlashAttribute("parametroResposta", parametroResposta);
		
		return modelAndView;
	}
	
	@RequestMapping("/remove/{id}")
	public ModelAndView remove(@PathVariable("id") Long id, RedirectAttributes attributes) {
		
		ParametroResposta parametroResposta = parametroRespostaRepository.findOne(id);
		parametroRespostaRepository.delete(parametroResposta);
		attributes.addFlashAttribute(SUCCESS, "Parâmetro removido com sucesso!");
		
		return new ModelAndView("redirect:/parametros");
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView list(HttpServletRequest request, @PageableDefault(size=5) Pageable pageable, Model model) {
		Page<ParametroResposta> parametros = parametroRespostaRepository.findByIp(request.getRemoteAddr(), pageable);
		
		ModelAndView modelAndView = new ModelAndView("parametros/lista");
		modelAndView.addObject("parametros", parametros);
		
		model.addAttribute("searchForm", new SearchForm());
		
		return modelAndView;
	}
	
	@RequestMapping(path="/default", method = RequestMethod.GET)
	public ModelAndView listAllDefaultParameters(@PageableDefault(size=5) Pageable pageable, Model model) {
		Page<ParametroResposta> parametros = parametroRespostaRepository.findAllByIpIsNull(pageable);
		
		ModelAndView modelAndView = new ModelAndView("parametros/lista");
		modelAndView.addObject("parametros", parametros);
		
		model.addAttribute("searchForm", new SearchForm());
		
		return modelAndView;
	}
	
	@RequestMapping(path="/search", method = RequestMethod.POST)
	public ModelAndView search(@ModelAttribute(value="searchForm") SearchForm form, HttpServletRequest request, @PageableDefault(size=5) Pageable pageable) {
		Page<ParametroResposta> parametros;
		
		if(form.getSearch().trim().isEmpty()) {
			parametros = parametroRespostaRepository.findAllByIp(request.getRemoteAddr(), pageable);
		} else {
			parametros = parametroRespostaRepository.findByChaveContainingAndIp(form.getSearch(), request.getRemoteAddr(), pageable);
		}

		ModelAndView modelAndView = new ModelAndView("parametros/lista");
		modelAndView.addObject("parametros", parametros);
		
		return modelAndView;
	}
	
	@RequestMapping(path="/default/search", method = RequestMethod.POST)
	public ModelAndView searchDefault(@ModelAttribute(value="searchForm") SearchForm form, HttpServletRequest request, @PageableDefault(size=5) Pageable pageable) {
		Page<ParametroResposta> parametros;
		
		if(form.getSearch().trim().isEmpty()) {
			parametros = parametroRespostaRepository.findAllByIpIsNull(pageable);
		} else {
			parametros = parametroRespostaRepository.findByChaveContainingAndIpIsNull(form.getSearch(), pageable);
		}
		
		ModelAndView modelAndView = new ModelAndView("parametros/lista");
		modelAndView.addObject("parametros", parametros);
		
		return modelAndView;
	}

}
