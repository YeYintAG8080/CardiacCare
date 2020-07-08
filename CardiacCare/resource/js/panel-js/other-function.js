function showDate(){
 	let today=new Date();
 	let date_label=document.getElementById("date-label");

/*let dateOf="";

switch(today.getDate()){

	case 1:dateOf="st";
	break;

	case 2:dateOf="nd";
	break;

	case 3:dateOf="rd";
	break;

	default:dateOf="th";
	break;
}*/

 	let month = new Array();
month[0] = "January";
month[1] = "February";
month[2] = "March";
month[3] = "April";
month[4] = "May";
month[5] = "June";
month[6] = "July";
month[7] = "August";
month[8] = "September";
month[9] = "October";
month[10] = "November";
month[11] = "December";
let monthName= month[today.getMonth()];


 	//date_label.innerText=today.getDate()+dateOf+" "+monthName+", "+today.getFullYear();
 	
 	date_label.innerText=monthName+", "+today.getDate()+", "+today.getFullYear();

} /**/