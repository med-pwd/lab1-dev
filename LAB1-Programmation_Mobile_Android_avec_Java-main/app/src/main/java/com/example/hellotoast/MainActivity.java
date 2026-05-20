package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //  ÉTAPE 3.1 — Déclarer les variables (les "boîtes" qui vont contenir nos éléments)
    // On déclare ici pour les utiliser partout dans la classe
    TextView textViewCompteur;
    Button btnToast;
    Button btnCompteur;
    int compteur = 0; // Le compteur démarre à 0

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //  ÉTAPE 3.2 — Relier ce Java au fichier XML (activity_main.xml)
        setContentView(R.layout.activity_main);

        // 🔗 ÉTAPE 3.3 — Trouver les éléments XML grâce à leur ID
        // findViewById() cherche l'élément dans le XML par son android:id
        textViewCompteur = findViewById(R.id.textViewCompteur);
        btnToast         = findViewById(R.id.btnToast);
        btnCompteur      = findViewById(R.id.btnCompteur);

        //  ÉTAPE 3.4 — Ajouter un écouteur de clic sur le bouton Toast
        // setOnClickListener = "écoute les clics sur ce bouton"
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  Toast.makeText() crée le message
                // this       = contexte de l'activité (MainActivity.this)
                // "..."      = le message à afficher
                // LENGTH_SHORT = durée courte (LENGTH_LONG pour plus long)
                Toast.makeText(MainActivity.this, "👋 Bonjour depuis le Toast !", Toast.LENGTH_SHORT).show();
            }
        });

        // ÉTAPE 3.5 — Ajouter un écouteur de clic sur le bouton Compteur
        btnCompteur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compteur++;  // On ajoute 1 au compteur (équivaut à compteur = compteur + 1)

                // On met à jour le texte affiché dans le TextView
                // setText() change le texte affiché
                // String.valueOf() convertit le int en String (texte)
                textViewCompteur.setText("Compteur : " + compteur);
            }
        });
    }
}
