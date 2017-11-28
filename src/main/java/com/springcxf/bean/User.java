package com.springcxf.bean;


import com.springcxf.adapter.DateConverter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.Date;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name = "User")
@XmlType(propOrder = {"userId", "nickname", "gender", "registerDate"})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userId;

    private String nickname;

    private String gender;

    private Date registerDate;

    public User() {
    }

    public User(String userId, String nickname, String gender, Date registerDate) {
        this.userId = userId;
        this.nickname = nickname;
        this.gender = gender;
        this.registerDate = registerDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @XmlJavaTypeAdapter(DateConverter.class)
    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", nickname=" + nickname
                + ", gender=" + gender + ", registerDate =" + registerDate + "]";
    }
}