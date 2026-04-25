package com.monprojet.main;

import com.monprojet.models.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainV1 {
    public static void main(String[] args) {
        System.out.println("========== TEST SPRINT 1 - MINDCARE EDUCATION ==========\n");

        // ===== TEST 1: AUTHENTIFICATION =====
        System.out.println("--- Test 1: Authentification (Étudiant) ---");
        Etudiant etudiant = new Etudiant(1, "MORTADHA JEMNI", "MORTADHA@example.com", "password123", "Licence");
        etudiant.seConnecter();
        System.out.println("Détails de l'étudiant :");
        System.out.println("ID : " + etudiant.getId());
        System.out.println("Nom : " + etudiant.getNom());
        System.out.println("Email : " + etudiant.getEmail());
        System.out.println("Niveau d'étude : " + etudiant.getNiveau());

        // ===== TEST 2: MOOD TRACKER =====
        System.out.println("\n--- Test 2: Mood Tracker (Humeur) ---");
        Humeur humeur1 = new Humeur(1, "Heureux", new Date());
        Humeur humeur2 = new Humeur(2, "Stressé", new Date());
        Humeur humeur3 = new Humeur(3, "Motivé", new Date());
        System.out.println("Humeur 1 : " + humeur1.getEtat());
        System.out.println("Humeur 2 : " + humeur2.getEtat());
        System.out.println("Humeur 3 : " + humeur3.getEtat());

        // ===== TEST 3: RECOMMANDATIONS =====
        System.out.println("\n--- Test 3: Recommandations ---");
        String conseil1 = Recommandation.genererConseil("heureux");
        String conseil2 = Recommandation.genererConseil("stressé");
        System.out.println("Conseil pour 'Heureux' : " + conseil1);
        System.out.println("Conseil pour 'Stressé' : " + conseil2);

        Recommandation reco = new Recommandation(1, "Conseil personnalisé pour l'étudiant");
        System.out.println("Recommandation créée : " + reco.getContenu());

        // ===== TEST 4: CHAT COACH =====
        System.out.println("\n--- Test 4: Chat Coach (Message) ---");
        Message msg1 = new Message(1, "Bonjour, comment allez-vous?", LocalDateTime.now());
        Message msg2 = new Message(2, "Je vais bien, merci !", LocalDateTime.now());
        msg1.afficherDetails();
        msg2.afficherDetails();

        // ===== TEST 5: HISTORIQUE ANALYSE =====
        System.out.println("\n--- Test 5: Historique Analyse (Graphique d'Humeur) ---");
        List<Humeur> historique = new ArrayList<>();
        historique.add(new Humeur(1, "Triste", new Date()));
        historique.add(new Humeur(2, "Neutre", new Date()));
        historique.add(new Humeur(3, "Heureux", new Date()));
        historique.add(new Humeur(4, "Très heureux", new Date()));
        historique.add(new Humeur(5, "Euphorique", new Date()));

        Historique hist = new Historique();
        hist.afficherGraphiqueHumeur(historique);

        System.out.println("========== FIN DES TESTS ==========");
    }
}
