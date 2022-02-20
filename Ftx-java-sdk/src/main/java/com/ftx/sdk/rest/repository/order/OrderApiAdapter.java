package com.ftx.sdk.rest.repository.order;

import com.ftx.sdk.rest.models.Request.Order.CancelAllOrder;
import com.ftx.sdk.rest.models.Request.Order.ModifyOrder;
import com.ftx.sdk.rest.models.Request.Order.NewOrder;
import com.ftx.sdk.rest.models.Response.FtxResponseSingle;
import com.ftx.sdk.rest.models.Response.order.Order;
import com.ftx.sdk.rest.repository.AbstractApiAdapter;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

/**
 * Created by sauravv05 on 2022/02/20.
 */
public class OrderApiAdapter extends AbstractApiAdapter {

    private final OrderApiRetrofit orderApi;

    public OrderApiAdapter(Retrofit retrofit){
        orderApi = retrofit.create(OrderApiRetrofit.class);
    }

    public List<Order> getOpenOrders(String market) throws IOException {
        return executeSync(orderApi.getOpenOrders(market)).getResult();
    }

    public List<Order> getOrderHistory(String market,String side, String orderType,
                                       Long startTimeSec,
                                       Long endTimeSec) throws IOException {
        return executeSync(orderApi.getOrderHistory(market, side, orderType,
                startTimeSec, endTimeSec))
                .getResult();
    }

    public List<Order> getOrderHistory(String market,String side, String orderType) throws IOException {
        return getOrderHistory(market,side,orderType,null,null);
    }

    public Order placeOrder(NewOrder newOrder) throws IOException{
        return executeSync(orderApi.placeOrder(newOrder)).getResult();
    }

    public Order modifyOrder(long orderId, double price, double size) throws IOException {
        ModifyOrder order = new ModifyOrder();
        order.setPrice(price);
        order.setSize(size);
        return executeSync(orderApi.modifyOrder(orderId,order)).getResult();
    }

    public Order modifyOrderByClientId(long clientId, double price, double size) throws IOException {
        ModifyOrder order = new ModifyOrder();
        order.setPrice(price);
        order.setSize(size);
        return executeSync(orderApi.modifyOrderByClientId(clientId,order)).getResult();
    }

    public Order getOrderStatus(long orderId) throws IOException{
        return executeSync(orderApi.getOrderStatus(orderId)).getResult();
    }

    public Order getOrderStatusByClientId(long clientId) throws IOException{
        return executeSync(orderApi.getOrderStatusbyClientId(clientId)).getResult();
    }

    public FtxResponseSingle<String> cancelOrder(long orderId) throws IOException{
        return executeSync(orderApi.cancelOrder(orderId));
    }

    public FtxResponseSingle<String> cancelAllOrder(String market) throws IOException{
        return executeSync(orderApi.cancelAllOrders(new CancelAllOrder(market)));
    }
}
