package ch.juventus.schichtenschmiede.persistency.entityNew;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.ResourceSupport;

import javax.persistence.*;

@Entity
public abstract class BaseEntity extends ResourceSupport {

    @Id
    @Column(nullable = false)
    @GeneratedValue
    private Long identifier;

    private boolean isActive;


    public BaseEntity() {
    }

    public BaseEntity(boolean isActive) {
        this.isActive = isActive;
    }


    public Long getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Long identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("isActive")
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    //abstract methods
    public abstract boolean equals(Object o);

    public abstract int hashCode();

    public abstract String toString();

}