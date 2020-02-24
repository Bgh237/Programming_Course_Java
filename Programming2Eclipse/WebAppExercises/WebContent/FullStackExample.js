function main() {
	getDataFromServer("http://localhost:8080/WebAppExercises/students", printStudents);
}

var txt = "";
var count = 0;

function printStudents(studentListServlet) {
 for (var student of studentListServlet) { // 4.
 //console.log(student);
 
 txt += "<tr>" + "<td>" + student.id + "</td><td>" + student.lastName + 
 		"</td><td>" + student.firstName + "</td><td>" + student.streetaddress + 
 		"</td><td>" + student.postcode + "</td><td>" + student.postoffice + 
 		"</td><td>" + createUpdateDeleteLinks(student.id);

																																																																		// =
 document.getElementById("tableRows").innerHTML = txt;
 }
}

function addStudent() {
	location.replace("studentAdd.html");
}

function createUpdateDeleteLinks(studentId) {
	 return "<span class='link' onclick='updateStudent(" + studentId + ");' id='Button'>Update</span>" +
	 "&nbsp;&nbsp;" +
	 "<span class='link' onclick='deleteStudent(" + studentId + ");' id='Button'>Delete</span>";
}

function updateStudent(studentId) {
	//confirm("Update student?");
	location.replace("studentUpdate.html?id=" + studentId);
	
} 

function deleteStudent(studentId) {
	//location.replace("studentUpdate.html");
	var a = confirm("Delete student " + studentId);
	
	if (a == true) {
		var requestParameters = "id=" + studentId;

		var requestOptions = {
			method : "POST",
			headers : {
				"Content-Type" : "application/x-www-form-urlencoded"
			},
			body : requestParameters
		};
		
		postDataToServer("http://localhost:8080/WebAppExercises/deleteStudent",
				requestOptions, processResponseStatus);
	}
	
	location.reload(true);
	
	/*var requestParameters = "id=" + studentId;
	
	if (confirm("Delete student " + studentID + "?")) {
		
		var requestOptions = { // 2.
				method : "POST",
				headers : {
					"Content-Type" : "application/x-www-form-urlencoded"
				},
				body : requestParameters
		};
	
	postDataToServer("http://localhost:8080/WebAppExercises/deleteStudent",
			requestOptions, processResponseStatus);
	}
*/

	document.getElementById("table").reset();
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

//main();