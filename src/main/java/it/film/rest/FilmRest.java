package it.film.rest;

import java.util.List;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import it.film.dao.FilmDao;
import it.film.dao.FilmDaoImp;



@RestController
@RequestMapping("/film")
@Api(value="FilmRest", tags="Gestione dati film")

public class FilmRest {
	
	

	

		// http://localhost:8080/anagrafe-0.0.1-SNAPSHOT/swagger-ui.html   <---- Link di accesso a swagger!!!
		
		FilmDao fd = new FilmDaoImp(); 
		Logger log = LoggerFactory.logger(getClass());

		@PostMapping
		@ApiOperation(value="register del film", notes="Permette di inserire film per titolo")
		public ResponseEntity<String> inserisci(@RequestBody Film f) {
			try {	fd.salva(f);
			return new ResponseEntity<String>("Film salvato con successo!", HttpStatus.OK);
			} 

			catch (Exception e) {		
				log.error(e.getMessage());
				return new ResponseEntity<String>("Film non salvato!", HttpStatus.BAD_REQUEST);

			} 

		}
		
		@PutMapping("/{id}") 
		@ApiOperation(value="aggiornamento film", notes="Permette di aggiornare film per titolo")
		public ResponseEntity<String> aggiorna(@RequestBody Film f , @PathVariable String register) {
			r.setId(id);
			try { fd.aggiorna(r);
			return new ResponseEntity<String>("dati film aggiornati correttamente!", HttpStatus.OK);
				
			} catch (Exception e) {
				return new ResponseEntity<String>("dati film non aggiornati", HttpStatus.BAD_REQUEST);
			}
		}
		@DeleteMapping("/{id}")
		@ApiOperation(value="Cancellazione film", notes="Permette di cancellare un film dalla lista")
		public ResponseEntity<String> cancella(@PathVariable String titolo) {
			try { fd.cancella("titolo");
				return new ResponseEntity<String>("titolo eliminato correttamente!", HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<String>("titolo non eliminato", HttpStatus.BAD_REQUEST);
			}
		}
		
		@GetMapping("/{id}")
		@ApiOperation(value="trova titolo", notes="Trova titolo per register")
		public ResponseEntity<Register> trova(@PathVariable int id) {
			
			try {
				return new ResponseEntity<Register>(fd.trova(id), HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<Film>((Register)null, HttpStatus.BAD_REQUEST);
			}
		}

		
		

}
