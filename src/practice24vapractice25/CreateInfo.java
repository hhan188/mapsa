package practice24vapractice25;


import javax.persistence.Embeddable;
import java.time.LocalDate;

@Embeddable//dakhel khod table add mishe
public class CreateInfo {


    private LocalDate localDate;

    private String name_info;

    public CreateInfo(LocalDate localDate, String name) {
        this.localDate = localDate;
        this.name_info = name;
    }

    public CreateInfo() {
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getName() {
        return name_info;
    }

    public void setName(String name) {
        this.name_info = name;
    }
}
