# View application as set of MicroServices on Payara


## municipio-service-api

Contains the return value of the rest endpoint and the definition of the municipio service as an interface.

## municipio-service

Implementation of the municipio service.

You can test it by starting the service with **start-municipio.sh** and calling _http://localhost:8180/municipio/data/municipio/<name>_.

## unidade-federativa-service-api
 
Contains the return value of the rest endpoint and the definition of the unidade federativa service as an interface.

## unidade-federativa-service

Implementation of the unidade federativa service.

You can test it by starting the service with **start-unidade-federativa.sh** and calling _http://localhost:8280/unidadefederativa/data/unidadefederativa/<value>?years=<nbr>

    
## view

Implementation of the JSF View.

## Start all services

All the services can be started by the **start.sh** and application can be accessed by the URL _http://localhost:8080/view/index.xhtml_




