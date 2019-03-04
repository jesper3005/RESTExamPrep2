
var url = "http://localhost:8084/RestPart3/api/test/data/?/1";
var amount = document.getElementById("amount");
var data = document.getElementById("data");

/* global fetch*/
function getPersons() {
    fetch(url.replace("?", amount.value))
            .then(res => res.json())
            .then(data => {
                var table = "";
                table += "<table>";
                table += "<tr>";
                table += "<th>ID</th>";
                table += "<th>first name</th>";
                table += "<th>last name</th>";
                table += "<th>age</th>";
                table += "</tr>";
                data.forEach(function (person) {
                    table += "<tr>";
                    table += "<td>" + person.id + "</td>";
                    table += "<td>" + person.fName + "</td>";
                    table += "<td>" + person.lName + "</td>";
                    table += "<td>" + person.age + "</td>";
                    table += "</tr>";
                });
                table += "</table>";
                document.getElementById("data").innerHTML = table;
                
                /*
                data.innerHTML = table;
                */
            });
}