package api.crud.novo.example.crud;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


// public interface ClienteRepository extends JpaRepository<Cliente, Long> {
//     Cliente findByCodigo(String codigo);

//     Cliente saveAll();

//     Cliente saveAll(Cliente clienteExistente);

//     Optional<Cliente> findById(Long id);
// }


public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    Optional<Cliente> findById(Long id);

    void deleteById(Long id);

    Cliente saveAll(Cliente cliente);

}