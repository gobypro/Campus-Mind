package com.campusmind.models;

import java.util.ArrayList;
import java.util.List;

public class ChatSession {
    private List<Message> historique;

    public ChatSession() {
        this.historique = new ArrayList<>();
    }

    public void ajouterMessage(Message msg) {
        historique.add(msg);
        msg.envoyer();
    }

    public void afficherHistorique() {
        System.out.println("--- Historique de la discussion ---");
        for (Message m : historique) {
            System.out.println("- " + m.getContenu());
        }
    }
}