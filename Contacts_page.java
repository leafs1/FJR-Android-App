package com.example.micha.newandroidapp;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;
import android.os.CountDownTimer;
import android.content.ClipboardManager;

import java.util.ArrayList;
import java.util.List;

public class Contacts_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_page);


        final Button aguiar = findViewById(R.id.Aguiar);
        final Button akelaitis = findViewById(R.id.Akelaitis);
        final Button alicandri = findViewById(R.id.Alicandri);
        final Button antognetti = findViewById(R.id.Antognetti);
        final Button antonacci = findViewById(R.id.Antonacci);
        final Button antoniw = findViewById(R.id.Antoniw);
        final Button armstrong = findViewById(R.id.Armstrong);

        final Button badali = findViewById(R.id.Badali);
        final Button ballerini = findViewById(R.id.Ballerini);
        final Button battersby = findViewById(R.id.Battersby);
        final Button bellissimo = findViewById(R.id.Bellissimo);
        final Button benaharon = findViewById(R.id.Benaharon);
        final Button borbas = findViewById(R.id.Borbas);
        final Button borsk = findViewById(R.id.Borsk);
        final Button brazel = findViewById(R.id.Brazel);
        final Button bridgeford = findViewById(R.id.Bridgeford);
        final Button bueti = findViewById(R.id.Bueti);

        final Button carducci = findViewById(R.id.Carducci);
        final Button cocuzzoli = findViewById(R.id.Cocuzzoli);
        final Button comella = findViewById(R.id.Comella);
        final Button corkum = findViewById(R.id.Corkum);
        final Button cosgrove = findViewById(R.id.Cosgrove);

        final Button deciantis = findViewById(R.id.DeCiantis);
        final Button defina = findViewById(R.id.DeFina);
        final Button deponte = findViewById(R.id.DePonte);
        final Button devin = findViewById(R.id.Devin);
        final Button diprospero = findViewById(R.id.DiProspero);
        final Button domengoni = findViewById(R.id.Domengoni);
        final Button domingues = findViewById(R.id.Domingues);
        final Button driscoll = findViewById(R.id.Driscoll);

        final Button elia = findViewById(R.id.Elia);
        final Button evangelista = findViewById(R.id.Evangelista);

        final Button fairfield = findViewById(R.id.Fairfield);
        final Button febbraro = findViewById(R.id.Febbraro);
        final Button fiacco = findViewById(R.id.Fiacco);
        final Button fiorella = findViewById(R.id.Fiorella);
        final Button foltarz = findViewById(R.id.Foltarz);
        final Button fortino = findViewById(R.id.Fortino);

        final Button gambatesa = findViewById(R.id.Gambatesa);
        final Button geley = findViewById(R.id.Geley);
        final Button grieco = findViewById(R.id.Grieco);
        final Button gronowski = findViewById(R.id.Gronowski);

        final Button heffernan = findViewById(R.id.Heffernan);
        final Button hurley = findViewById(R.id.Hurley);

        final Button iozzoj = findViewById(R.id.IozzoJ);
        final Button iozzom = findViewById(R.id.IozzoM);

        final Button jargstorf = findViewById(R.id.Jargstorf);
        final Button johnson = findViewById(R.id.Johnson);
        final Button junyk = findViewById(R.id.Junyk);

        final Button karanikolov = findViewById(R.id.Karanikolov);
        final Button karman = findViewById(R.id.Karman);
        final Button kruszynski = findViewById(R.id.Kruszynski);
        final Button kuczynski = findViewById(R.id.Kuczynski);

        final Button laplante = findViewById(R.id.LaPlante);
        final Button lavorato = findViewById(R.id.Lavorato);
        final Button lee = findViewById(R.id.Lee);
        final Button leone = findViewById(R.id.Leone);
        final Button longo = findViewById(R.id.Longo);
        final Button loughlin = findViewById(R.id.Loughlin);

        final Button macdonald = findViewById(R.id.MacDonald);
        final Button mahon = findViewById(R.id.Mahon);
        final Button maone = findViewById(R.id.Maone);
        final Button marmash = findViewById(R.id.Marmash);
        final Button mazzucco = findViewById(R.id.Mazzucco);
        final Button mcgrade = findViewById(R.id.McGrade);
        final Button murphy = findViewById(R.id.Murphy);
        final Button myszkal = findViewById(R.id.Myszkal);

        final Button neal = findViewById(R.id.Neal);
        final Button neary = findViewById(R.id.Neary);

        final Button paris = findViewById(R.id.Paris);
        final Button percival = findViewById(R.id.Percival);
        final Button perri = findViewById(R.id.Perri);
        final Button plateo = findViewById(R.id.Plateo);
        final Button piccolo = findViewById(R.id.Piccolo);

        final Button ralph = findViewById(R.id.Ralph);
        final Button ratusny = findViewById(R.id.Ratusny);
        final Button rebelo = findViewById(R.id.Rebelo);
        final Button reilly = findViewById(R.id.Reilly);
        final Button richard = findViewById(R.id.Richard);
        final Button romano = findViewById(R.id.Romano);
        final Button rooney = findViewById(R.id.Rooney);

        final Button sherrard = findViewById(R.id.Sherrard);
        final Button sisco = findViewById(R.id.Sisco);
        final Button slawek = findViewById(R.id.Slawek);
        final Button spadafora = findViewById(R.id.Spadafora);
        final Button sparks = findViewById(R.id.Sparks);
        final Button spinelli = findViewById(R.id.Spinelli);
        final Button stromain = findViewById(R.id.StRomain);
        final Button strong = findViewById(R.id.Strong);

        final Button teixeira = findViewById(R.id.Teixeira);
        final Button termine = findViewById(R.id.Termine);
        final Button tran = findViewById(R.id.Tran);

        final Button weiler = findViewById(R.id.Weiler);
        final Button wood = findViewById(R.id.Wood);

        final Button yi = findViewById(R.id.Yi);




        aguiar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "angela.aguiar@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("aguiar", "angela.aguiar@tcdsb.org");
                clipboard.setPrimaryClip(clip);

            }
        });


        akelaitis.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "matthew.akelaitis@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("akelaitis", "matthew.akelaitis@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        alicandri.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "leanna.alicandri@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("alicandri", "leanna.alicandri@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        antognetti.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "palma.antognetti@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("antognetti", "palma.antognetti@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        antonacci.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "gianna.antonacci@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("antonacci", "gianna.antonacci@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        antoniw.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "sandra.antoniw@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("antoniw", "sandra.antoniw@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        armstrong.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "NaaOdey.Armstrong@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("armstrong", "NaaOdey.Armstrong@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        badali.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "michael.badali@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("badali", "michael.badali@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        ballerini.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "susan.ballerini@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("ballerini", "susan.ballerini@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        battersby.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "phyllis.battersby@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("battersby", "phyllis.battersby@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        bellissimo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "andrew.bellissimo@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("bellissimo", "andrew.bellissimo@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        benaharon.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "gina.ben-aharon@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("aharon", "gina.ben-aharon@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        borbas.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "leslie.borbas@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("borbas", "leslie.borbas@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        borsk.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "diane.borsk@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("borsk", "diane.borsk@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        brazel.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "kevin.brazel@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("brazel", "kevin.brazel@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        bridgeford.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "lori.bridgeford@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("bridgeford", "lori.bridgeford@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        bueti.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Diego.Bueti@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Bueti", "Diego.Bueti@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        carducci.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "tania.carducci@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("carducci", "tania.carducci@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        cocuzzoli.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "carmela.cocuzzoli@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("cocuzzoli", "carmela.cocuzzoli@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        comella.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Robert.Comella@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("comella", "Robert.Comella@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        corkum.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Keith.Corkum@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Corkum", "Keith.Corkum@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        cosgrove.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "kevin.cosgrove@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("cosgrove", "kevin.cosgrove@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        deciantis.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anne.DeCiantis@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("deciantis", "Anne.DeCiantis@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        defina.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "frank.defina@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("defina", "frank.defina@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        deponte.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "marialuisa.deponte@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("deponte", "marialuisa.deponte@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        devin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "shawn.devin@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("devin", "shawn.devin@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        diprospero.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "rosa.diprospero@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("diprospero", "rosa.diprospero@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        domengoni.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "peter.domengoni@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("domengoni", "peter.domengoni@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        domingues.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "nelli.domingues@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("dominguesi", "nelli.domingues@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        driscoll.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "alana.driscoll@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("driscoll", "alana.driscoll@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        elia.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "linda.deciantisElia@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("elia", "linda.deciantisElia@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        evangelista.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Mirella.Evangelista@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("evangelista", "Mirella.Evangelista@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        fairfield.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Ania.Fairfield@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("fairfield", "Ania.Fairfield@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        febbraro.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Genevieve.Febbraro@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("febbraro", "Genevieve.Febbraro@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        fiacco.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "sandra.fiacco@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("fiacco", "sandra.fiacco@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        fiorella.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Daniel.Fiorella@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("fiorella", "Daniel.Fiorella@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        foltarz.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "urszula.foltarz-jalowska@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("jalowska", "urszula.foltarz-jalowska@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        fortino.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Jennifer.Fortino@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("fortino", "Jennifer.Fortino@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        gambatesa.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Angela.Gambatesa@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("gambatesa", "Angela.Gambatesa@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        geley.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anton.Geley@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("geley", "Anton.Geley@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        grieco.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "anna.grieco@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("grieco", "anna.grieco@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        gronowski.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "aneta.gronowski@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("gronowski", "aneta.gronowski@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        heffernan.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "brendan.heffernan@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("heffernan", "brendan.heffernan@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        hurley.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "mary.hurley@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("hurley", "mary.hurley@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        iozzoj.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "justin.iozzo@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("iozzoj", "justin.iozzo@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        iozzom.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Mark.Iozzo@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("iozzom", "Mark.Iozzo@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        jargstorf.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "angela.jargstorf@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("jargstorf", "angela.jargstorf@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        johnson.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Theresa.Johnson@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("johnson", "Theresa.Johnson@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        junyk.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "natalie.junyk@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("junyk", "natalie.junyk@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        karanikolov.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Daria.Karanikolov@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("karanikolov", "Daria.Karanikolov@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        karman.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "sophie.karman@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("karman", "sophie.karman@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        kruszynski.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "waldemar.kruszynski@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("kruszynski", "waldemar.kruszynski@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        kuczynski.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "karl.kuczynski@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("kuczynski", "karl.kuczynski@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        laplante.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "caroline.laplante@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("laplante", "caroline.laplante@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        lavorato.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "concettal.lavorato@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("lavorato", "concettal.lavorato@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        lee.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Andrew.Lee@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("lee", "Andrew.Lee@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        leone.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Nicole.Leone@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("leone", "Nicole.Leone@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        longo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "susan.longo-santia@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("longo", "susan.longo-santia@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        loughlin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "lisa.loughlin@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("loughlin", "lisa.loughlin@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        macdonald.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "michael.macdonald@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("macdonald", "michael.macdonald@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        mahon.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "jennifer.mahon@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("mahon", "jennifer.mahon@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        maone.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Salvatore.Maone@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("maone", "Salvatore.Maone@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        marmash.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Roxolana.Marmash@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("marmash", "Roxolana.Marmash@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        mazzucco.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Luigi.Mazzucco@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("mazzucco", "Luigi.Mazzucco@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        mcgrade.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Gregory.McGrade@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("mcgrade", "Gregory.McGrade@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        murphy.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "anna.murphy03@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("murphy", "anna.murphy03@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        myszkal.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "philip.myszkal@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("myszkal", "philip.myszkal@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        neal.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "jeanette.neal@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("neal", "jeanette.neal@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        neary.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "kristine.neary@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("neary", "kristine.neary@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        paris.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "evelyn.paris@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("paris", "evelyn.paris@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        percival.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "alexis.Percival@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("percival", "alexis.Percival@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        perri.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Matteo.Perri@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("perri", "Matteo.Perri@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        plateo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "David.Plateo@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("plateo", "David.Plateo@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        piccolo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "gabriele.piccolo@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("piccolo", "gabriele.piccolo@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        ralph.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "tammy.ralph@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("ralph", "tammy.ralph@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        ratusny.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "catherine.ratusny@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("ratusny", "catherine.ratusny@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        rebelo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "maria.rebelo-dasilva@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("dasilva", "maria.rebelo-dasilva@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        reilly.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Caitlin.Reilly@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("reilly", "Caitlin.Reilly@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        richard.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "roger.richard@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("richard", "roger.richard@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        romano.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "kristina.romano@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("romano", "kristina.romano@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        rooney.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "john.rooney@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("rooney", "john.rooney@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        sherrard.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "brendan.sherrard@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("sherrard", "brendan.sherrard@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        sisco.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Sam.Sisco@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("sisco", "Sam.Sisco@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        slawek.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "alina.slawek@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("slawek", "alina.slawek@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        spadafora.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Robert.Spadafora@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("spadafora", "Robert.Spadafora@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        sparks.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "nicole.sparks@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("sparks", "nicole.sparks@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        spinelli.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "elena.spinelli@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("spinelli", "elena.spinelli@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        stromain.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "warren.stromain@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("stromain", "warren.stromain@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        strong.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Stephen.Strong@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("strong", "Stephen.Strong@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        teixeira.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "karyn.teixeira@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("teixeira", "karyn.teixeira@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        termine.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "rosa.termine@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("termine", "rosa.termine@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        tran.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Huy.tran@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("tran", "Huy.tran@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        weiler.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "lisa.weiler@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("weiler", "lisa.weiler@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        wood.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "kenneth.wood@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("wood", "kenneth.wood@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });


        yi.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "hanul.yi@tcdsb.org", Toast.LENGTH_LONG).show();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("yi", "hanul.yi@tcdsb.org");
                clipboard.setPrimaryClip(clip);
            }
        });




    }



}
