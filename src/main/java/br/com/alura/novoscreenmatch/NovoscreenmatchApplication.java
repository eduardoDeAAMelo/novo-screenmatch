package br.com.alura.novoscreenmatch;

import br.com.alura.novoscreenmatch.model.DadosSerie;
import br.com.alura.novoscreenmatch.principal.Principal;
import br.com.alura.novoscreenmatch.repository.SerieRepository;
import br.com.alura.novoscreenmatch.service.ConsumoAPI;
import br.com.alura.novoscreenmatch.service.ConverteDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NovoscreenmatchApplication implements CommandLineRunner {
	@Autowired
	private SerieRepository repositorio;

	public static void main(String[] args) {
		SpringApplication.run(NovoscreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorio);
		principal.exibeMenu();
	}
}
