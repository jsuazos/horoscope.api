package com.api.horoscope.sign;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Period;

@Entity
@Table
public class Sign {
    @Id
    @SequenceGenerator(
            name = "sign_sequence",
            sequenceName = "sign_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sign_sequence"
    )
    private Long id;
    private String name;
    private String img;
    private MonthDay startDate;
    private MonthDay endDate;

    public Sign() {

    }

    public Sign(Long id, String name, String img, MonthDay startDate, MonthDay endDate) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Sign(String name, String img, MonthDay startDate, MonthDay endDate) {
        this.name = name;
        this.img = img;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public MonthDay getStartDate() {
        return startDate;
    }

    public void setStartDate(MonthDay startDate) {
        this.startDate = startDate;
    }

    public MonthDay getEndDate() {
        return endDate;
    }

    public void setEndDate(MonthDay endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Sign{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", img='" + img + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
