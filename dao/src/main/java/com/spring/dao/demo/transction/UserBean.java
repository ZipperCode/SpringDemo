package com.spring.dao.demo.transction;

/**
 * @author zzp
 * @date 2020/7/17
 */
public class UserBean {

    private Integer id;

    private String username;

    private String password;

    public UserBean() {
    }

    public UserBean(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
