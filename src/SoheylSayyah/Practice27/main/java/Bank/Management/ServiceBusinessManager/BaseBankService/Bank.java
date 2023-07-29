package SoheylSayyah.Practice27.main.java.Bank.Management.ServiceBusinessManager.BaseBankService;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
    private Set<Branch> branches = new HashSet<>();
    @Column(name = "status")
    private boolean status = true;
    public Bank(String name) {
        this.name = name;
    }
}
