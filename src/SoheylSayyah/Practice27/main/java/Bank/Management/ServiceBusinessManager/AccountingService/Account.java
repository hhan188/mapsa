package SoheylSayyah.Practice27.main.java.Bank.Management.ServiceBusinessManager.AccountingService;

import Bank.Management.ServiceBusinessManager.BaseBankService.Branch;
import Bank.Management.ServiceBusinessManager.CustomerService.Customer;
import Bank.Management.ServiceBusinessManager.TransactionManagmentService.Transaction;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Account {
    @Id
    @Column(name = "Account_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "AccountNumber")
    private String AccountNumber;
    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Transaction> transactions = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;
    @ManyToMany(mappedBy = "accounts")
    private Set<Customer> customers = new HashSet<>();
    @Column(name = "status")
    private boolean status = true;
    @Column(name="balance")
    private long balance;
    public Account(String account_number) {
        AccountNumber = account_number;
    }
    public Account(String accountNumber, long balance)
    {
        AccountNumber = accountNumber;
        this.balance = balance;
    }
}
