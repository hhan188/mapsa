package practice24vapractice25;


import org.mapsa.entities.newPostKelas.practice24.enums.Degrees;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class Education {

    public Education() {
    }

    @Enumerated(EnumType.STRING)
    private Degrees degrees;

    private String organization;

    public Education(Degrees degrees, String organization) {
        this.degrees = degrees;
        this.organization = organization;
    }

    public Degrees getDegrees() {
        return degrees;
    }

    public void setDegrees(Degrees degrees) {
        this.degrees = degrees;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
}
