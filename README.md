# microservices-loadBalancer-workspace

Components of a Load Balancer

1) Rule: This component determines which service instance will be chosen next for processing.

Types of Rules are:
a)Round Robin Rule: Simply chooses the instance in Round Robin manner i.e Server#1, Server#2, Server#3, Server#1, Server#2, Server#3, Server#1………

b)Availability Filtering Rule: Chooses the instance in Round Robin manner, but it also checks if the service instance is up or not.

c)Weighted Response Time Rule: This one chooses the server instance based on the performance of the instance ie high performing instance will get more requests while low performing instance will get less requests.

2) Ping: This component runs in the background to check if the instances are up or not.

3) Server List: This component checks and provides the list of service instances among which requests have to be divided.

Types of Service List
a)Static List: A fixed list of instances is provided, this cannot be changed later during execution.

b)Dynamic List: A background thread will refresh and filter the list

We will start by creating the config class, here we will define the first two components
1)Ping: PingUrl is used, it will ping each server to determine the availability.
2) Rule: Weighted Response Time Rule is chosen it will dynamically check which server instance to choose based on performance.
