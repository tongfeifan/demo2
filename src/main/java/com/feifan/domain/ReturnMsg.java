package com.feifan.domain;

import java.io.Serializable;

/**
 * Created by tongfeifan on 16/4/7.
 */
public class ReturnMsg implements Serializable {
    private boolean success;
    private String message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
