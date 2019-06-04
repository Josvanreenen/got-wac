//fetch loslaten op een METHOD op een URI
//antwoord toevoegen aan de pagina
fetch("/rest/GOT").then(response => {
	if(response.ok){	return response.json()
	}
	else {
		var head = document.createElement("h1")
		head.appendChild(document.createTextNode("something went horribly wrong, is it random???"))
		document.querySelector("body").appendChild(head)}
	})
	.then(myJson=>{
	document.querySelector("body").appendChild(document.createElement("h1").appendChild(document.createTextNode(myJson.answer)))
})