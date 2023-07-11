package SoheylSayyah.Practice24Part4;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class Education
{
    @Enumerated(EnumType.STRING)
    private Degree degree;
    private String organization;

    public Education(Degree degree, String organization)
    {
        this.degree = degree;
        this.organization = organization;
    }

    public Degree getDegree()
    {
        return degree;
    }

    public void setDegree(Degree degree)
    {
        this.degree = degree;
    }

    public String getOrganization()
    {
        return organization;
    }

    public void setOrganization(String organization)
    {
        this.organization = organization;
    }

    public Education()
    {
    }
}
