//fetch loslaten op een METHOD op een URI
//antwoord toevoegen aan de pagina
fetch("/rest/GOT").then(response => response.json()).then(myJson=>{
	document.querySelector("body").appendChild(document.createElement("h1").appendChild(document.createTextNode(myJson.answer)))
})