function main() {
 fetch("http://localhost:8080/WebAppExercises/students") // 1.
 .then(response => response.json()) // 2.
 .then(studentListServlet => printStudents(studentListServlet)); // 3.
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

