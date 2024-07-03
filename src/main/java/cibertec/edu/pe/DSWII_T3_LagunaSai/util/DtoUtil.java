package cibertec.edu.pe.DSWII_T3_LagunaSai.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import cibertec.edu.pe.DSWII_T3_LagunaSai.model.dto.DtoEntity;


@Component
public class DtoUtil {
    public DtoEntity convertirADto(Object obj, DtoEntity mapper) {
        return new ModelMapper().map(obj, mapper.getClass());
    }

    public Object convertirDtoAEntity(Object obj, DtoEntity mapper) {
        return new ModelMapper().map(mapper, obj.getClass());
    }
}