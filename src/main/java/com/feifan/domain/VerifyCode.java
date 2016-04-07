package com.feifan.domain;

import java.util.Date;

/**
 * Created by tongfeifan on 16/4/7.
 */
public class VerifyCode {
    public String code;
    public Long date;

    public VerifyCode(String code, Long date) {
        this.code = code;
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }
}
