


function mediaValores() {
    let contador = 0;
    let sumaTotal = 0;
    let respuesta;
    let numero;
    let numerosValidos = [];

    respuesta = prompt("introduce número");

    while (respuesta != null) {

        numero = parseInt(respuesta);

        if (isNaN(numero)) {
            alert("Valor no válido");
        } else {
            sumaTotal += numero;
            contador++;
            numerosValidos.push(numero);
        }

        respuesta = prompt("Introduce número");
    }

    let tmp = "";

    for (let index = 0; index < numerosValidos.length; index++) {
        tmp += numerosValidos[index] + ",";

    }


    alert(`Total: ${sumaTotal}\nNúmero válidos introducidos: ${contador}\n Media: ${sumaTotal / contador}\nNumero introducidos: [${tmp}]`);


}

mediaValores();


