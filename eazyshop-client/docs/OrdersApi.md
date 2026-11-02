# EazyShopClient.OrdersApi

All URIs are relative to *https://development.eazyshop-server.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteOrderDetails**](OrdersApi.md#deleteOrderDetails) | **DELETE** /orders | Delete Order
[**demoOfAnyOf**](OrdersApi.md#demoOfAnyOf) | **GET** /anyOfOrder | Get Order Details
[**demoOfOneOf**](OrdersApi.md#demoOfOneOf) | **POST** /oneOfOrder | Insert OneOf the Order Details
[**getOrderDetails**](OrdersApi.md#getOrderDetails) | **GET** /orders | Get Order Details
[**getOrderDetailsUsingPathParam**](OrdersApi.md#getOrderDetailsUsingPathParam) | **GET** /orders/{orderId} | Get Order Details
[**saveOrderDetails**](OrdersApi.md#saveOrderDetails) | **POST** /orders | Create Order
[**updateOrderDetails**](OrdersApi.md#updateOrderDetails) | **PUT** /orders | Update Order



## deleteOrderDetails

> deleteOrderDetails(orderId)

Delete Order

Delete order details from EazyShop

### Example

```javascript
import EazyShopClient from 'eazyshop-client';
let defaultClient = EazyShopClient.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';
// Configure OAuth2 access token for authorization: oAuth2AuthCode
let oAuth2AuthCode = defaultClient.authentications['oAuth2AuthCode'];
oAuth2AuthCode.accessToken = 'YOUR ACCESS TOKEN';
// Configure API key authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.apiKeyPrefix = 'Token';
// Configure Bearer (JWT) access token for authorization: BearerAuth
let BearerAuth = defaultClient.authentications['BearerAuth'];
BearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new EazyShopClient.OrdersApi();
let orderId = 56; // Number | 
apiInstance.deleteOrderDetails(orderId).then(() => {
  console.log('API called successfully.');
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Number**|  | 

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [oAuth2AuthCode](../README.md#oAuth2AuthCode), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## demoOfAnyOf

> DemoOfAnyOf200Response demoOfAnyOf(orderId, fetchType)

Get Order Details

Get Order Details based on Order ID

### Example

```javascript
import EazyShopClient from 'eazyshop-client';
let defaultClient = EazyShopClient.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';
// Configure OAuth2 access token for authorization: oAuth2AuthCode
let oAuth2AuthCode = defaultClient.authentications['oAuth2AuthCode'];
oAuth2AuthCode.accessToken = 'YOUR ACCESS TOKEN';
// Configure API key authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.apiKeyPrefix = 'Token';
// Configure Bearer (JWT) access token for authorization: BearerAuth
let BearerAuth = defaultClient.authentications['BearerAuth'];
BearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new EazyShopClient.OrdersApi();
let orderId = 56; // Number | 
let fetchType = "fetchType_example"; // String | Fetch Type:  * `summary` - Will provide Order Summary  * `details` - Will provide Order Summary & Order Address 
apiInstance.demoOfAnyOf(orderId, fetchType).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Number**|  | 
 **fetchType** | **String**| Fetch Type:  * &#x60;summary&#x60; - Will provide Order Summary  * &#x60;details&#x60; - Will provide Order Summary &amp; Order Address  | 

### Return type

[**DemoOfAnyOf200Response**](DemoOfAnyOf200Response.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [oAuth2AuthCode](../README.md#oAuth2AuthCode), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## demoOfOneOf

> demoOfOneOf(opts)

Insert OneOf the Order Details

Insert OneOf the Order Details into Eazyshop

### Example

```javascript
import EazyShopClient from 'eazyshop-client';
let defaultClient = EazyShopClient.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';
// Configure OAuth2 access token for authorization: oAuth2AuthCode
let oAuth2AuthCode = defaultClient.authentications['oAuth2AuthCode'];
oAuth2AuthCode.accessToken = 'YOUR ACCESS TOKEN';
// Configure API key authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.apiKeyPrefix = 'Token';
// Configure Bearer (JWT) access token for authorization: BearerAuth
let BearerAuth = defaultClient.authentications['BearerAuth'];
BearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new EazyShopClient.OrdersApi();
let opts = {
  'demoOfOneOfRequest': new EazyShopClient.DemoOfOneOfRequest() // DemoOfOneOfRequest | 
};
apiInstance.demoOfOneOf(opts).then(() => {
  console.log('API called successfully.');
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **demoOfOneOfRequest** | [**DemoOfOneOfRequest**](DemoOfOneOfRequest.md)|  | [optional] 

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [oAuth2AuthCode](../README.md#oAuth2AuthCode), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


## getOrderDetails

> GetOrderDetails200Response getOrderDetails(orderId)

Get Order Details

Get order details from EazyShop

### Example

```javascript
import EazyShopClient from 'eazyshop-client';
let defaultClient = EazyShopClient.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';
// Configure OAuth2 access token for authorization: oAuth2AuthCode
let oAuth2AuthCode = defaultClient.authentications['oAuth2AuthCode'];
oAuth2AuthCode.accessToken = 'YOUR ACCESS TOKEN';
// Configure API key authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.apiKeyPrefix = 'Token';
// Configure Bearer (JWT) access token for authorization: BearerAuth
let BearerAuth = defaultClient.authentications['BearerAuth'];
BearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new EazyShopClient.OrdersApi();
let orderId = 56; // Number | 
apiInstance.getOrderDetails(orderId).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Number**|  | 

### Return type

[**GetOrderDetails200Response**](GetOrderDetails200Response.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [oAuth2AuthCode](../README.md#oAuth2AuthCode), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getOrderDetailsUsingPathParam

> GetOrderDetails200Response getOrderDetailsUsingPathParam(orderId)

Get Order Details

Get order details from EazyShop

### Example

```javascript
import EazyShopClient from 'eazyshop-client';
let defaultClient = EazyShopClient.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';
// Configure OAuth2 access token for authorization: oAuth2AuthCode
let oAuth2AuthCode = defaultClient.authentications['oAuth2AuthCode'];
oAuth2AuthCode.accessToken = 'YOUR ACCESS TOKEN';
// Configure API key authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.apiKeyPrefix = 'Token';
// Configure Bearer (JWT) access token for authorization: BearerAuth
let BearerAuth = defaultClient.authentications['BearerAuth'];
BearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new EazyShopClient.OrdersApi();
let orderId = 56; // Number | 
apiInstance.getOrderDetailsUsingPathParam(orderId).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Number**|  | 

### Return type

[**GetOrderDetails200Response**](GetOrderDetails200Response.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [oAuth2AuthCode](../README.md#oAuth2AuthCode), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## saveOrderDetails

> SaveOrderDetails201Response saveOrderDetails(opts)

Create Order

Post order details to EazyShop for processing and shipping 

### Example

```javascript
import EazyShopClient from 'eazyshop-client';
let defaultClient = EazyShopClient.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';
// Configure OAuth2 access token for authorization: oAuth2AuthCode
let oAuth2AuthCode = defaultClient.authentications['oAuth2AuthCode'];
oAuth2AuthCode.accessToken = 'YOUR ACCESS TOKEN';
// Configure API key authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.apiKeyPrefix = 'Token';
// Configure Bearer (JWT) access token for authorization: BearerAuth
let BearerAuth = defaultClient.authentications['BearerAuth'];
BearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new EazyShopClient.OrdersApi();
let opts = {
  'saveOrderDetailsRequest': new EazyShopClient.SaveOrderDetailsRequest() // SaveOrderDetailsRequest | 
};
apiInstance.saveOrderDetails(opts).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **saveOrderDetailsRequest** | [**SaveOrderDetailsRequest**](SaveOrderDetailsRequest.md)|  | [optional] 

### Return type

[**SaveOrderDetails201Response**](SaveOrderDetails201Response.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [oAuth2AuthCode](../README.md#oAuth2AuthCode), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## updateOrderDetails

> updateOrderDetails(opts)

Update Order

Update order details to EazyShop for processing and shipping 

### Example

```javascript
import EazyShopClient from 'eazyshop-client';
let defaultClient = EazyShopClient.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';
// Configure OAuth2 access token for authorization: oAuth2AuthCode
let oAuth2AuthCode = defaultClient.authentications['oAuth2AuthCode'];
oAuth2AuthCode.accessToken = 'YOUR ACCESS TOKEN';
// Configure API key authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.apiKeyPrefix = 'Token';
// Configure Bearer (JWT) access token for authorization: BearerAuth
let BearerAuth = defaultClient.authentications['BearerAuth'];
BearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new EazyShopClient.OrdersApi();
let opts = {
  'getOrderDetails200Response': new EazyShopClient.GetOrderDetails200Response() // GetOrderDetails200Response | 
};
apiInstance.updateOrderDetails(opts).then(() => {
  console.log('API called successfully.');
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getOrderDetails200Response** | [**GetOrderDetails200Response**](GetOrderDetails200Response.md)|  | [optional] 

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [oAuth2AuthCode](../README.md#oAuth2AuthCode), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

