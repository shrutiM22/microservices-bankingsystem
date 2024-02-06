Run the project folder in following sequence-
1. run config-server
2. service-registry
3. api-gateway
4. customer-service
5. account-service

--to check eureka server visit http://localhost:8761/
for customer-service-
--get all customers with GET method - http://localhost:8081/customers
-- get particular customer with GET method - http://localhost:8081/customers/{customerId}

--add customer with POST method- http://localhost:8081/customers

--update customer with PUT method - http://localhost:8081/customers/{customerId}

--delete customer with DELETE method- http://localhost:8081/customers/{customerId}


for account-service-

--add account with POST method http://localhost:8082/accounts

--add money with PUT method (check if customer is present) http://localhost:8082/accounts/addmoney/accountId?amount=90&customerId=customerId

--withdraw money with PUT method (check if customer is present) http://localhost:8082/accounts/withdraw/accountId?amount=90&customerId=customerId

--get account details with GET method - http://localhost:8082/accounts/accountId

--update with PUT method - http://localhost:8082/accounts/accountId

--delete with DELETE method - http://localhost:8082/accounts/account






