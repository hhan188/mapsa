package embeddeds;

import enums.DegreeTitle;

import javax.persistence.Embeddable;

@Embeddable
public class Education {

    private DegreeTitle degree;

    private String organization;


    public Education() {
    }

    public Education(DegreeTitle degree, String organization) {
        this.degree = degree;
        this.organization = organization;
    }

    public DegreeTitle getDegree() {
        return degree;
    }

    public String getOrganization() {
        return organization;
    }

    public void setDegree(DegreeTitle degreeTitle) {
        this.degree = degreeTitle;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
}
