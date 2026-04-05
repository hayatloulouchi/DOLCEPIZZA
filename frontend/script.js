function commander(nom) {
  localStorage.setItem("pizza", nom);
  window.location.href = "commande.html";
}