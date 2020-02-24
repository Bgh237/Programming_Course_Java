function getDataFromServer(url, showStudentList) {
	
	fetch(url) 
	.then(response => {
		if (response.ok) { // checks if a response is received
			return response.json();
		} else {
			throw "HTTP status code is " + response.status;
		}
	})
	.then(showStudentList) // calls the function from the
							// studentListImproved.js main.
	.catch(errorText => alert("getDataFromServer failed: " + errorText)); // alert
																			// shows
																			// pop
																			// up
}

function postDataToServer(url, requestOptions, processResponseStatus) {
	
	fetch(url, requestOptions)
	 .then(response =>  {
	  if (response.ok) {
		 // processResponseStatus(response.json());
	     return response.json();
	 } else {
		 throw "HTTP status code is " + response.status;
	  }
	 })	
	  .then(status => processResponseStatus(status))
	   .catch(errorText => console.log("Fetch failed: " + errorText));
}

function getDataFromServerUpdate(url, populate) {
	
	fetch(url) 
	.then(response => {
		if (response.ok) { // checks if a response is received
			console.log(response);
			return response.json();
		} else {
			throw "HTTP status code is " + response.status;
		}
	})
	.then(status => populate(status)) 
	.catch(errorText => alert("getDataFromServer failed: " + errorText)); 
}