function main(){
	getDataFromServerUpdate("http://localhost:8080/WebAppExercises/updateStudent?id=999", list)
}

function list(student) {
	document.getElementById("a").innerHTML = student.id + " " + student.firstName;
}