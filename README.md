# springboot-spring-integration-service-activator
A Simple example explaining spring integration service activator concept using java configurations in spring boot

Service Activators – connect a spring object/bean to a message channel 

Service is triggered when the message comes in.

If the service provides an output, then it is routed to outbound channel 

It should define the service class as well as the message channel. 

The argument to the service method could be either a message or an arbitrary type 

When the service method has no argument, then the service activator is referred to as event-style service activator 
