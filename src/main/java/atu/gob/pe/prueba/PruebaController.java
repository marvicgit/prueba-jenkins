package atu.gob.pe.prueba;

import java.util.Arrays;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prueba")
public class PruebaController {

	@GetMapping
	public ResponseEntity<?> listar() {
		return ResponseEntity.ok()
				.body(Arrays.asList(1,2,3,4,5,6));
	}
}
