

<html>
<head>
  <title>${title}</title>
  <style>@page land { size:landscape; }
.landscapePage { page:land; }
    table
{
border-collapse:collapse;
width:100%;
max-width:700px;
min-width:400px;
text-align:center;
}

caption
{
caption-side:bottom;
font-weight:bold;
font-style:italic;
margin:4px;
}

table,th, td
{
border: 1px solid gray;
}

th, td
{
height: 24px;
padding:4px;
vertical-align:middle;
}

th
{
background-image:url(table-shaded.png);
}

.rowtitle
{
background: #9CF;
font-weight:bold;
}
  </style>
</head>
<body><div class="landscapePage">
  <h1>Just a blank page.</h1>
  <div style="page-break-before:always;">
      <div align="center">
	      <h1>${title}</h1>
	  </div>
	  <table>
	     <tr>
	        <td><b>Name</b></td>
	        <td><b>Age</b></td>
	        <td><b>Sex</b></td>
	     </tr>
	     <#list userList as user>
	        <tr>
		        <td>${user.name}</td>
		        <td>${user.age}</td>
		        <td>
		           <#if user.sex = 1>
		             	 male
		           <#else>
		              	 female
		           </#if>
		        </td>
	        </tr>
	     </#list>
	  </table>
  </div>
  </div>
</body>
</html> 