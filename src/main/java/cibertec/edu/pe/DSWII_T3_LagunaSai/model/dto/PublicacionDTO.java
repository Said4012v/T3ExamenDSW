package cibertec.edu.pe.DSWII_T3_LagunaSai.model.dto;

import lombok.Data;

@Data
public class PublicacionDTO implements DtoEntity{


    private String titulo;
    private String resumen;
    private String fechPublicacion;
    private AutorDTO autor;
}