# EazyShopClient.ProductsApi

All URIs are relative to *https://development.eazyshop-server.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProductDetails**](ProductsApi.md#getProductDetails) | **GET** /products/{productId} | Return product details
[**getProducts**](ProductsApi.md#getProducts) | **GET** /products | List all products



## getProductDetails

> Product getProductDetails(productId)

Return product details

Returns the product details from  EazyShop 

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

let apiInstance = new EazyShopClient.ProductsApi();
let productId = 101; // Number | 
apiInstance.getProductDetails(productId).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Number**|  | 

### Return type

[**Product**](Product.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [oAuth2AuthCode](../README.md#oAuth2AuthCode), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getProducts

> [Product] getProducts(opts)

List all products

Returns the list of products supported by EazyShop 

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

let apiInstance = new EazyShopClient.ProductsApi();
let opts = {
  'categoryId': 101 // Number | 
};
apiInstance.getProducts(opts).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Number**|  | [optional] 

### Return type

[**[Product]**](Product.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [oAuth2AuthCode](../README.md#oAuth2AuthCode), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

