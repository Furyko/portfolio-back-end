package com.julianpalavecino.portfolio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ExtraProject {
    @Id
    @Column
    private Long idProject;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String urlRepo;

    @Column
    private String urlSite;

    @Column
    private String previewImg;

    public Long getIdProject() {
        return idProject;
    }

    public void setIdProject(Long idProject) {
        this.idProject = idProject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlRepo() {
        return urlRepo;
    }

    public void setUrlRepo(String urlRepo) {
        this.urlRepo = urlRepo;
    }

    public String getUrlSite() {
        return urlSite;
    }

    public void setUrlSite(String urlSite) {
        this.urlSite = urlSite;
    }

    public String getPreviewImg() {
        return previewImg;
    }

    public void setPreviewImg(String previewImg) {
        this.previewImg = previewImg;
    }
}
