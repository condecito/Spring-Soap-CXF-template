/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basa.request;

import java.io.Serializable;

/**
 *
 * @author ronya
 */
public class BaseRequest implements Serializable{

    private static final long serialVersionUID = -3628469724795296287L;

    private String userId;
    private String userName;
    private String email;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BaseRequest() {
    }

    public BaseRequest(String userId, String userName, String email) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{"
                + "userId='" + userId + '\''
                + ", userName='" + userName + '\''
                + ", email='" + email + '\''
                + '}';
    }
}
