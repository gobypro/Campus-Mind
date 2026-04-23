package com.campusmind.models;

import java.time.LocalDateTime;

public class Message {
    private String contenu;
    private String expediteur;
    private String destinataire;
    private LocalDateTime dateEnvoi;

    // Constructeur
    public Message(String contenu, String expediteur, String destinataire) {
        this.contenu = contenu;
        this.expediteur = expediteur;
        this.destinataire = destinataire;
        this.dateEnvoi = LocalDateTime.now();
    }

    // Méthode pour simuler l'envoi
    public void envoyer() {
        System.out.println("[M4 - Chat] Message de " + expediteur + " envoyé à " + destinataire);
        System.out.println("Contenu : " + contenu);
    }

    // Getters
    public String getContenu() { return contenu; }
}