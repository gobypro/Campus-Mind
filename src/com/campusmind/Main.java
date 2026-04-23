package com.campusmind;

import com.campusmind.models.Message;
import com.campusmind.models.ChatSession;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== BIENVENUE SUR MINDCARE ===");

        System.out.println("[M1] Utilisateur connecté : Mohamed Yassine");

        System.out.println("\n--- Test Fonctionnalité Chat (Membre 4) ---");

        ChatSession session = new ChatSession();

        Message msg1 = new Message("Bonjour Coach, j'ai besoin d'aide.", "Utilisateur", "Coach Amine");

        session.ajouterMessage(msg1);
        session.afficherHistorique();

        System.out.println("\n=== FIN DU TEST SPRINT 1 ===");
    }
}