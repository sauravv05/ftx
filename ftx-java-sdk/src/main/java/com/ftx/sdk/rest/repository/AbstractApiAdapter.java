package com.ftx.sdk.rest.repository;

import com.ftx.sdk.exception.FtxApiException;
import com.ftx.sdk.rest.models.Response.FtxError;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.lang.annotation.Annotation;

/**
 * Created by sauravv05 on 2022/02/20.
 */
public class AbstractApiAdapter {

    private Converter<ResponseBody,FtxError> errorConverter;

    public AbstractApiAdapter(){
        errorConverter = getErrorConvertor();
    }

    @SuppressWarnings("unchecked")
    public Converter<ResponseBody, FtxError> getErrorConvertor(){
        Converter.Factory errorConvertorFactory = JacksonConverterFactory.create();
        return (Converter<ResponseBody, FtxError>) errorConvertorFactory
                .responseBodyConverter(FtxError.class,new Annotation[0],null);
    }

    protected <T> T executeSync(Call<T> call) throws IOException {
        Response<T> response = null;
        response = call.execute();
        if (response.isSuccessful()) {
            return response.body();
        }
        FtxError ftxError = errorConverter.convert(response.errorBody());
        throw new FtxApiException(ftxError.getError());
    }
}
