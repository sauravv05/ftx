package com.ftx.sdk.exception;

/**
 * Created by sauravv05 on 2022/02/19.
 */
public class FtxApiException extends RuntimeException {
    private String massage;

    public FtxApiException(String massage){
        super(massage);
        this.massage = massage;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    @Override
    public String toString() {
        return "FtxApiException{" +
                "massage='" + massage + '\'' +
                '}';
    }
}
