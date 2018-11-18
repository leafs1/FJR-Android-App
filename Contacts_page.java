package com.example.micha.newandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;
import android.os.CountDownTimer;

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
            }
        });


        akelaitis.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "matthew.akelaitis@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        alicandri.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "leanna.alicandri@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        antognetti.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "palma.antognetti@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        antonacci.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "gianna.antonacci@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        antoniw.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "sandra.antoniw@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        armstrong.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "NaaOdey.Armstrong@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        badali.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "michael.badali@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        ballerini.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "susan.ballerini@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        battersby.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "phyllis.battersby@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        bellissimo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "andrew.bellissimo@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        benaharon.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "gina.ben-aharon@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        borbas.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "leslie.borbas@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        borsk.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "diane.borsk@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        brazel.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "kevin.brazel@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        bridgeford.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "lori.bridgeford@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        bueti.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Diego.Bueti@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        carducci.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "tania.carducci@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        cocuzzoli.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "carmela.cocuzzoli@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        comella.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Robert.Comella@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        corkum.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Keith.Corkum@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        cosgrove.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "kevin.cosgrove@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        deciantis.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anne.DeCiantis@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        defina.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "frank.defina@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        deponte.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "marialuisa.deponte@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        devin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "shawn.devin@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        diprospero.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "rosa.diprospero@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        domengoni.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "peter.domengoni@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        domingues.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "nelli.domingues@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        driscoll.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "alana.driscoll@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        elia.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "linda.deciantisElia@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        evangelista.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Mirella.Evangelista@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        fairfield.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Ania.Fairfield@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        febbraro.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Genevieve.Febbraro@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        fiacco.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "sandra.fiacco@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        fiorella.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Daniel.Fiorella@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        foltarz.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "urszula.foltarz-jalowska@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        fortino.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Jennifer.Fortino@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        gambatesa.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Angela.Gambatesa@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        geley.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anton.Geley@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        grieco.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "anna.grieco@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        gronowski.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "aneta.gronowski@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        heffernan.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "brendan.heffernan@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        hurley.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "mary.hurley@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        iozzoj.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "justin.iozzo@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        iozzom.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Mark.Iozzo@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        jargstorf.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "angela.jargstorf@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        johnson.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Theresa.Johnson@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        junyk.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "natalie.junyk@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        karanikolov.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Daria.Karanikolov@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        karman.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "sophie.karman@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        kruszynski.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "waldemar.kruszynski@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        kuczynski.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "karl.kuczynski@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        laplante.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "caroline.laplante@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        lavorato.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "concettal.lavorato@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        lee.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Andrew.Lee@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        leone.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Nicole.Leone@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        longo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "susan.longo-santia@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        loughlin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "lisa.loughlin@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        macdonald.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "michael.macdonald@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        mahon.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "jennifer.mahon@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        maone.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Salvatore.Maone@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        marmash.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Roxolana.Marmash@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        mazzucco.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Luigi.Mazzucco@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        mcgrade.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Gregory.McGrade@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        murphy.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "anna.murphy03@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        myszkal.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "philip.myszkal@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        neal.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "jeanette.neal@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        neary.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "kristine.neary@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        paris.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "evelyn.paris@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        percival.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "alexis.Percival@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        perri.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Matteo.Perri@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        plateo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "David.Plateo@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        piccolo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "gabriele.piccolo@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        ralph.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "tammy.ralph@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        ratusny.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "catherine.ratusny@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        rebelo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "maria.rebelo-dasilva@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        reilly.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Caitlin.Reilly@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        richard.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "roger.richard@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        romano.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "kristina.romano@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        rooney.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "john.rooney@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        sherrard.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "brendan.sherrard@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        sisco.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Sam.Sisco@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        slawek.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "alina.slawek@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        spadafora.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Robert.Spadafora@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        sparks.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "nicole.sparks@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        spinelli.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "elena.spinelli@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        stromain.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "warren.stromain@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        strong.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Stephen.Strong@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        teixeira.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "karyn.teixeira@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        termine.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "rosa.termine@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        tran.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Huy.tran@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        weiler.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "lisa.weiler@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        wood.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "kenneth.wood@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });


        yi.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "hanul.yi@tcdsb.org", Toast.LENGTH_LONG).show();
            }
        });




    }



}
