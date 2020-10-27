# spring-rest
Spring MVC model, Request mapping, Jackson to process json data in Java.


### Annotations
 @RequestMapping annotation used on request handling methods. It maps HTTP web requests to Spring Controller methods.
 
 @PathVariable annotation used to bind parts of the mapping URI to variables.
 
 @Controller annotation used to annotate classic controllers.
 This is simply a specialization of the @Component class and allows implementation classes to be autodetected through the classpath scanning.
 
 @RestController is a specialized version of the controller. 
 It includes the @Controller and @ResponseBody annotations and as a result, simplifies the controller implementation.
 
 @RequestBody annotation maps the HttpRequest body to a transfer or domain object, enabling automatic deserialization of the inbound HttpRequest 
 body onto a Java object.
 
 @ResponseBody annotation tells a controller that the object returned is automatically serialized into JSON and passed back into the HttpResponse object.
 
 **References**
 https://www.baeldung.com/rest-with-spring-series

