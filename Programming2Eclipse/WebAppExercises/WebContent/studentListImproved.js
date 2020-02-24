function main() {
	getDataFromServer("http://localhost:8080/WebAppExercises/students", printStudents);
}

var txt = "";

function printStudents(studentListServlet) {
 for (var student of studentListServlet) { // 4.
 console.log(student);
 
 txt += "<tr>" + "<td>" + student.id + "</td><td>" + student.lastName + "</td><td>" + student.firstName + "</td><td>" + student.streetaddress + "</td><td>" + student.postcode + "</td><td>" + student.postoffice + "</td></tr>" ;
 
 document.getElementById("tableRows").innerHTML = txt;
 }
}

main();

//document.getElementById("tableRows").innerHTML = student;