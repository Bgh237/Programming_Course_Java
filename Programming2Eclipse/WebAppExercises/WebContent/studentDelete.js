function main() {
	var form = document.forms["studentForm"];

	var requestParameters = "id=" + form["id"].value;

	var requestOptions = { // 2.
		method : "POST",
		headers : {
			"Content-Type" : "application/x-www-form-urlencoded"
		},
		body : requestParameters
	};
	
	postDataToServer("http://localhost:8080/WebAppExercises/deleteStudent",
			requestOptions, processResponseStatus);
	
	document.getElementById("studentForm").reset();
}



function processResponseStatus(status) {
	
	if (status.errorCode === 0) {
		alert("Student deleted.");
	} else if (status.errorCode === 1) {
		alert("Nothing deleted. The student id is not in use");
	} else {
		alert("Nothing deleted. An unknown error occurred.");
	}
}

