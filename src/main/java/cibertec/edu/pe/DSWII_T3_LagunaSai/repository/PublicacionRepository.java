package cibertec.edu.pe.DSWII_T3_LagunaSai.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cibertec.edu.pe.DSWII_T3_LagunaSai.model.bd.Publicacion;


@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion, Integer>{
}