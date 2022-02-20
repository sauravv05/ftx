package com.ftx.sdk.rest.models.Response;

/**
 * Created by sauravv05 on 2022/02/19.
 */
public class FtxError {
    private boolean success;
    private String error;

    public FtxError() {
        //Default construtor
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "FtxError{" +
                "success=" + success +
                ", error='" + error + '\'' +
                '}';
    }
}
