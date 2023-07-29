package SoheylSayyah.Practice27.main.java.Bank.Management.ServiceBusinessManager.BaseBankService;

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
public class Branch
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Branch_Id")
    private Integer id;
    @Column(name = "Branch_Code")
    private String branchCode;
    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;
    @OneToMany(mappedBy = "branch", cascade = CascadeType.ALL)
    private Set<Account> accounts = new HashSet<>();
    @Column(name = "status")
    private boolean status = true;

    public Branch(String branchCode)
    {
        this.branchCode = branchCode;
    }
}
