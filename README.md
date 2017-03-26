# aws-lamda-user-login


#1. Code
* Upload Maven artifact - aws-lamda-user-login-0.0.1-SNAPSHOT.jar

#2: Configuration
* com.naresh.UserEvent::handleRequest

#3: Test Input

{
  "email": "nareshkumarh@live.com",
  "password": "pass"
}

#4: Response

{
  "id": 1,
  "name": "Naresh",
  "email": "nareshkumarh@live.com",
  "password": "pass"
}
