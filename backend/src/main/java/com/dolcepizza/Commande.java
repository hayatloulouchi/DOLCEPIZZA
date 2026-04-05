package com.dolcepizza;

import jakarta.persistence.*;

@Entity
public class Commande {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String nomClient;
private String produit;
private int quantite;
private String adresse;
private String telephone;

// GETTERS

public Long getId() {
    return id;
}

public String getNomClient() {
    return nomClient;
}

public String getProduit() {
    return produit;
}

public int getQuantite() {
    return quantite;
}

public String getAdresse() {
    return adresse;
}

public String getTelephone() {
    return telephone;
}

// SETTERS

public void setId(Long id) {
    this.id = id;
}

public void setNomClient(String nomClient) {
    this.nomClient = nomClient;
}

public void setProduit(String produit) {
    this.produit = produit;
}

public void setQuantite(int quantite) {
    this.quantite = quantite;
}

public void setAdresse(String adresse) {
    this.adresse = adresse;
}

public void setTelephone(String telephone) {
    this.telephone = telephone;
}

}   
