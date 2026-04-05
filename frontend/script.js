function commander(nom) {
  localStorage.setItem("pizzaChoisie", nom);
  window.location.href = "commande.html";
}

const prix = {
    "Margherita": 45,
    "Pepperoni": 55,
    "Quattro Stagioni": 60
};
function togglePassword() {
  const input = document.getElementById("password");

  if (input.type === "password") {
    input.type = "text";
  } else {
    input.type = "password";
  }
}