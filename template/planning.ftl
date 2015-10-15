

<html>
<head>
  <title>${title}</title>
  <style>@page land { size:landscape;width:100%; }
.landscapePage { page:land; width:100%;}

.table
{
border-collapse:collapse;
width:100%;
text-align:center;
}
table
{
	border-collapse:collapse;
	font-size:8px;
}


th,td
{
	min-height: 18px;
  	min-width:16px;
	max-height: 18px;
  	max-width: 16px;
}

.repas
{
	background-image:url(toque.png); 
}

.left{
    float:left;
}

.right{
    position: absolute;
    right: 5px;
}

.rowtitle
{
	background: #9CF;
	font-weight:bold;
}

.tableaux{
   display: inline;
}

.colonneHeader1{
	color:black;
	background-color:#95B3D7;
	vertical-align:middle;
	border: 0.2px solid #969696;
	text-align: center;
}
.ligneHeader1{
	color:black;
	background-color:#ecf1f8;
  	min-width: 120px;
  	max-width: 120px;
	border: 0.2px solid #969696;
	line-height: 80%;
	text-align:left;
}
.colonneDetail{
	color:black;
	vertical-align:middle;
	border: 0.2px solid #969696;
	text-align: center;
}

.colonneDetailRempli{
	background-color:#f466ff;
	color:black;
	border-left:none;
	border-right:none;
	text-align: center;
	vertical-align:middle;
}

.colonneDetailNoBorderLeft{
	border-left:none;
	border-right:none;
	vertical-align:middle;
}
  </style>
