package SoheylSayyah.Practice27.main.java.Bank.Management.ServiceBusinessManager.TransactionManagmentService;

import Bank.Management.ServiceBusinessManager.AccountingService.Account;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Transaction {
    @Id
    @Column(name = "Transaction_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
    @Column(name = "RRN")
    private String rrn;
    @Column(name = "logResponse")
    private String logResponse;
    @Column(name = "status")
    private Status status;
    @Column(name = "amount")
    private long amount;
    @Column(name = "InsertDate")
    @Temporal(TemporalType.DATE)
    private Date Insertdate;
    @Temporal(TemporalType.DATE)
    @Column(name = "UpdateDate")
    private Date Updatedate;
    public Transaction(TransactionType transactionType) {
        this.transactionType = transactionType;
    }
}
