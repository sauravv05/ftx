package com.ftx.sdk.rest.repository.order;

import com.ftx.sdk.rest.models.Request.Order.CancelAllOrder;
import com.ftx.sdk.rest.models.Request.Order.ModifyOrder;
import com.ftx.sdk.rest.models.Request.Order.NewOrder;
import com.ftx.sdk.rest.models.Response.FtxResponse;
import com.ftx.sdk.rest.models.Response.FtxResponseSingle;
import com.ftx.sdk.rest.models.Response.order.Order;
import com.ftx.sdk.rest.security.Constants;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * Created by sauravv05 on 2022/02/20.
 */
public interface OrderApiRetrofit {


    @GET("orders")
    @Headers(Constants.FTX_ENDPOINT_AUTH_REQUIRED_HEADER)
    Call<FtxResponse<Order>> getOpenOrders(@Query("market") String market);

    @GET("orders/history")
    @Headers(Constants.FTX_ENDPOINT_AUTH_REQUIRED_HEADER)
    Call<FtxResponse<Order>> getOrderHistory(@Query("market") String market,
                                             @Query("side") String side,
                                             @Query("orderType") String orderType,
                                             @Query("start_time") Long startTimeSec,
                                             @Query("end_time") Long endTimeSec);

    @POST("orders")
    @Headers(Constants.FTX_ENDPOINT_AUTH_REQUIRED_HEADER)
    Call<FtxResponseSingle<Order>> placeOrder(@Body NewOrder newOrder);

    @POST("orders/{order_id}/modify")
    @Headers(Constants.FTX_ENDPOINT_AUTH_REQUIRED_HEADER)
    Call<FtxResponseSingle<Order>> modifyOrder(@Path("order_id") long orderId, @Body ModifyOrder modifyOrder);

    @POST("orders/by_client_id/{client_order_id}/modify")
    @Headers(Constants.FTX_ENDPOINT_AUTH_REQUIRED_HEADER)
    Call<FtxResponseSingle<Order>> modifyOrderByClientId(@Path("client_order_id") long clientId, @Body ModifyOrder modifyOrder);

    @GET("orders/{order_id}")
    @Headers(Constants.FTX_ENDPOINT_AUTH_REQUIRED_HEADER)
    Call<FtxResponseSingle<Order>> getOrderStatus(@Path("order_id") long orderId);

    @GET("orders/by_client_id/{client_order_id}")
    @Headers(Constants.FTX_ENDPOINT_AUTH_REQUIRED_HEADER)
    Call<FtxResponseSingle<Order>> getOrderStatusbyClientId(@Path("client_order_id") long clientId);

    @DELETE("orders/{order_id}")
    @Headers(Constants.FTX_ENDPOINT_AUTH_REQUIRED_HEADER)
    Call<FtxResponseSingle<String>> cancelOrder(@Path("order_id") long orderId);

    @HTTP(method = "DELETE",path = "orders",hasBody = true)
    @Headers(Constants.FTX_ENDPOINT_AUTH_REQUIRED_HEADER)
    Call<FtxResponseSingle<String>> cancelAllOrders(@Body CancelAllOrder cancelAllOrder);
}
