<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8"/>
		<title>CurrencyFair</title>
	</head>
	<style>
	td {
		text-align: center;
	}
	</style>
	<body>
		<table border="1" cellspacing="0">
	  	<tr>
	  		<td>User Id</td>
	  		<td>Currency From</td>
	  		<td>Currency To</td>
	  		<td>Amount Sell</td>
	  		<td>Amount Buy</td>
	  		<td>Rate</td>
	  		<td>Time Placed</td>
	  		<td>Originating Country</td>
	  	</tr>
	  	<#list transList?sort_by("userId") as trans>
		 	<tr>
		  		<td> ${trans.userId}</td>
		  		<td> ${trans.currencyFrom}</td>
		  		<td> ${trans.currencyTo}</td>
		  		<td> ${trans.amountSell}</td>
		  		<td> ${trans.amountBuy}</td>
		  		<td> ${trans.rate}</td>
		  		<td> ${trans.timePlaced?string('dd/MM/yyyy HH:mm:ss')}</td>
		  		<td> ${trans.orginatingCountry}</td>
	  	    </tr>
		</#list>
	  </table>

		
		
	</body>
	<!--script crossorigin src="https://unpkg.com/react@17/umd/react.development.js"></script>
	<script crossorigin src="https://unpkg.com/react-dom@17/umd/react-dom.development.js"></script>
	<script src="dist/index.js"></script-->
</html>