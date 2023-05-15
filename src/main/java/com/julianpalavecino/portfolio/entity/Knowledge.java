package com.julianpalavecino.portfolio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Knowledge {
    @Id
    @Column
    private Long idKnowledge;

    @Column
    private String area;

    @Column
    private String technologies;

    public Long getIdKnowledge() {
        return idKnowledge;
    }

    public void setIdKnowledge(Long idKnowledge) {
        this.idKnowledge = idKnowledge;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }
}
