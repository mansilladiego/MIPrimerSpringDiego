package cl.awakelab.miprimerspringdiego.repository;

import cl.awakelab.miprimerspringdiego.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

}
