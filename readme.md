## SpringCloud
> Spring Cloud为开发人员提供了快速构建分布式系统中一些常见模式的工具（例如配置管理，服务发现，断路器，智能路由，微代理，控制总线）。分布式系统的协调导致了样板模式, 使用Spring Cloud开发人员可以快速地支持实现这些模式的服务和应用程序

### Eureka
> Eureka 服务注册与发现的组件  
> eureka是一个高可用的组件，它没有后端缓存，每一个实例注册之后需要向注册中心发送心跳（因此可以在内存中完成），在默认情况下erureka server也是一个eureka client ,必须要指定一个 server。  


### Ribbon
> 在微服务架构中，业务都会被拆分成一个独立的服务，服务与服务的通讯是基于http restful的。Spring cloud有两种服务调用方式，一种是ribbon+restTemplate，另一种是feign


### Feign
> Feign是一个声明式的伪Http客户端，它使得写Http客户端变得更简单。使用Feign，只需要创建一个接口并注解。它具有可插拔的注解特性，可使用Feign 注解和JAX-RS注解。Feign支持可插拔的编码器和解码器。Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。


### Zuul
> Zuul 是可以和Eureka、Ribbon、Hystrix 等组件配合使用的服务网关，Zuul 的核心是一系列的过滤器，这些过滤器可以完成以下功能：
> - 身份认证与安全：识别每个资源的验证要求，并拒绝那些鱼要求不符的请求
> - 审查与监控：在边缘位置追踪有有意义的数据和统计结果，从而带来精确的生产视图
> - 动态路由：动态地将请求路由到不同的后端集群
> - 压力测试：主键增加指向集群的流量，以了解性能
> - 负载分配：为每一种负载类型分配对应容量，并弃用超出限定值的请求
> - 静态响应处理：在边缘位置直接建立部分响应，从而避免其转发到内部集群
> - 多区域弹性：跨越AWS Region进行请求路由，旨在实现ELB（Elastic Load Balancing）使用的多样化，以及让系统的边缘更贴近系统的使用者

### Hystrix
> Hystrix 是一个实现了超时机制和断路模式的工具类库。用于隔离访问远程系统、服务或者第三方库，防止级联失败，从而提升系统的可用性和容错性。

### Swagger2
> http://localhost:{port}}/swagger-ui.html

### Actuator
> Spring Boot Actuator 提供了很多监控断点。可以使用http://{ip}:{port}/actuator/{endpoint}的形式访问这些断电，从而了解应用程序的运行状况。


