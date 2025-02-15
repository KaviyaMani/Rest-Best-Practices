# Best practices for writing REST API's 
    REpresentational State Transfer 
        State: data, REpresentational: formats (XML, JSON, YAML, HTML), Transfer: carrying data between the consumer and provider using the HTTP protocol.
## Best Practices
1. Use Nouns for Resource Identification(Shop, Cart, Bill, Order, Customer)
2. Use Plural Nouns to Name a Resource(use customers not customer)
3. Use Proper HTTP Headers for Serialization Formats Content-Type, Accept
4. GET Method and Query Parameters Should Not Alter the State
5. Use Proper HTTP Methods (Verbs)
6. Use Proper HTTP Response Status Codes along with proper error messages
7. Field Name Casing Convention - For JSON use camelCase (userName not username)
8. RESTFul API Versioning

## API Versioning
### URI Path Versioning
    adding the different version numbers like v1,v2
### Query Parameter Versioning (Request Parameter Versioning)
    version number is passed as a query or request parameter
### Custom Header Versioning
    adding a custom header to the client HTTP request with version number
### Content Negotiation Versioning
    uses the HTTP Accept header to define the API version
    http://rest.api.com/v1/employees/20423.xml
    http://rest.api.com/v1/employees/20423.json

## Http status codes
### 2XX - Success
    200 OK - Request succeeded
    201 Created - Request succeeded and created new resource
    202 Accepted - Request received but not completed. Long running process like batch
    203 Non-Authoritative Information - returned metadata is not same as from original server. returned from local copy
    204 No Content - request fulfilled but no need to return anything
    205 Reset Content - reset the document that sent this request
    206 Partial Content - when the Range header is sent from the client to request only part of a resource
    207 Multi-Status - indicator to a client that multiple operations happened

### 3XX - Redirection
    300 Multiple Choices - The request has more than one possible response. The user agent or user should choose one of them.
    301 Moved Permanently - The URL of the requested resource has been changed permanently. The new URL is given in the response.
    302 Found - The URL of the requested resource has been changed temporarily. The new URL is given by the Location field in the response.
    303 See Other - The response can be found under a different URI should be retrieved from that resource
    304 Not Modified - response has not been modified, can reuse the cached version of data
    307 Temporary Redirect - get the requested resource at another URI with same method used here

### 4XX - Client Error
    400 Bad Request - server could not understand the request due to incorrect syntax
    401 Unauthorized - means "unauthenticated". That is, the client must authenticate itself to get the requested response.
    403 Forbidden - does not have access rights to the content. authenticated but do not have proper access
    404 Not Found - cannot find the requested resource. URL is not recognized. endpoint valid but resource does not exist.
    405 Method Not Allowed - requested resource valid and exists, but client used an unacceptable HTTP method for that request
    406 Not Acceptable - when the web server, after performing server-driven content negotiation, doesn't find any content that conforms to the criteria given by the user agent.
    407 Proxy Authentication Required - similar to 401 Unauthorized but authentication is needed to be done by a proxy.
    414 URI Too Long - The URI requested by the client is longer than the server is willing to interpret.
    415 Unsupported Media Type - The media format of the requested data is not supported by the server, so the server is rejecting the request.
    429 Too Many Requests - The user has sent too many requests in a given amount of time ("rate limiting")


### 5XX - Server Error
    500 Internal Server Error - server encountered an unexpected condition that prevented it from fulfilling the request.
    501 Not Implemented - The HTTP method is not supported by the server and cannot be handled.
    502 Bad Gateway - server got an invalid response while working as a gateway to get the response needed to handle the request.
    503 Service Unavailable - The server is not ready to handle the request.
    504 Gateway Timeout - The server is acting as a gateway and cannot get a response in time for a request