package com.ftx.sdk.rest.security;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;
import okio.BufferedSink;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.time.Clock;

/**
 * Created by sauravv05 on 2022/02/20.
 */
public class AuthenticationInterceptor implements Interceptor {
    private final String secret;
    private final String apiKey;
    private final String subAccount;

    public AuthenticationInterceptor(String apiKey, String secret, String subAccount){
        this.secret = secret;
        this.apiKey = apiKey;
        this.subAccount = subAccount;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {

        Request originalRequest = chain.request();
        Request.Builder newRequestBuilder = originalRequest.newBuilder();

        addAuthentication(originalRequest, newRequestBuilder);
        addSubAccount(newRequestBuilder);

        Request newRequest = newRequestBuilder.build();
        return chain.proceed(newRequest);
    }

    private void addSubAccount(Request.Builder newRequestBuilder) {
        if (!(subAccount == null) && !StringUtils.isAllEmpty(subAccount))
            newRequestBuilder.header(Constants.FTX_ENDPOINT_SUBACCOUNT,subAccount);
    }

    private void addAuthentication(Request originalRequest, Request.Builder newRequestBuilder) {
        if (originalRequest.header(Constants.FTX_ENDPOINT_AUTH_REQUIRED) != null){
            newRequestBuilder.removeHeader(Constants.FTX_ENDPOINT_AUTH_REQUIRED);

            String ts = Long.toString(Clock.systemUTC().millis());
            String method = originalRequest.method();

            String path = originalRequest.url().uri().getRawPath();
            String query = originalRequest.url().uri().getRawQuery();
            if(!StringUtils.isAllEmpty(query)) path += "?" + query;

            String body = bodyToString(originalRequest.body());

            String payload = ts + method + path;
            if(!StringUtils.isAllEmpty(body)) payload += body;

            newRequestBuilder.header(Constants.FTX_ENDPOINT_SEQURITY_APIKEY,apiKey);
            newRequestBuilder.header(Constants.FTX_ENDPOINT_SEQURITY_SIGN,HmacSHA256Signer.sign(payload,secret));
            newRequestBuilder.header(Constants.FTX_ENDPOINT_TIME,ts);
        }
    }

    private String bodyToString(RequestBody request){
        try {
            BufferedSink sink = new Buffer();
            if(request != null)
                request.writeTo(sink);
            else
                return "";
            return sink.buffer().readUtf8();
        }
        catch (final IOException e) {
            return "did not work";
        }
    }
}
