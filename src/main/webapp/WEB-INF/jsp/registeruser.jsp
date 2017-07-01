<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
input[type=text], select, textarea {
	width: 100%;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: 15px;
	margin-top: 6px;
	margin-bottom: 16px;
	width: 200px;
	height: 40px;
	resize: vertical;
}

input[type=password], select, textarea {
	width: 100%;
	height: 40px;
	width: 200px;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	margin-top: 6px;
	margin-bottom: 16px;
	resize: vertical;
}

button {
	background-color: #4CAF50;
	color: white;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	padding-left: 10%;
	padding-right: 15%;
	box-sizing: border-box;
	width: 40px;
	height: 40px;
}

input[type=submit]:hover {
	background-color: #45a049;
}

.container {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 10px;
}
</style>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome To Book Outlet</title>
</head>
<body>
	<h3>Sign Up To BookOutlet</h3>
	<form action="adduser" method="POST">


		<div class="container">
			<div align="center">
			<div>
					<label><b>id</b></label> <input align="middle" type="text"
						placeholder="Enter id" name="id" required>

				</div>
			
				<div>

					<label><b>Name</b></label> <input align="middle" type="text"
						placeholder="Enter name" name="name" required>
				</div>
								<div>
					<label><b>UserName</b></label> <input align="middle" type="text"
						placeholder="Enter Username" name="uname" required>

				</div>
				<div></div>
				<div>
					<label><b>Password</b></label> <input align="middle"
						type="password" placeholder="Enter Password" name="psw" required>
				</div>
				<div></div>
				<div>
					<label><b>mobileNumber</b></label> <input align="middle"
						type="text" placeholder="Enter mobileNumber" name="mobno" required>
				</div>
				<div></div>
				<div>
					<label><b>emailID</b></label> <input align="middle" type="text"
						placeholder="Enter emailID" name="mailid" required>
				</div>
				<div></div>

				<div>
					<label><b>role</b></label> <select align="middle" name="Role">
						<option value="SELECT">select</option>
						<option value="Author">AUTHOR</option>
						<option value="User">USER</option>
						<option value="Admin">ADMIN</option>

					</select>
				</div>
				<div></div>
				<div>

<button align = "middle" type = "submit">Register</button>
					



				</div>
				<div></div>
			</div>
		</div>
	</form>
</body>
</html>