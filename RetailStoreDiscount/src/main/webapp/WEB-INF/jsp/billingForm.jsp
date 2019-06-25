<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form id='sampleform' >
   <p>
   Name: <input type='text' name='Name' />
   </p>
   <p>
   Email: <input type='text' name='Email' />
   </p>
    <p>
   <input type="checkbox" name="subscribe" checked />Subscribe to the News Letter
   </p>
  <p>
    Type of subscription you want:
    <p>
    <select name="type">
      <option value="standard">Standard - Free</option>
      <option value="prof">Professional - Paid</option>
    </select>
    </p>
    </p>
   <p>
   <button id="calculatebill" name='Submit'>Calculate</button>button>
   </p>
</form>


</body>
</html>