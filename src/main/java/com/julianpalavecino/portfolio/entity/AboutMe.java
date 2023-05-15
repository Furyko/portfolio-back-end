package com.julianpalavecino.portfolio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AboutMe {
    @Id
    @Column
    private Long idAboutMe;

    @Column
    private String fullname;

    @Column
    private String profession;

    @Column
    private String presentation;

    public Long getIdAboutMe() {
        return idAboutMe;
    }

    public void setIdAboutMe(Long idAboutMe) {
        this.idAboutMe = idAboutMe;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }
}
