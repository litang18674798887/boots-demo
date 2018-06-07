package com.pagoda.bean;

/**
 * @author : litang
 * @date : Create in 2018/6/7
 */
public class SysUserEntity {

    private Long id;

    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "SysUserEntity{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}
