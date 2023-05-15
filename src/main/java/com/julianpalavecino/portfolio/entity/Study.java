package com.julianpalavecino.portfolio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Study {
    @Id
    @Column
    private Long idStudy;

    @Column
    private String title;

    @Column
    private String instituteName;

    public Long getIdStudy() {
        return idStudy;
    }

    public void setIdStudy(Long idStudy) {
        this.idStudy = idStudy;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }
}
