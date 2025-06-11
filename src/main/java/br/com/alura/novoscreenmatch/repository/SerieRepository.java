package br.com.alura.novoscreenmatch.repository;

import br.com.alura.novoscreenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
}
