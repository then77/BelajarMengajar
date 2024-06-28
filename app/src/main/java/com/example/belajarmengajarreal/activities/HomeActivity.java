package com.example.belajarmengajarreal.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.*;

import com.example.belajarmengajarreal.R;


public class HomeActivity extends AppCompatActivity {

    FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        db = FirebaseFirestore.getInstance();
        Task<QuerySnapshot> queries = db.collection("materi").get();
        queries.addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                for (QueryDocumentSnapshot document : task.getResult()) {
//                    String materi = document.getString("materi");
//                    String deskripsi = document.getString("deskripsi");
//                    System.out.println(materi + " => " + deskripsi);
                }
            }
        });
    }
}