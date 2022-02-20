
# JAVA SDK for FTX API

The detailed document https://docs.ftx.com/#overview

## Installation

 Install library into your local repository using Gradle jar task

    
## Usage
### Build Client

```Java
FtxRestClient ftxRestClient = new FtxRestClient.Builder("https://ftx.com/api/")
                .withKeySecret("YOUR_API_KEY", "YOUR_SECRET")
                .withSubAccount("OPTIONAL_SUBACCOUNT_NAME ")
                .build();

```
1. If you only need to use the REST client public method, you can igonre withKeySecret method.
2. If you only want to use main account, you can ignore .withSubAccount method



## Examples
### REST API

In case of error from API call FtxApiException is thrown

#### Market

```Java
ftxRestClient.marketApi().getMarkets();
ftxRestClient.marketApi().getMarket(market);
ftxRestClient.marketApi().getOrderbook(market);
ftxRestClient.marketApi().getOrderbook(market,depth);
ftxRestClient.marketApi().getTrades(market);
ftxRestClient.marketApi().getTrades(market,startTimeSec,endTimeSec);
ftxRestClient.marketApi().getHistoricalPrices(market,resolutinSec);
ftxRestClient.marketApi().getHistoricalPrices(market,resolutinSec,startTimeSec,endTimeSec);

```

#### Order

```Java

ftxRestClient.orderApi().getOpenOrders(market);
ftxRestClient.orderApi().getOrderHistory(market,side,orderType);
ftxRestClient.orderApi().placeOrder(newOrder);
ftxRestClient.orderApi().modifyOrder(orderId,price,size);
ftxRestClient.orderApi().modifyOrderByClientId(clientId,price,size);
ftxRestClient.orderApi().getOrderStatus(orderId);
ftxRestClient.orderApi().getOrderStatusByClientId(clientId);
ftxRestClient.orderApi().cancelOrder(orderid);
ftxRestClient.orderApi().cancelAllOrder(market);

```