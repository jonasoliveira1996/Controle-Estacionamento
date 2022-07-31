package com.br.controle.estacionamento.repositorios;

 
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.br.controle.estacionamento.modelo.Estacionamento;

@Repository
public interface EstacionamentoRepositorio extends JpaRepository<Estacionamento, Long>{
	
		public boolean existsByPlacaCarro(String placaCarro);
		public boolean existsBynumeroVagaEstacionamento(String numeroVagaEstacionamento);
		public boolean existsByApartamentoAndBloco(String apartamento, String bloco);
		public boolean existsById(Long id);

		@Query(value = "select u from Estacionamento u where upper(trim(u.nomeResponsavel)) like %?1%")
		public List<Estacionamento> findByNomeResponsavel(String nomeResponsavel);
}
