
const base_url = "http://localhost:3000/UD7/UD7_Tarea_Ejemplo_SPA/controller/FrontController.php";

let userId = null

window.onload = onceLoaded;


function onceLoaded() {

    console.debug("window loaded");
    document.querySelector('#formLogin').onsubmit = login;
    document.querySelector('#formLogout').onsubmit = confirmLogout;

    getRoles();
}

