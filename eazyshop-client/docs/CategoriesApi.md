# EazyShopClient.CategoriesApi

All URIs are relative to *https://development.eazyshop-server.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategories**](CategoriesApi.md#getCategories) | **GET** /categories | List all categories
[**getCategoryDetails**](CategoriesApi.md#getCategoryDetails) | **GET** /categories/{categoryId} | Get a category by ID



## getCategories

> [Category] getCategories(opts)

List all categories

Returns a list of all categories supported by EazyShop.

### Example

```javascript
import EazyShopClient from 'eazyshop-client';
let defaultClient = EazyShopClient.ApiClient.instance;
// Configure HTTP basic authorization: BasicAuth
let BasicAuth = defaultClient.authentications['BasicAuth'];
BasicAuth.username = 'YOUR USERNAME';
BasicAuth.password = 'YOUR PASSWORD';

let apiInstance = new EazyShopClient.CategoriesApi();
let opts = {
  'categoryId': 101 // Number | 
};
apiInstance.getCategories(opts).then((data) => {
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

[**[Category]**](Category.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCategoryDetails

> Category getCategoryDetails(categoryId)

Get a category by ID

Returns a single category based on the provided ID.

### Example

```javascript
import EazyShopClient from 'eazyshop-client';

let apiInstance = new EazyShopClient.CategoriesApi();
let categoryId = 101; // Number | 
apiInstance.getCategoryDetails(categoryId).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Number**|  | 

### Return type

[**Category**](Category.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

