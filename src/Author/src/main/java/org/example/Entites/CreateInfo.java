package org.example.Entites;

import javax.persistence.Embeddable;
import java.time.LocalDate;

@Embeddable
public class CreateInfo {

    private LocalDate createDate;
    private String createUser;

    public CreateInfo(LocalDate createDate, String createUser) {
        this.createDate = createDate;
        this.createUser = createUser;
    }

    public CreateInfo() {
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
}
