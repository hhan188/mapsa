package org.example.Entites;

import org.example.Constant.Degree;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class EducationEmbedable {
    @Enumerated(EnumType.STRING)
    private Degree degree;
    private String organization;

    public EducationEmbedable() {
    }

    public EducationEmbedable(Degree degree, String organization) {
        this.degree = degree;
        this.organization = organization;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
}
