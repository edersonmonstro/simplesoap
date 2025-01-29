#### SIMPLESOAP

Based on tutorial from https://medium.com/@dharshithasrimal/create-a-soap-web-service-a-step-by-step-tutorial-7b16a0ff8bf4

Tested on Tomcat v10.1

## WSDL Contract

http://localhost:8080/simplesoap/calculatorWebService?wsdl

## Request Example

```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:sim="http://simplesoap/">
   <soapenv:Header/>
   <soapenv:Body>
      <sim:add>
         <arg0>3</arg0>
         <arg1>4</arg1>
      </sim:add>
   </soapenv:Body>
</soapenv:Envelope>
```

## Response
```
HTTP/1.1 200 
Content-Type: text/xml;charset=utf-8
Transfer-Encoding: chunked
Date: Fri, 24 Jan 2025 14:53:55 GMT
Keep-Alive: timeout=20
Connection: keep-alive

<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
   <S:Body>
      <ns2:addResponse xmlns:ns2="http://simplesoap/">
         <return>7</return>
      </ns2:addResponse>
   </S:Body>
</S:Envelope>
```