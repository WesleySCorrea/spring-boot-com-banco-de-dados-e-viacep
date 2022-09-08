package com.wesleyscorrea.springComViaCEP.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;


public class User implements Serializable {

    private Long id;
    private String name;
    private Integer CPF;
    private Date birthday;
    private String email;
    private List<Address> address;

    public User() {
    }

    public User(Long id, String name, Integer CPF, Date birthday, String email, List<Address> address) {
        this.id = id;
        this.name = name;
        this.CPF = CPF;
        this.birthday = birthday;
        this.email = email;
        this.address = address;
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

    public Integer getCPF() {
        return CPF;
    }

    public void setCPF(Integer CPF) {
        this.CPF = CPF;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Address> getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId().equals(user.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}