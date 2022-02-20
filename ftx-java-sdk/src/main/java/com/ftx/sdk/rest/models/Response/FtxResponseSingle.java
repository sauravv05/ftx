package com.ftx.sdk.rest.models.Response;

import java.util.Objects;

/**
 * Created by sauravv05 on 2022/02/19.
 */
public class FtxResponseSingle<T> {
    private boolean success;
    private T result;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FtxResponseSingle<?> that = (FtxResponseSingle<?>) o;
        return success == that.success && Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, result);
    }

    @Override
    public String toString() {
        return "FtxResponseSingle{" +
                "success=" + success +
                ", result=" + result +
                '}';
    }
}
