package com.mg.api.resources.carriers.base;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Created by Andries on 8/9/16.
 */
@Entity
@Table(name="AJS_CARRIER")
public class BaseCarrier {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="andries_seq")
    @SequenceGenerator(name="andries_seq", sequenceName = "ANDRIES_SEQ", initialValue=1, allocationSize=100)
    private Long id;

    @NotNull
    @Column(unique = true)
    private String name;

    protected BaseCarrier() {}

    public BaseCarrier(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseCarrier{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        BaseCarrier that = (BaseCarrier) o;
        return Objects.equals(name, that.name);
    }

    @Override public int hashCode() {
        return Objects.hash(name);
    }

}
