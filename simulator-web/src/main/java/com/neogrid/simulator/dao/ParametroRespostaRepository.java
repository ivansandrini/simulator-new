package com.neogrid.simulator.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.neogrid.simulator.model.ParametroResposta;

public interface ParametroRespostaRepository extends CrudRepository<ParametroResposta, Long>, PagingAndSortingRepository<ParametroResposta, Long> {

	Page<ParametroResposta> findByIp(String ip, Pageable pageable);
	
	Page<ParametroResposta> findAllByIpIsNull(Pageable pageable);

	Page<ParametroResposta> findByChaveLike(String text, Pageable pageable);

	Page<ParametroResposta> findAllByIp(String remoteAddr, Pageable pageable);

	Page<ParametroResposta> findByChaveContainingAndIp(String search, String remoteAddr, Pageable pageable);

	Page<ParametroResposta> findByChaveContainingAndIpIsNull(String search, Pageable pageable);
}
