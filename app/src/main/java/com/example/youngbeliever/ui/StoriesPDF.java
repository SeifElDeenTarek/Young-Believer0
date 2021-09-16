package com.example.youngbeliever.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.youngbeliever.R;
import com.github.barteksc.pdfviewer.PDFView;

public class StoriesPDF extends AppCompatActivity
{
    PDFView storyPDF;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stories_pdf_activity);

        storyPDF = findViewById(R.id.story_pdf_view);

        int name = getIntent().getIntExtra("name" , R.string.prophets_stories1);

        switch (name)
        {
            case R.string.prophets_stories1:
                storyPDF.fromAsset("adam.pdf")
                        .defaultPage(0)
                        .enableSwipe(true) // allows to block changing pages using swipe
                        .enableDoubletap(true)
                        .load();
                break;
            case R.string.prophets_stories2:
                storyPDF.fromAsset("nooh.pdf")
                        .defaultPage(0)
                        .enableSwipe(true) // allows to block changing pages using swipe
                        .enableDoubletap(true)
                        .load();
                break;
            case R.string.prophets_stories3:
                storyPDF.fromAsset("edres.pdf")
                        .defaultPage(0)
                        .enableSwipe(true) // allows to block changing pages using swipe
                        .enableDoubletap(true)
                        .load();
                break;
            case R.string.prophets_stories4:
                storyPDF.fromAsset("hood.pdf")
                        .defaultPage(0)
                        .enableSwipe(true) // allows to block changing pages using swipe
                        .enableDoubletap(true)
                        .load();
                break;
            case R.string.prophets_stories5:
                storyPDF.fromAsset("saleh.pdf")
                        .defaultPage(0)
                        .enableSwipe(true) // allows to block changing pages using swipe
                        .enableDoubletap(true)
                        .load();
                break;
            case R.string.prophets_stories6:
                storyPDF.fromAsset("ibrahimismail.pdf")
                        .defaultPage(0)
                        .enableSwipe(true) // allows to block changing pages using swipe
                        .enableDoubletap(true)
                        .load();
                break;
            case R.string.prophets_stories7:
                storyPDF.fromAsset("loot.pdf")
                        .defaultPage(0)
                        .enableSwipe(true) // allows to block changing pages using swipe
                        .enableDoubletap(true)
                        .load();
                break;
            case R.string.prophets_stories8:
                storyPDF.fromAsset("eshaqyaakob.pdf")
                        .defaultPage(0)
                        .enableSwipe(true) // allows to block changing pages using swipe
                        .enableDoubletap(true)
                        .load();
                break;
            case R.string.prophets_stories9:
                storyPDF.fromAsset("yosef.pdf")
                        .defaultPage(0)
                        .enableSwipe(true) // allows to block changing pages using swipe
                        .enableDoubletap(true)
                        .load();
                break;
            case R.string.prophets_stories10:
                storyPDF.fromAsset("shoeb.pdf")
                        .defaultPage(0)
                        .enableSwipe(true) // allows to block changing pages using swipe
                        .enableDoubletap(true)
                        .load();
                break;
            case R.string.prophets_stories11:
                storyPDF.fromAsset("ayob.pdf")
                        .defaultPage(0)
                        .enableSwipe(true) // allows to block changing pages using swipe
                        .enableDoubletap(true)
                        .load();
                break;
            case R.string.prophets_stories12:
                storyPDF.fromAsset("yones.pdf")
                        .defaultPage(0)
                        .enableSwipe(true) // allows to block changing pages using swipe
                        .enableDoubletap(true)
                        .load();
                break;
            case R.string.prophets_stories13:
                storyPDF.fromAsset("moosaharoon.pdf")
                        .defaultPage(0)
                        .enableSwipe(true) // allows to block changing pages using swipe
                        .enableDoubletap(true)
                        .load();
                break;
            case R.string.prophets_stories14:
                storyPDF.fromAsset("dawod.pdf")
                        .defaultPage(0)
                        .enableSwipe(true) // allows to block changing pages using swipe
                        .enableDoubletap(true)
                        .load();
                break;
            case R.string.prophets_stories15:
                storyPDF.fromAsset("soliman.pdf")
                        .defaultPage(0)
                        .enableSwipe(true) // allows to block changing pages using swipe
                        .enableDoubletap(true)
                        .load();
                break;
            case R.string.prophets_stories16:
                storyPDF.fromAsset("elias.pdf")
                        .defaultPage(0)
                        .enableSwipe(true) // allows to block changing pages using swipe
                        .enableDoubletap(true)
                        .load();
                break;
            case R.string.prophets_stories17:
                storyPDF.fromAsset("elyasa.pdf")
                        .defaultPage(0)
                        .enableSwipe(true) // allows to block changing pages using swipe
                        .enableDoubletap(true)
                        .load();
                break;
            case R.string.prophets_stories18:
                storyPDF.fromAsset("zykefl.pdf")
                        .defaultPage(0)
                        .enableSwipe(true) // allows to block changing pages using swipe
                        .enableDoubletap(true)
                        .load();
                break;
            case R.string.prophets_stories19:
                storyPDF.fromAsset("zakryayehia.pdf")
                        .defaultPage(0)
                        .enableSwipe(true) // allows to block changing pages using swipe
                        .enableDoubletap(true)
                        .load();
                break;
            case R.string.prophets_stories20:
                storyPDF.fromAsset("esa.pdf")
                        .defaultPage(0)
                        .enableSwipe(true) // allows to block changing pages using swipe
                        .enableDoubletap(true)
                        .load();
                break;
        }
    }
}