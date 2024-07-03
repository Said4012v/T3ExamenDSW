package cibertec.edu.pe.DSWII_T3_LagunaSai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cibertec.edu.pe.DSWII_T3_LagunaSai.model.bd.Publicacion;
import cibertec.edu.pe.DSWII_T3_LagunaSai.repository.PublicacionRepository;

import java.util.List;

@Service
public class PublicacionService implements IPublicacionService{

    @Autowired
    private PublicacionRepository publicacionRepository;

    @Override
    public List<Publicacion> obtenerPublicacion() {
        return publicacionRepository.findAll();
    }
}