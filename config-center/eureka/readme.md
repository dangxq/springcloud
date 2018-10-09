### 高可用的服务注册中心 Eureka

### 启动命令
java -jar E:\mySpace\springcloud\eureka\eureka-server\target\eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
java -jar E:\mySpace\springcloud\eureka\eureka-server\target\eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2


java -jar E:\mySpace\springcloud\eureka\eureka-client\target\eureka-client-0.0.1-SNAPSHOT.jar

### 配置hosts 
127.0.0.1 peer1  
127.0.0.1 peer2