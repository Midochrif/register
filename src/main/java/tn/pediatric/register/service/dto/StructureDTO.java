package tn.pediatric.register.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;
import tn.pediatric.register.domain.enumeration.etype;

/**
 * A DTO for the {@link tn.pediatric.register.domain.Structure} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class StructureDTO implements Serializable {

    private Long id;

    @NotNull
    private String name;

    private etype stype;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public etype getStype() {
        return stype;
    }

    public void setStype(etype stype) {
        this.stype = stype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StructureDTO)) {
            return false;
        }

        StructureDTO structureDTO = (StructureDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, structureDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "StructureDTO{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", stype='" + getStype() + "'" +
            "}";
    }
}
