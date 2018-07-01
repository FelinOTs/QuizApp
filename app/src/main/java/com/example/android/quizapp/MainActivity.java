package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswer(View view) {

        CheckBox botany = (CheckBox) findViewById(R.id.botany);
        boolean isBotany = botany.isChecked();
        CheckBox zoology = (CheckBox) findViewById(R.id.zoology);
        boolean isZoology = zoology.isChecked();
        CheckBox entomology = (CheckBox) findViewById(R.id.entomology);
        boolean isEntomolgy = entomology.isChecked();
        CheckBox ecology = (CheckBox) findViewById(R.id.ecology);
        boolean isEcology = ecology.isChecked();


        RadioButton centrosome = (RadioButton) findViewById(R.id.centrosome);
        boolean isCentrosome = centrosome.isChecked();
        RadioButton nucleolus = (RadioButton) findViewById(R.id.nucleolus);
        boolean isNucleolus = nucleolus.isChecked();
        RadioButton lysosome = (RadioButton) findViewById(R.id.lysosome);
        boolean isLysosome = lysosome.isChecked();
        RadioButton endoplasmicReticulum = (RadioButton) findViewById(R.id.endoplasmic_reticulum);
        boolean isEndoplasmic = endoplasmicReticulum.isChecked();

        RadioButton chloroplast = (RadioButton) findViewById(R.id.chloroplast);
        boolean isChloroplast = chloroplast.isChecked();
        RadioButton endoplasmicReticulum1 = (RadioButton) findViewById(R.id.endoplasmic_reticulum1);
        boolean isEndoplasmic1 = endoplasmicReticulum1.isChecked();
        RadioButton golgiApparatus = (RadioButton) findViewById(R.id.golgi_apparatus);
        boolean isGolgiApparatus = golgiApparatus.isChecked();
        RadioButton mitochondria = (RadioButton) findViewById(R.id.mitochondria);
        boolean isMitochondria = mitochondria.isChecked();

        EditText text2 = (EditText) findViewById(R.id.answer2_field);
        String answer2 = text2.getText().toString();

        EditText text3 = (EditText) findViewById(R.id.answer3_field);
        String answer3 = text3.getText().toString();

        int score = calculateScore(isBotany,isZoology,isNucleolus,isMitochondria,answer2,answer3);

        displayScore(score);
    }

    private void displayScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score);
        scoreView.setText(""+score);
    }

    private int calculateScore(boolean isBotany, boolean isZoology, boolean isNucleolus, boolean isMitochondria, String answer2, String answer3) {
        int points = 0;

        if (isBotany == true)
            points += 10;
        if (isZoology == true)
            points += 10;
        if(isNucleolus==true)
            points +=10;
        if(isMitochondria==true)
            points+=10;
        if(answer2.contains("cell"))
            points+=10;
        if(answer3.contains("cytoplasm"))
            points+=10;
        return points;
    }

}
