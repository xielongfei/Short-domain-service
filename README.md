# Short-domain-service 短域名服务

## 本服务采用分层架构思路
- domain-infrastructure 基础实施层，数据库、缓存、队列实现可写在此层
- domain-service 抽象接口层，可对外暴露出api, 也可命名为domain-api
- domain-web 域名web层，提供http接口，适配层

## 架构图：
![](https://files.mdnice.com/user/15983/1353fea3-cc98-43cf-9f14-d31ebaeddc1f.png)


## 测试报告图：
domain-infrastructure层报告截图
![](https://files.mdnice.com/user/15983/5f302552-7450-454b-963a-582d8495ff6f.png)


### 防内存溢出思路
由于域名映射关系存在map中，也就是jvm内存里。为防止内存溢出。
1. 可设置java堆大小;
2. 设置map淘汰策略，比如初始化map队列大小，达到最大值后清除历史key值。

### 长域名转换后的值可能相同（可理解为：key值hashcode一样）
思路：
1. 类似map中红黑树结构，单独存储映射后值相同的问题；
2. 调整转换函数，2次转换处理，相当于用多个字符串函数映射出最终的值，减少字符串碰撞概率。
             
### 映射函数参考{@link Integer#toString(int, int)}
