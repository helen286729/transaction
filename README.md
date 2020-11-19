## Transaction API

This appliction consists of two RESTFUL API

1. Submit transaction - POST method
http://localhost:8081/index.html 

2. List transaction - GET method
http://localhost:8081/trans/list 

***User Id, Amount Sell, Amount Buy cannot fill in 

### Testing

a) Step 1
Try to submit fill in the form with below 
User Id: 1, 
Currency From: "HKD", 
Currency To: "USD", 
Amount Sell: 39.22
Amount Buy: 4439.3
Rate: 3.2
Originating Country:	 "HK"

b) Go to http://localhost:8081/trans/list, check whether data above showed in the list.


### Contact Developers

- Helen Tsang (lun286729@gmail.com)