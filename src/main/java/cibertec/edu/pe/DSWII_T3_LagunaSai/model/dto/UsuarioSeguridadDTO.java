package cibertec.edu.pe.DSWII_T3_LagunaSai.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UsuarioSeguridadDTO {
    private Integer idusuario;
    private String nomusuario;
    private String token;
}