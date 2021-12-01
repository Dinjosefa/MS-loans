package com.bookp.loans.models;

import org.springframework.data.annotation.Id;

public class Loan {
    @Id
    private String id;
    private String idUser;
    private String idBook;
    private String dateStart;
    private String dateFinish;

    public Loan(String id, String idUser, String idBook, String dateStart, String dateFinish) {
        this.id = id;
        this.idUser = idUser;
        this.idBook = idBook;
        this.dateStart = dateStart;
        this.dateFinish = dateFinish;
    }

    public Loan() {

    }

    public String getId() {
        return id;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(String dateFinish) {
        this.dateFinish = dateFinish;
    }
}
