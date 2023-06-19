package api.crud.novo.example.crud;
import org.springframework.web.bind.annotation.*;

import java.util.List;



import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ClienteController {

	ClienteRepository repository;
	
	@GetMapping("/cliente")
	public List<Cliente> getAllCliente(){
		return repository.findAll();
	}
	
	/**
	 * @param id
	 * @return
	 */
	@GetMapping("/cliente/{id}")
	public Class<? extends Object> getCarroById(@PathVariable Long id) {
		return repository.findById(id).getClass();
	}
	
	@PostMapping("/cliente")
	public Cliente saveCarro(@RequestBody Cliente cliente) {
		return repository.saveAll(cliente);
	}
	
	@DeleteMapping("/carro/{id}")
	public void deleteCarro(@PathVariable Long id) {
		repository.deleteById(id);
	}

    public ClienteRepository getRepository() {
        return repository;
    }

    public void setRepository(ClienteRepository repository) {
        this.repository = repository;
    }
	
	
}
