



<!DOCTYPE HTML>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>Wallet System</title>



<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>




	<style type="text/css">
		.login-container{
			width: 100%;
			height: 100%;
			display: -webkit-box;
			display: -webkit-flex;
			justify-content: center;
			align-items: center;
			background: #111111;
			background: -webkit-linear-gradient(bottom,#0250c5,#d43f8d);
			position: absolute;
			z-index: -1;


		}

		.second-div{
			width: 450px;
			height: 650px;
			background: #fff;
			border-radius: 20px;
			

		}
		.login-title{
			width: 200px;
			margin: auto;
			margin-top: 50px;
			justify-content: center;
			text-align: center;
			
		}

		.login-body{
			width: 300px;
			margin: auto;
			margin-top: 70px;
			justify-content: center;
			text-align: center;
			
		}

/* enable absolute positioning */
.inner-addon {
  position: relative;
}

/* style glyph */
.inner-addon .glyphicon {
  position: absolute;
  padding: 10px;
  pointer-events: none;
}

/* align glyph */
.left-addon .glyphicon  { left:  0px;}


/* add padding  */
.left-addon input  { padding-left:  30px; }




.btn-default, .btn-default:hover, .btn-default:active, .btn-default:visited {
    /*background-color: #d43f8d !important;*/
    width: 350px; 
	height: 40px; 
	
}

	</style>



</head>

<body >

	<div class="login-container">
		<div class="second-div">
			<div class="login-title">
				<h3>Wallet System</h3>
				<img src="wallet.png" style="width: 100px; height: 100px; margin-top: 25px;">
			</div>
			

			<div class="login-body input-group">

				
			<form action="Login" method="post">
				<div class="inner-addon left-addon">
				 <i class="glyphicon glyphicon-user" style="padding-top: 9px; z-index: 2"></i>
				 <input type="text" name="sender" class="form-control" placeholder="From" style="z-index: 1">
				</div>
				 <br>
				 <br>
				 <br>
				 
				 <div class="inner-addon left-addon">
				 <span class="glyphicon glyphicon-user" style="padding-top: 9px; z-index: 2"></span>
				 <input type="text" name="receiver" class="form-control" placeholder="To" style="z-index: 1 ">
				</div>

				 <br>
				 <br>
				 <br>
				 

				 <div class="inner-addon left-addon">
					<span class="glyphicon glyphicon-bitcoin" style="padding-top: 9px; z-index: 2"></span>
					<input type="number" name="points" class="form-control" placeholder="Points" style="z-index: 1 ">
				   </div>
				 <br>
				 <br>
				 <br>
				 <br>
				 <input type="submit" value="Send" class="btn btn-default" >
				 
				 </form>

				 <br>
				 <br>
				 <br>
				 <br>
			</div>



			
		</div>
	</div>

</body>

</html>






