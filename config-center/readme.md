高可用的配置中心

### ◆http请求地址和资源文件映射如下:
    /{application}/{profile}[/{label}]
    /{application}-{profile}.yml
    /{label}/{application}-{profile}.yml
    /{application}-{profile}.properties
    /{label}/{application}-{profile}.properties
### ◆集群化分布式配置中心

1、eureka-server  集群化分布式配置中心 的 服务注册中心

2、config-server 配置中心 Server

3、config-client 配置中心 Client

### ◆启动顺序
eureka-server --> config-server --> config-client


### ◆浏览器访问
http://localhost:9002/hello