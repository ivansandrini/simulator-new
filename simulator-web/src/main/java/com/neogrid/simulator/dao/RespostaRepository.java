package com.neogrid.simulator.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.neogrid.simulator.model.Resposta;

public interface RespostaRepository extends CrudRepository<Resposta, Long>, PagingAndSortingRepository<Resposta, Long> {

	Page<Resposta> findAllByIp(String ip, Pageable pageable);
	
	Page<Resposta> findAllByIpIsNull(Pageable pageable);

	Page<Resposta> findByNomeLikeAndIp(String search, String remoteAddr, Pageable pageable);

	Page<Resposta> findByNomeContainingAndIpIsNull(String search, Pageable pageable);
	
}