package SoheylSayyah.Practice27.main.java.Bank.Management.ServiceBusinessManager.CustomerService;

import Bank.Management.ServiceBusinessManager.AccountingService.Account;
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
public class Customer {
    @Id
    @Column(name = "Customer_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "CustomerNumber")
    private String customerNumber;
    @Column(name = "status")
    private boolean status = true;
    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(
            name = "Account_Costumer",
            joinColumns = @JoinColumn(name = "Customer_Id"),
            inverseJoinColumns = @JoinColumn(name = "Account_Id")
    )
    private Set<Account> accounts = new HashSet<>();
    public Customer(String customerNumber) {
        this.customerNumber = customerNumber;
    }
}
