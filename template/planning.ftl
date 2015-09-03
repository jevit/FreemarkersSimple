

<html>
<head>
  <title>${title}</title>
  <style>@page land { size:landscape; }
.landscapePage { page:land; }

.table
{
border-collapse:collapse;
width:100%;
max-width:700px;
min-width:400px;
text-align:center;
}
.table
{
border-collapse:collapse;
}
caption
{
caption-side:bottom;
font-weight:bold;
font-style:italic;
margin:4px;
}

.border
{
border: 1px solid gray;
}

th,td
{
height: 24px;
padding:4px;
vertical-align:middle;
}
.repas
{
background-image:url(toque.png);
}
th
{
background-image:url(table-shaded.png);
}
.left{
    float:left;
}.right{
    position: absolute;
    right: 5px;
}
.rowtitle
{
background: #9CF;
font-weight:bold;
}.tableaux{
 
   display: inline;
}
  </style>
</head>
<body>
<div >
  <div class="landscapePage">
      <div align="center">
	      <h1>${title}</h1>
	  </div>
	  	<table>
	     <tr>
	        <td><b>Nom</b></td>
	        <td><b>Age</b></td>
	        <td><b>Sexe</b></td>
	        <td><b>Repas</b></td>
	        <td><b>1h</b></td>
	        <td><b>2h</b></td>
	        <td><b>3h</b></td>
	        <td><b>4h</b></td>
	        <td><b>5h</b></td>
	        <td><b>6h</b></td>
	        <td><b>7h</b></td>
	        <td><b>8h</b></td>
	        <td><b>9h</b></td>
	        <td><b>10h</b></td>
	        <td><b>11h</b></td>
	        <td><b>12h</b></td>
	        <td><b>13h</b></td>
	        <td><b>14h</b></td>
	        <td><b>15h</b></td>
	        <td><b>16h</b></td>
	        <td><b>17h</b></td>
	        <td><b>18h</b></td>
	        <td><b>19h</b></td>
	        <td><b>20h</b></td>
	        <td><b>21h</b></td>
	        <td><b>22h</b></td>
	        <td><b>23h</b></td>
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
		        <td><div class="repas"></div></td>
		        <td><b>${user.h1}</b></td>
		        <td><b>${user.h2}</b></td>
		        <td><b>${user.h3}</b></td>
		        <td><b>${user.h4}</b></td>
		        <td><b>${user.h5}</b></td>
		        <td><b>${user.h6}</b></td>
		        <td><b>${user.h7}</b></td>
		        <td><b>${user.h8}</b></td>
		        <td><b>${user.h9}</b></td>
		        <td><b>${user.h10}</b></td>
		        <td><b>${user.h11}</b></td>
		        <td><b>${user.h12}</b></td>
		        <td><b>${user.h13}</b></td>
		        <td><b>${user.h14}</b></td>
		        <td><b>${user.h15}</b></td>
		        <td><b>${user.h16}</b></td>
		        <td><b>${user.h17}</b></td>
		        <td><b>${user.h18}</b></td>
		        <td><b>${user.h19}</b></td>
		        <td><b>${user.h20}</b></td>
		        <td><b>${user.h21}</b></td>
		        <td><b>${user.h22}</b></td>
		        <td><b>${user.h23}</b></td>
	        </tr>
	     </#list>
	  	</table>
	  
  </div>
  </div>
</body>
</html> 