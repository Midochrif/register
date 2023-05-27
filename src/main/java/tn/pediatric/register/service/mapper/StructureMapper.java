package tn.pediatric.register.service.mapper;

import org.mapstruct.*;
import tn.pediatric.register.domain.Structure;
import tn.pediatric.register.service.dto.StructureDTO;

/**
 * Mapper for the entity {@link Structure} and its DTO {@link StructureDTO}.
 */
@Mapper(componentModel = "spring")
public interface StructureMapper extends EntityMapper<StructureDTO, Structure> {}
