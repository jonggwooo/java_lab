package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;


@AllArgsConstructor
@Setter
@Getter
public class Account {

    private int accountNumber;
    private String accountPassword;
    private int accountBalance;
    private Timestamp accountCreatedAt;


    }