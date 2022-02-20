package com.ftx.sdk.rest.models.Response;

import java.util.List;

/**
 * Created by sauravv05 on 2022/02/19.
 */
public class FtxResponse<T> {
    private boolean success;
    private List<T> result;
    private boolean hasMoreData;

    public FtxResponse(){
        //Default constructor
    }

    public boolean isHasMoreData() {
        return hasMoreData;
    }

    public void setHasMoreData(boolean hasMoreData) {
        this.hasMoreData = hasMoreData;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }
}
