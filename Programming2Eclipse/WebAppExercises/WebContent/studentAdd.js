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
	
	postDataToServer("http://localhost:8080/WebAppExercises/addStudent",
			requestOptions, processResponseStatus);

	document.getElementById("studentForm").reset();
}



function processResponseStatus(status) {
	
	if (status.errorCode === 0) {
		alert("Student added.");
		location.replace("FullStackExample.html");
	} else if (status.errorCode === 1) {
		alert("Nothing added. The student id is already in use");
		location.replace("FullStackExample.html");
	} else {
		alert("Nothing added. An unknown error occurred.");
		location.replace("FullStackExample.html");
	}
}
