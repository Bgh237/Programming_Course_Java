function get(){
	//var id = getParameterByName('id');
	
	var a = document.location.href; 
	var id = a.split("=")[1];
	var url = "http://localhost:8080/WebAppExercises/updateStudent?id=" + id;
	
	getDataFromServerUpdate(url, populate);

}

function populate(student) {
	var form = document.forms["studentForm"];
	form["id"].disabled = true;
	form["id"].value = student.id;
	form["firstName"].value = student.firstName;
	form["lastName"].value = student.lastName;
	form["streetAddress"].value = student.streetaddress;
	form["postcode"].value = student.postcode;
	form["postOffice"].value = student.postoffice;

	 
}

function main() {
	var form = document.forms["studentForm"];

	var requestParameters = 
		"id=" + form["id"].value + 
		"&firstName=" + form["firstName"].value + 
		"&lastName=" + form["lastName"].value + 
		"&streetAddress=" + form["streetAddress"].value + 
		"&postcode=" + form["postcode"].value + 
		"&postOffice=" + form["postOffice"].value;

	var requestOptions = { // 2.
		method : "POST",
		headers : {
			"Content-Type" : "application/x-www-form-urlencoded"
		},
		body : requestParameters
	};
	
	postDataToServer("http://localhost:8080/WebAppExercises/updateStudent",
			requestOptions, processResponseStatus);

	
}



function processResponseStatus(status) {
	
	if (status.errorCode === 1) {
		alert("Student updated.");
		location.replace("FullStackExample.html");
	/*} else if (status.errorCode === 1) {
		alert("Nothing updated. The student id is not in use");*/
	} else {
		alert("Nothing updated. An unknown error occurred.");		
	}
}