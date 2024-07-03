package cibertec.edu.pe.DSWII_T3_LagunaSai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cibertec.edu.pe.DSWII_T3_LagunaSai.model.bd.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {


    Usuario findByNomusuario(String nomusuario);

    Usuario findByNombres(String nombres);

}
