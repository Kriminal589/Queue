Server was created with technology gRPC. Server can process two request like add student to queue and like show all queue. You can find realization those requests in file, which direction is /src/main/java/org/example/ServiceImp.java

Request to add new student to queue should include student's name. Method is named like addNewStudentToQueue will be respond to this request. This method will be return result of additions new student to queue. Result will be true or false.

Request to show all queue should not contain anything. Method is named like aboutQueue will be respond to this request. This method will be return queue of students with format string.

Realization of server is located in file App, wich direction is /src/main/java/org/example/App.java
