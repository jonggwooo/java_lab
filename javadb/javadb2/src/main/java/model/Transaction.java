package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.security.Timestamp;

@Getter
@Setter
@AllArgsConstructor
public class Transaction {
    private int transaction_number;
    private int transaction_amount;
    private int transaction_w_balance;
    private int transaction_d_balance;
    private int transaction_w_account_number;
    private int transaction_d_account_number;
    private Timestamp transactionCreatedAt;
}
