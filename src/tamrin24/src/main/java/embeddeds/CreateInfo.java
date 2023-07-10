package embeddeds;

import javax.persistence.Embeddable;
import java.time.LocalDate;

@Embeddable
public class CreateInfo {

    private String createUser;

    private LocalDate createDate;

    public CreateInfo() {
    }

    public CreateInfo(String createUser, LocalDate createDate) {
        this.createUser = createUser;
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
