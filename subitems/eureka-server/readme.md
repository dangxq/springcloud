### SpringCloud Eureka
> Eureka 服务注册与发现的组件  
eureka是一个高可用的组件，它没有后端缓存，每一个实例注册之后需要向注册中心发送心跳（因此可以在内存中完成），在默认情况下erureka server也是一个eureka client ,必须要指定一个 server。  

**eureka-server**是服务注册中心
