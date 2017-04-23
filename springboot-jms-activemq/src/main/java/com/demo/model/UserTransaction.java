package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by momor3n on 21/4/2017.
 */
@Entity
public class UserTransaction {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String side;
    private String symbol;
    private String instrumentName;
    private int quantity;
    private BigDecimal price;
    private BigDecimal fees;
    private LocalDate transactDate;
    private String portfolio;
    private String cashTransaction;
    private String currency;
    private LocalDate createDate;

    public UserTransaction(){}

    public UserTransaction(String side, String symbol, String instrumentName, int quantity, BigDecimal price, BigDecimal fees, LocalDate transactDate, String portfolio, String cashTransaction, String currency, LocalDate createDate) {
        this.side = side;
        this.symbol = symbol;
        this.instrumentName = instrumentName;
        this.quantity = quantity;
        this.price = price;
        this.fees = fees;
        this.transactDate = transactDate;
        this.portfolio = portfolio;
        this.cashTransaction = cashTransaction;
        this.currency = currency;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "UserTransaction{" +
                "id=" + id +
                ", side='" + side + '\'' +
                ", symbol='" + symbol + '\'' +
                ", instrumentName='" + instrumentName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", fees=" + fees +
                ", transactDate=" + transactDate +
                ", portfolio='" + portfolio + '\'' +
                ", cashTransaction='" + cashTransaction + '\'' +
                ", currency='" + currency + '\'' +
                ", createDate=" + createDate +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getFees() {
        return fees;
    }

    public void setFees(BigDecimal fees) {
        this.fees = fees;
    }

    public LocalDate getTransactDate() {
        return transactDate;
    }

    public void setTransactDate(LocalDate transactDate) {
        this.transactDate = transactDate;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    public String getCashTransaction() {
        return cashTransaction;
    }

    public void setCashTransaction(String cashTransaction) {
        this.cashTransaction = cashTransaction;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
