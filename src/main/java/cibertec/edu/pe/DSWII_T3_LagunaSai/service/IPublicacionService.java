package cibertec.edu.pe.DSWII_T3_LagunaSai.service;

import cibertec.edu.pe.DSWII_T3_LagunaSai.model.bd.Publicacion;

import java.util.List;

public interface IPublicacionService {
    List<Publicacion> obtenerPublicacion();
}