</head>
<body class="landscapePage">
      <div align="center">
	      <h2>${title}</h2>
	  </div>
	  	<table >
	     <tr>
	        <td ></td>
	        <td class="colonneHeader1"><b>Repas</b></td>
	        <td class="colonneHeader1"><b>1h</b></td>
	        <td class="colonneHeader1"><b>2h</b></td>
	        <td class="colonneHeader1"><b>3h</b></td>
	        <td class="colonneHeader1"><b>4h</b></td>
	        <td class="colonneHeader1"><b>5h</b></td>
	        <td class="colonneHeader1"><b>6h</b></td>
	        <td class="colonneHeader1"><b>7h</b></td>
	        <td class="colonneHeader1"><b>8h</b></td>
	        <td class="colonneHeader1"><b>9h</b></td>
	        <td class="colonneHeader1"><b>10h</b></td>
	        <td class="colonneHeader1"><b>11h</b></td>
	        <td class="colonneHeader1"><b>12h</b></td>
	        <td class="colonneHeader1"><b>13h</b></td>
	        <td class="colonneHeader1"><b>14h</b></td>
	        <td class="colonneHeader1"><b>15h</b></td>
	        <td class="colonneHeader1"><b>16h</b></td>
	        <td class="colonneHeader1"><b>17h</b></td>
	        <td class="colonneHeader1"><b>18h</b></td>
	        <td class="colonneHeader1"><b>19h</b></td>
	        <td class="colonneHeader1"><b>20h</b></td>
	        <td class="colonneHeader1"><b>21h</b></td>
	        <td class="colonneHeader1"><b>22h</b></td>
	        <td class="colonneHeader1"><b>23h</b></td>
	        <td class="colonneHeader1">Durée présence</td>
	     </tr>
	     <#list userList as user>
	        <tr>
		        <td class="ligneHeader1">
		        	<b> ${user.prenom} ${user.name}  </b> 	<br/>
		        	<div style="font-size:6px !important;line-height: 100%;">${user.age} ans	</div >
		        	<div style="font-size:4px !important;line-height: 100%;">${user.horaire}	</div >
		        </td>
		        <td class="colonneDetail">
		        	<#if user.repas = 1>
		             	<img src="toque.png" height="18" width="16"/>
		           <#else>
		              	 <!-- nothing -->
		           </#if>
		        </td>
		        <#if user.h1 = 1>
			       	<td class="colonneDetailRempli"></td>
		        <#else>
			       	<td class="colonneDetail"></td>	
		        </#if>
		         <#if user.h2 = 1>
			       	<td class="colonneDetailRempli"></td>
		        <#else>
			       	<td class="colonneDetail"></td>	
		        </#if>
		         <#if user.h3 = 1>
			       	<td class="colonneDetailRempli"></td>
		        <#else>
			       	<td class="colonneDetail"></td>	
		        </#if>
		         <#if user.h4 = 1>
			       	<td class="colonneDetailRempli"></td>
		        <#else>
			       	<td class="colonneDetail"></td>	
		        </#if><#if user.h5 = 1>
			       	<td class="colonneDetailRempli"></td>
		        <#else>
			       	<td class="colonneDetail"></td>	
		        </#if>
		        <#if user.h6 = 1>
			       	<td class="colonneDetailRempli"></td>
		        <#else>
			       	<td class="colonneDetail"></td>	
		        </#if><#if user.h7 = 1>
			       	<td class="colonneDetailRempli"></td>
		        <#else>
			       	<td class="colonneDetail"></td>	
		        </#if><#if user.h8 = 1>
			       	<td class="colonneDetailRempli"></td>
		        <#else>
			       	<td class="colonneDetail"></td>	
		        </#if>
		        <#if user.h9 = 1>
			       	<td class="colonneDetailRempli"></td>
		        <#else>
			       	<td class="colonneDetail"></td>	
		        </#if>
		        <#if user.h10 = 1>
			       	<td class="colonneDetailRempli"></td>
		        <#else>
			       	<td class="colonneDetail"></td>	
		        </#if>
		        <#if user.h11 = 1>
			       	<td class="colonneDetailRempli"></td>
		        <#else>
			       	<td class="colonneDetail"></td>	
		        </#if>
		         <#if user.h12 = 1>
			       	<td class="colonneDetailRempli"></td>
		        <#else>
			       	<td class="colonneDetail"></td>	
		        </#if>
		         <#if user.h13 = 1>
			       	<td class="colonneDetailRempli"></td>
		        <#else>
			       	<td class="colonneDetail"></td>	
		        </#if>
		         <#if user.h14 = 1>
			       	<td class="colonneDetailRempli"></td>
		        <#else>
			       	<td class="colonneDetail"></td>	
		        </#if>
		         <#if user.h15 = 1>
			       	<td class="colonneDetailRempli"></td>
		        <#else>
			       	<td class="colonneDetail"></td>	
		        </#if>
		         <#if user.h16 = 1>
			       	<td class="colonneDetailRempli"></td>
		        <#else>
			       	<td class="colonneDetail"></td>	
		        </#if>
		         <#if user.h17 = 1>
			       	<td class="colonneDetailRempli"></td>
		        <#else>
			       	<td class="colonneDetail"></td>	
		        </#if>
		         <#if user.h18 = 1>
			       	<td class="colonneDetailRempli"></td>
		        <#else>
			       	<td class="colonneDetail"></td>	
		        </#if>
		         <#if user.h19 = 1>
			       	<td class="colonneDetailRempli"></td>
		        <#else>
			       	<td class="colonneDetail"></td>	
		        </#if>
		         <#if user.h20 = 1>
			       	<td class="colonneDetailRempli"></td>
		        <#else>
			       	<td class="colonneDetail"></td>	
		        </#if>
		         <#if user.h21 = 1>
			       	<td class="colonneDetailRempli"></td>
		        <#else>
			       	<td class="colonneDetail"></td>	
		        </#if>
		         <#if user.h22 = 1>
			       	<td class="colonneDetailRempli"></td>
		        <#else>
			       	<td class="colonneDetail"></td>	
		        </#if>
		         <#if user.h23 = 1>
			       	<td class="colonneDetailRempli"></td>
		        <#else>
			       	<td class="colonneDetail"></td>	
		        </#if>
			    <td class="colonneDetail">${user.dureePresence}</td>
	        </tr>
	     </#list>
	  	</table>
	  
</body>
</html> 