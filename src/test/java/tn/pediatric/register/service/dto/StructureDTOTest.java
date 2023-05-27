package tn.pediatric.register.service.dto;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import tn.pediatric.register.web.rest.TestUtil;

class StructureDTOTest {

    @Test
    void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(StructureDTO.class);
        StructureDTO structureDTO1 = new StructureDTO();
        structureDTO1.setId(1L);
        StructureDTO structureDTO2 = new StructureDTO();
        assertThat(structureDTO1).isNotEqualTo(structureDTO2);
        structureDTO2.setId(structureDTO1.getId());
        assertThat(structureDTO1).isEqualTo(structureDTO2);
        structureDTO2.setId(2L);
        assertThat(structureDTO1).isNotEqualTo(structureDTO2);
        structureDTO1.setId(null);
        assertThat(structureDTO1).isNotEqualTo(structureDTO2);
    }
}
