package com.example.paco.lon2;

import android.app.FragmentManager;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    List<Champion> champions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.i("Main activity", "Creando lista");
        champions = new ArrayList<Champion>();
        createChampions();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.container, new NewsFragment()).commit();


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();

        if (id == R.id.nav_news) {
            fragmentManager.beginTransaction().replace(R.id.container, new NewsFragment()).commit();
            // Handle the camera action
        } else if (id == R.id.nav_counterpick) {

            //Log.d(TAG,"Se pasaron los vaores al adapter");
            CounterPickFragment fragment = new CounterPickFragment();
            fragment.champions = champions;
            Log.i("Main activity", "Pasando lista");
            /*fragment.containerChamps = (ListView)findViewById(R.id.containerChamp);
            ChampionAdapter adapter = new ChampionAdapter(this,champions);*/

            fragmentManager.beginTransaction().replace(R.id.container, fragment).commit();

        } else if (id == R.id.nav_leagues) {
            fragmentManager.beginTransaction().replace(R.id.container, new LeaguesFragment()).commit();
        } else if (id == R.id.nav_runes) {
            fragmentManager.beginTransaction().replace(R.id.container, new RunesFragment()).commit();
        } else if (id == R.id.nav_contact) {

        } else if (id == R.id.nav_inc) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void createChampions() {

        //AATROX
        Champion aatrox = new Champion();
        aatrox.name = "Aatrox";
        aatrox.img = "aatrox";
        aatrox.id = 1;
        aatrox.winRatePrc = 51.39;

        aatrox.weakVs.add(2);
        aatrox.weakVs.add(3);
        aatrox.weakVs.add(4);
        aatrox.weakVs.add(5);
        aatrox.weakVs.add(6);
        aatrox.weakVs.add(7);
        aatrox.weakVs.add(8);
        aatrox.weakVs.add(9);
        aatrox.weakVs.add(10);
        aatrox.weakVs.add(11);
        aatrox.weakVs.add(12);
        aatrox.weakVs.add(13);
        aatrox.weakVs.add(14);
        aatrox.weakVs.add(15);
        aatrox.weakVs.add(16);
        aatrox.weakVs.add(17);
        aatrox.weakVs.add(18);
        aatrox.weakVs.add(19);
        aatrox.weakVs.add(20);
        aatrox.weakVs.add(21);

        aatrox.strongVs.add(22);
        aatrox.strongVs.add(23);
        aatrox.strongVs.add(24);
        aatrox.strongVs.add(25);
        aatrox.strongVs.add(26);
        aatrox.strongVs.add(27);
        aatrox.strongVs.add(28);
        aatrox.strongVs.add(29);
        aatrox.strongVs.add(30);
        aatrox.strongVs.add(31);
        aatrox.strongVs.add(32);
        aatrox.strongVs.add(33);
        aatrox.strongVs.add(34);
        aatrox.strongVs.add(35);
        aatrox.strongVs.add(36);
        aatrox.strongVs.add(37);
        aatrox.strongVs.add(38);
        aatrox.strongVs.add(39);
        aatrox.strongVs.add(40);
        aatrox.strongVs.add(41);


        champions.add(aatrox);


        //Ahri
        Champion ahri = new Champion();
        ahri.name = "Ahri";
        ahri.img = "ahri";
        ahri.id = 2;
        ahri.winRatePrc = 51.39;
        ahri.weakVs.add(0);
        ahri.strongVs.add(0);
        champions.add(ahri);

        //Akali
        Champion akali = new Champion();
        akali.name = "Akali";
        akali.img = "akali";
        akali.id = 3;
        akali.winRatePrc = 51.39;
        akali.weakVs.add(0);
        akali.strongVs.add(0);
        champions.add(akali);

        //Alstar
        Champion alistar = new Champion();
        alistar.name = "Alistar";
        alistar.img = "alistar";
        alistar.id = 4;
        alistar.winRatePrc = 51.39;
        alistar.weakVs.add(0);
        //alistar.weakVs.add(3);
        alistar.strongVs.add(0);
        champions.add   (alistar);

        //Amumu
        Champion amumu = new Champion();
        amumu.name = "Amumu";
        amumu.img = "amumu";
        amumu.id = 5;
        amumu.winRatePrc = 51.39;
        amumu.weakVs.add(0);
        amumu.strongVs.add(0);
        champions.add(amumu);

        //Anivia
        Champion anivia = new Champion();
        anivia.name = "Anivia";
        anivia.img = "anivia";
        anivia.id = 6;
        anivia.winRatePrc = 51.39;
        anivia.weakVs.add(0);
        anivia.strongVs.add(0);
        champions.add(anivia);

        //Annie
        Champion annie = new Champion();
        annie.name = "Annie";
        annie.img = "annie";
        annie.id = 7;
        annie.winRatePrc = 51.39;
        annie.weakVs.add(0);
        annie.strongVs.add(0);
        champions.add(annie);

        //Ashe
        Champion ashe = new Champion();
        ashe.name = "Ashe";
        ashe.img = "ashe";
        ashe.id = 8;
        ashe.winRatePrc = 51.39;
        ashe.weakVs.add(0);
        ashe.strongVs.add(0);
        champions.add(ashe);

        //Aurelion Sol
        Champion aurelionsol = new Champion();
        aurelionsol.name = "Aurelion Sol";
        aurelionsol.img = "aurelionsol";
        aurelionsol.id = 9;
        aurelionsol.winRatePrc = 51.39;
        aurelionsol.weakVs.add(0);
        aurelionsol.strongVs.add(0);
        champions.add(aurelionsol);

        //Azir
        Champion azir = new Champion();
        azir.name = "Azir";
        azir.img = "azir";
        azir.id = 10;
        azir.winRatePrc = 51.39;
        azir.weakVs.add(0);
        azir.strongVs.add(0);
        champions.add(azir);

        //Bard
        Champion bard = new Champion();
        bard.name = "Bardo";
        bard.img = "bard";
        bard.id = 11;
        bard.winRatePrc = 51.39;
        bard.weakVs.add(0);
        bard.strongVs.add(0);
        champions.add(bard);

        //Blitzcrank
        Champion blitzcrank = new Champion();
        blitzcrank.name = "Blitzcrank";
        blitzcrank.img = "blitzcrank";
        blitzcrank.id = 12;
        blitzcrank.winRatePrc = 51.39;
        blitzcrank.weakVs.add(0);
        blitzcrank.strongVs.add(0);
        champions.add(blitzcrank);

        //Brand
        Champion brand = new Champion();
        brand.name = "Brand";
        brand.img = "brand";
        brand.id = 13;
        brand.winRatePrc = 51.39;
        brand.weakVs.add(0);
        brand.strongVs.add(0);
        champions.add(brand);

        //Braum
        Champion braum = new Champion();
        braum.name = "Braum";
        braum.img = "braum";
        braum.id = 14;
        braum.winRatePrc = 51.39;
        braum.weakVs.add(0);
        braum.strongVs.add(0);
        champions.add(braum);

        //Caitlyn
        Champion caitlyn = new Champion();
        caitlyn.name = "Caitlyn";
        caitlyn.img = "caitlyn";
        caitlyn.id = 15;
        caitlyn.winRatePrc = 51.39;
        caitlyn.weakVs.add(0);
        caitlyn.strongVs.add(0);
        champions.add(caitlyn);

        //Camille
        Champion camille = new Champion();
        camille.name = "Camille";
        camille.img = "camille";
        camille.id = 16;
        camille.winRatePrc = 51.39;
        camille.weakVs.add(0);
        camille.strongVs.add(0);
        champions.add(camille);

        //Cassiopeia
        Champion cassiopeia = new Champion();
        cassiopeia.name = "Cassiopeia";
        cassiopeia.img = "cassiopeia";
        cassiopeia.id = 17;
        cassiopeia.winRatePrc = 51.39;
        cassiopeia.weakVs.add(0);
        cassiopeia.strongVs.add(0);
        champions.add(cassiopeia);

        //Cho'Gath
        Champion chogath = new Champion();
        chogath.name = "Cho'Gath";
        chogath.img = "chogath";
        chogath.id = 18;
        chogath.winRatePrc = 51.39;
        chogath.weakVs.add(0);
        chogath.strongVs.add(0);
        champions.add(chogath);

        //Corki
        Champion corki = new Champion();
        corki.name = "Corki";
        corki.img = "corki";
        corki.id = 19;
        corki.winRatePrc = 51.39;
        corki.weakVs.add(0);
        corki.strongVs.add(0);
        champions.add(corki);

        //Darius
        Champion darius = new Champion();
        darius.name = "Darius";
        darius.img = "darius";
        darius.id = 20;
        darius.winRatePrc = 51.39;
        darius.weakVs.add(0);
        darius.strongVs.add(0);
        champions.add(darius);

        //Diana
        Champion diana = new Champion();
        diana.name = "Diana";
        diana.img = "diana";
        diana.id = 21;
        diana.winRatePrc = 51.39;
        diana.weakVs.add(0);
        diana.strongVs.add(0);
        champions.add(diana);

        //Dr. Mundo
        Champion drmundo = new Champion();
        drmundo.name = "Dr. Mundo";
        drmundo.img = "drmundo";
        drmundo.id = 22;
        drmundo.winRatePrc = 51.39;
        drmundo.weakVs.add(0);
        drmundo.strongVs.add(0);
        champions.add(drmundo);

        //Draven
        Champion draven = new Champion();
        draven.name = "Draven";
        draven.img = "draven";
        draven.id = 23;
        draven.winRatePrc = 51.39;
        draven.weakVs.add(0);
        draven.strongVs.add(0);
        champions.add(draven);

        //Ekko
        Champion ekko = new Champion();
        ekko.name = "Ekko";
        ekko.img = "ekko";
        ekko.id = 24;
        ekko.winRatePrc = 51.39;
        ekko.weakVs.add(0);
        ekko.strongVs.add(0);
        champions.add(ekko);

        //Elise
        Champion elise = new Champion();
        elise.name = "Elise";
        elise.img = "elise";
        elise.id = 25;
        elise.winRatePrc = 51.39;
        elise.weakVs.add(0);
        elise.strongVs.add(0);
        champions.add(elise);

        //Evelynn
        Champion evelynn = new Champion();
        evelynn.name = "Evelynn";
        evelynn.img = "evelynn";
        evelynn.id = 26;
        evelynn.winRatePrc = 51.39;
        evelynn.weakVs.add(0);
        evelynn.strongVs.add(0);
        champions.add(evelynn);

        //Ezreal
        Champion ezreal = new Champion();
        ezreal.name = "Ezreal";
        ezreal.img = "ezreal";
        ezreal.id = 27;
        ezreal.winRatePrc = 51.39;
        ezreal.weakVs.add(0);
        ezreal.strongVs.add(0);
        champions.add(ezreal);

        //Fiddlesticks
        Champion fiddlesticks = new Champion();
        fiddlesticks.name = "Fiddlesticks";
        fiddlesticks.img = "fiddlesticks";
        fiddlesticks.id = 28;
        fiddlesticks.winRatePrc = 51.39;
        fiddlesticks.weakVs.add(0);
        fiddlesticks.strongVs.add(0);
        champions.add(fiddlesticks);

        //Fiora
        Champion fiora = new Champion();
        fiora.name = "Fiora";
        fiora.img = "fiora";
        fiora.id = 29;
        fiora.winRatePrc = 51.39;
        fiora.weakVs.add(0);
        fiora.strongVs.add(0);
        champions.add(fiora);

        //Fizz
        Champion fizz = new Champion();
        fizz.name = "Fizz";
        fizz.img = "fizz";
        fizz.id = 30;
        fizz.winRatePrc = 51.39;
        fizz.weakVs.add(0);
        fizz.strongVs.add(0);
        champions.add(fizz);

        //Galio
        Champion galio = new Champion();
        galio.name = "Galio";
        galio.img = "galio";
        galio.id = 31;
        galio.winRatePrc = 51.39;
        galio.weakVs.add(0);
        galio.strongVs.add(0);
        champions.add(galio);

        //Gankplank
        Champion gankplank = new Champion();
        gankplank.name = "Gankplank";
        gankplank.img = "gankplank";
        gankplank.id = 32;
        gankplank.winRatePrc = 51.39;
        gankplank.weakVs.add(0);
        gankplank.strongVs.add(0);
        champions.add(gankplank);

        //Garen
        Champion garen = new Champion();
        garen.name = "Garen";
        garen.img = "garen";
        garen.id = 33;
        garen.winRatePrc = 51.39;
        garen.weakVs.add(0);
        garen.strongVs.add(0);
        champions.add(garen);

        //Gnar
        Champion gnar = new Champion();
        gnar.name = "Gnar";
        gnar.img = "gnar";
        gnar.id = 34;
        gnar.winRatePrc = 51.39;
        gnar.weakVs.add(0);
        gnar.strongVs.add(0);
        champions.add(gnar);

        //Gragas
        Champion gragas = new Champion();
        gragas.name = "Gragas";
        gragas.img = "gragas";
        gragas.id = 35;
        gragas.winRatePrc = 51.39;
        gragas.weakVs.add(0);
        gragas.strongVs.add(0);
        champions.add(gragas);

        //Graves
        Champion graves = new Champion();
        graves.name = "Graves";
        graves.img = "graves";
        graves.id = 36;
        graves.winRatePrc = 51.39;
        graves.weakVs.add(0);
        graves.strongVs.add(0);
        champions.add(graves);

        //Hecarim
        Champion hecarim = new Champion();
        hecarim.name = "Hecarim";
        hecarim.img = "hecarim";
        hecarim.id = 37;
        hecarim.winRatePrc = 51.39;
        hecarim.weakVs.add(0);
        hecarim.strongVs.add(0);
        champions.add(hecarim);

        //Heimerdinger
        Champion heimerdinger = new Champion();
        heimerdinger.name = "Heimerdinger";
        heimerdinger.img = "heimerdinger";
        heimerdinger.id = 38;
        heimerdinger.winRatePrc = 51.39;
        heimerdinger.weakVs.add(0);
        heimerdinger.strongVs.add(0);
        champions.add(heimerdinger);

        //Illaoi
        Champion illaoi = new Champion();
        illaoi.name = "Illaoi";
        illaoi.img = "illaoi";
        illaoi.id = 39;
        illaoi.winRatePrc = 51.39;
        illaoi.weakVs.add(0);
        illaoi.strongVs.add(0);
        champions.add(illaoi);

        //Irelia
        Champion irelia  = new Champion();
        irelia.name = "Irelia";
        irelia.img = "irelia";
        irelia.id = 40;
        irelia.winRatePrc = 51.39;
        irelia.weakVs.add(0);
        irelia.strongVs.add(0);
        champions.add(irelia);

        //Ivern
        Champion ivern = new Champion();
        ivern.name = "Ivern";
        ivern.img = "ivern";
        ivern.id = 41;
        ivern.winRatePrc = 51.39;
        ivern.weakVs.add(0);
        ivern.strongVs.add(0);
        champions.add(ivern);

        //Janna
        Champion janna = new Champion();
        janna.name = "Janna";
        janna.img = "janna";
        janna.id = 42;
        janna.winRatePrc = 51.39;
        janna.weakVs.add(0);
        janna.strongVs.add(0);
        champions.add(janna);

        //JarvanIV
        Champion jarvaniv = new Champion();
        jarvaniv.name = "Jarvan IV";
        jarvaniv.img = "jarvaniv";
        jarvaniv.id = 43;
        jarvaniv.winRatePrc = 51.39;
        jarvaniv.weakVs.add(0);
        jarvaniv.strongVs.add(0);
        champions.add(jarvaniv);

        //Jax
        Champion jax = new Champion();
        jax.name = "Jax";
        jax.img = "jax";
        jax.id = 44;
        jax.winRatePrc = 51.39;
        jax.weakVs.add(0);
        jax.strongVs.add(0);
        champions.add(jax);

        //Jayce
        Champion jayce = new Champion();
        jayce.name = "Jayce";
        jayce.img = "jayce";
        jayce.id = 45;
        jayce.winRatePrc = 51.39;
        jayce.weakVs.add(0);
        jayce.strongVs.add(0);
        champions.add(jayce);

        //Jhin
        Champion jhin = new Champion();
        jhin.name = "Jhin";
        jhin.img = "jhin";
        jhin.id = 46;
        jhin.winRatePrc = 51.39;
        jhin.weakVs.add(0);
        jhin.strongVs.add(0);
        champions.add(jhin);

        //Jinx
        Champion jinx = new Champion();
        jinx.name = "Jinx";
        jinx.img = "jinx";
        jinx.id = 47;
        jinx.winRatePrc = 51.39;
        jinx.weakVs.add(0);
        jinx.strongVs.add(0);
        champions.add(jinx);

        //Kalista
        Champion kalista = new Champion();
        kalista.name = "Kalista";
        kalista.img = "kalista";
        kalista.id = 48;
        kalista.winRatePrc = 51.39;
        kalista.weakVs.add(0);
        kalista.strongVs.add(0);
        champions.add(kalista);

        //Karma
        Champion karma = new Champion();
        karma.name = "Karma";
        karma.img = "karma";
        karma.id = 49;
        karma.winRatePrc = 51.39;
        karma.weakVs.add(0);
        karma.strongVs.add(0);
        champions.add(karma);

        //Karthus
        Champion karthus = new Champion();
        karthus.name = "Karthus";
        karthus.img = "karthus";
        karthus.id = 50;
        karthus.winRatePrc = 51.39;
        karthus.weakVs.add(0);
        karthus.strongVs.add(0);
        champions.add(karthus);

        //Kassadin
        Champion kassadin = new Champion();
        kassadin.name = "Kassadin";
        kassadin.img = "kassadin";
        kassadin.id = 51;
        kassadin.winRatePrc = 51.39;
        kassadin.weakVs.add(0);
        kassadin.strongVs.add(0);
        champions.add(kassadin);

        //Katarina
        Champion katarina = new Champion();
        katarina.name = "Katarina";
        katarina.img = "katarina";
        katarina.id = 52;
        katarina.winRatePrc = 51.39;
        katarina.weakVs.add(0);
        katarina.strongVs.add(0);
        champions.add(katarina);

        //Kayle
        Champion kayle = new Champion();
        kayle.name = "Kayle";
        kayle.img = "kayle";
        kayle.id = 53;
        kayle.winRatePrc = 51.39;
        kayle.weakVs.add(0);
        kayle.strongVs.add(0);
        champions.add(kayle);

        //Kayn
        Champion kayn = new Champion();
        kayn.name = "Kayn";
        kayn.img = "kayn";
        kayn.id = 54;
        kayn.winRatePrc = 51.39;
        kayn.weakVs.add(0);
        kayn.strongVs.add(0);
        champions.add(kayn);

        //Kennen
        Champion kennen = new Champion();
        kennen.name = "Kennen";
        kennen.img = "kennen";
        kennen.id = 55;
        kennen.winRatePrc = 51.39;
        kennen.weakVs.add(0);
        kennen.strongVs.add(0);
        champions.add(kennen);

        //Kha'Zix
        Champion khazix = new Champion();
        khazix.name = "Kha'Zix";
        khazix.img = "khazix";
        khazix.id = 56;
        khazix.winRatePrc = 51.39;
        khazix.weakVs.add(0);
        khazix.strongVs.add(0);
        champions.add(khazix);

        //Kindred
        Champion kindred = new Champion();
        kindred.name = "Kindred";
        kindred.img = "kindred";
        kindred.id = 57;
        kindred.winRatePrc = 51.39;
        kindred.weakVs.add(0);
        kindred.strongVs.add(0);
        champions.add(kindred);

        //Kled
        Champion kled = new Champion();
        kled.name = "Kled";
        kled.img = "kled";
        kled.id = 58;
        kled.winRatePrc = 51.39;
        kled.weakVs.add(0);
        kled.strongVs.add(0);
        champions.add(kled);

        //Kog'Maw
        Champion kogmaw = new Champion();
        kogmaw.name = "Kog'Maw";
        kogmaw.img = "kogmaw";
        kogmaw.id = 59;
        kogmaw.winRatePrc = 51.39;
        kogmaw.weakVs.add(0);
        kogmaw.strongVs.add(0);
        champions.add(kogmaw);

        //LeBlanc
        Champion leblanc = new Champion();
        leblanc.name = "LeBlanc";
        leblanc.img = "leblanc";
        leblanc.id = 60;
        leblanc.winRatePrc = 51.39;
        leblanc.weakVs.add(0);
        leblanc.strongVs.add(0);
        champions.add(leblanc);

        //Lee Sin
        Champion leesin = new Champion();
        leesin.name = "Lee Sin";
        leesin.img = "leesin";
        leesin.id = 61;
        leesin.winRatePrc = 51.39;
        leesin.weakVs.add(0);
        leesin.strongVs.add(0);
        champions.add(leesin);

        //Leona
        Champion leona = new Champion();
        leona.name = "Leona";
        leona.img = "leona";
        leona.id = 62;
        leona.winRatePrc = 51.39;
        leona.weakVs.add(0);
        leona.strongVs.add(0);
        champions.add(leona);

        //Lissandra
        Champion lissandra = new Champion();
        lissandra.name = "Lissandra";
        lissandra.img = "lissandra";
        lissandra.id = 63;
        lissandra.winRatePrc = 51.39;
        lissandra.weakVs.add(0);
        lissandra.strongVs.add(0);
        champions.add(lissandra);

        //Lucian
        Champion lucian  = new Champion();
        lucian.name = "Lucian";
        lucian.img = "lucian";
        lucian.id = 64;
        lucian.winRatePrc = 51.39;
        lucian.weakVs.add(0);
        lucian.strongVs.add(0);
        champions.add(lucian);

        //Lulu
        Champion lulu = new Champion();
        lulu.name = "Lulu";
        lulu.img = "lulu";
        lulu.id = 65;
        lulu.winRatePrc = 51.39;
        lulu.weakVs.add(0);
        lulu.strongVs.add(0);
        champions.add(lulu);

        //Malphite
        Champion malphite = new Champion();
        malphite.name = "Malphite";
        malphite.img = "malphite";
        malphite.id = 66;
        malphite.winRatePrc = 51.39;
        malphite.weakVs.add(0);
        malphite.strongVs.add(0);
        champions.add(malphite);

        //Malzahar
        Champion malzahar = new Champion();
        malzahar.name = "Malzahar";
        malzahar.img = "malzahar";
        malzahar.id = 67;
        malzahar.winRatePrc = 51.39;
        malzahar.weakVs.add(0);
        malzahar.strongVs.add(0);
        champions.add(malzahar);

        //Maoikai
        Champion maokai = new Champion();
        maokai.name = "Maokai";
        maokai.img = "maokai";
        maokai.id = 68;
        maokai.winRatePrc = 51.39;
        maokai.weakVs.add(0);
        maokai.strongVs.add(0);
        champions.add(maokai);

        //Master YI
        Champion masteryi = new Champion();
        masteryi.name = "Master Yi";
        masteryi.img = "masteryi";
        masteryi.id = 69;
        masteryi.winRatePrc = 51.39;
        masteryi.weakVs.add(0);
        masteryi.strongVs.add(0);
        champions.add(masteryi);

        //Miss Fortune
        Champion missfortune = new Champion();
        missfortune.name = "Miss Fortune";
        missfortune.img = "missfortune";
        missfortune.id = 70;
        missfortune.winRatePrc = 51.39;
        missfortune.weakVs.add(0);
        missfortune.strongVs.add(0);
        champions.add(missfortune);

        //Morderkaiser
        Champion morderkaiser = new Champion();
        morderkaiser.name = "Morderkaiser";
        morderkaiser.img = "morderkaiser";
        morderkaiser.id = 71;
        morderkaiser.winRatePrc = 51.39;
        morderkaiser.weakVs.add(0);
        morderkaiser.strongVs.add(0);
        champions.add(morderkaiser);

        //Morgana
        Champion morgana = new Champion();
        morgana.name = "Morgana";
        morgana.img = "morgana";
        morgana.id = 72;
        morgana.winRatePrc = 51.39;
        morgana.weakVs.add(0);
        morgana.strongVs.add(0);
        champions.add(morgana);

        //Nami
        Champion nami = new Champion();
        nami.name = "Nami";
        nami.img = "nami";
        nami.id = 73;
        nami.winRatePrc = 51.39;
        nami.weakVs.add(0);
        nami.strongVs.add(0);
        champions.add(nami);

        //Nasus
        Champion nasus = new Champion();
        nasus.name = "Nasus";
        nasus.img = "nasus";
        nasus.id = 74;
        nasus.winRatePrc = 51.39;
        nasus.weakVs.add(0);
        nasus.strongVs.add(0);
        champions.add(nasus);

        //Nautilus
        Champion nautilus = new Champion();
        nautilus.name = "Nautilus";
        nautilus.img = "nautilus";
        nautilus.id = 75;
        nautilus.winRatePrc = 51.39;
        nautilus.weakVs.add(0);
        nautilus.strongVs.add(0);
        champions.add(nautilus);

        //Nidalee
        Champion nidalee = new Champion();
        nidalee.name = "Nidalee";
        nidalee.img = "nidalee";
        nidalee.id = 76;
        nidalee.winRatePrc = 51.39;
        nidalee.weakVs.add(0);
        nidalee.strongVs.add(0);
        champions.add(nidalee);

        //Nocturne
        Champion nocturne = new Champion();
        nocturne.name = "Nocturne";
        nocturne.img = "nocturne";
        nocturne.id = 77;
        nocturne.winRatePrc = 51.39;
        nocturne.weakVs.add(0);
        nocturne.strongVs.add(0);
        champions.add(nocturne);

        //Nunu
        Champion nunu = new Champion();
        nunu.name = "Nunu";
        nunu.img = "nunu";
        nunu.id =78;
        nunu.winRatePrc = 51.39;
        nunu.weakVs.add(0);
        nunu.strongVs.add(0);
        champions.add(nunu);

        //Olaf
        Champion olaf = new Champion();
        olaf.name = "Olaf";
        olaf.img = "olaf";
        olaf.id = 79;
        olaf.winRatePrc = 51.39;
        olaf.weakVs.add(0);
        olaf.strongVs.add(0);
        champions.add(olaf);

        //Orianna
        Champion orianna = new Champion();
        orianna.name = "Orianna";
        orianna.img = "orianna";
        orianna.id = 80;
        orianna.winRatePrc = 51.39;
        orianna.weakVs.add(0);
        orianna.strongVs.add(0);
        champions.add(orianna);

        //Ornn
        Champion ornn = new Champion();
        ornn.name = "Ornn";
        ornn.img = "ornn";
        ornn.id = 81;
        ornn.winRatePrc = 51.39;
        ornn.weakVs.add(0);
        ornn.strongVs.add(0);
        champions.add(ornn);

        //Phanteon
        Champion phanteon = new Champion();
        phanteon.name = "Pantheon";
        phanteon.img = "pantheon";
        phanteon.id = 82;
        phanteon.winRatePrc = 51.39;
        phanteon.weakVs.add(0);
        phanteon.strongVs.add(0);
        champions.add(phanteon);

        //Poppy
        Champion poppy = new Champion();
        poppy.name = "Poppy";
        poppy.img = "poppy";
        poppy.id = 83;
        poppy.winRatePrc = 51.39;
        poppy.weakVs.add(0);
        poppy.strongVs.add(0);
        champions.add(poppy);

        //Quinn
        Champion quinn = new Champion();
        quinn.name = "Quinn";
        quinn.img = "quinn";
        quinn.id = 84;
        quinn.winRatePrc = 51.39;
        quinn.weakVs.add(0);
        quinn.strongVs.add(0);
        champions.add(quinn);

        //Rakan
        Champion rakan = new Champion();
        rakan.name = "Rakan";
        rakan.img = "rakan";
        rakan.id = 85;
        rakan.winRatePrc = 51.39;
        rakan.weakVs.add(0);
        rakan.strongVs.add(0);
        champions.add(rakan);

        //Rammus
        Champion rammus = new Champion();
        rammus.name = "Rammus";
        rammus.img = "rammus";
        rammus.id = 86;
        rammus.winRatePrc = 51.39;
        rammus.weakVs.add(0);
        rammus.strongVs.add(0);
        champions.add(rammus);

        //Rek'Sai
        Champion reksai = new Champion();
        reksai.name = "Rek'Sai";
        reksai.img = "reksai";
        reksai.id = 87;
        reksai.winRatePrc = 51.39;
        reksai.weakVs.add(0);
        reksai.strongVs.add(0);
        champions.add(reksai);

        //Renekton
        Champion renekton = new Champion();
        renekton.name = "Renekton";
        renekton.img = "renekton";
        renekton.id = 88;
        renekton.winRatePrc = 51.39;
        renekton.weakVs.add(0);
        renekton.strongVs.add(0);
        champions.add(renekton);

        //Rengar
        Champion rengar = new Champion();
        rengar.name = "Rengar";
        rengar.img = "rengar";
        rengar.id = 89;
        rengar.winRatePrc = 51.39;
        rengar.weakVs.add(0);
        rengar.strongVs.add(0);
        champions.add(rengar);

        //Riven
        Champion riven = new Champion();
        riven.name = "Riven";
        riven.img = "riven";
        riven.id = 90;
        riven.winRatePrc = 51.39;
        riven.weakVs.add(0);
        riven.strongVs.add(0);
        champions.add(riven);

        //Rumble
        Champion rumble = new Champion();
        rumble.name = "Rumble";
        rumble.img = "rumble";
        rumble.id = 91;
        rumble.winRatePrc = 51.39;
        rumble.weakVs.add(0);
        rumble.strongVs.add(0);
        champions.add(rumble);

        //Ryze
        Champion ryze = new Champion();
        ryze.name = "Ryze";
        ryze.img = "ryze";
        ryze.id = 92;
        ryze.winRatePrc = 51.39;
        ryze.weakVs.add(0);
        ryze.strongVs.add(0);
        champions.add(ryze);

        //sejuani
        Champion sejuani = new Champion();
        sejuani.name = "Sejuani";
        sejuani.img = "sejuani";
        sejuani.id =93;
        sejuani.winRatePrc = 51.39;
        sejuani.weakVs.add(0);
        sejuani.strongVs.add(0);
        champions.add(sejuani);

        //Shaco
        Champion shaco = new Champion();
        shaco.name = "Shaco";
        shaco.img = "shaco";
        shaco.id =94;
        shaco.winRatePrc = 51.39;
        shaco.weakVs.add(0);
        shaco.strongVs.add(0);
        champions.add(shaco);

        //Shen
        Champion shen = new Champion();
        shen.name = "Shen";
        shen.img = "shen";
        shen.id =95;
        shen.winRatePrc = 51.39;
        shen.weakVs.add(0);
        shen.strongVs.add(0);
        champions.add(shen);

        //Shyvana
        Champion shyvana = new Champion();
        shyvana.name = "Shyvana";
        shyvana.img = "shyvana";
        shyvana.id =96;
        shyvana.winRatePrc = 51.39;
        shyvana.weakVs.add(0);
        shyvana.strongVs.add(0);
        champions.add(shyvana);

        //Singed
        Champion singed = new Champion();
        singed.name = "Singed";
        singed.img = "singed";
        singed.id =97;
        singed.winRatePrc = 51.39;
        singed.weakVs.add(0);
        singed.strongVs.add(0);
        champions.add(singed);

        //Sion
        Champion sion = new Champion();
        sion.name = "Sion";
        sion.img = "sion";
        sion.id =98;
        sion.winRatePrc = 51.39;
        sion.weakVs.add(0);
        sion.strongVs.add(0);
        champions.add(sion);

        //Sivir
        Champion sivir = new Champion();
        sivir.name = "Sivir";
        sivir.img = "sivir";
        sivir.id = 99;
        sivir.winRatePrc = 51.39;
        sivir.weakVs.add(0);
        sivir.strongVs.add(0);
        champions.add(sivir);

        //Skarner
        Champion skarner = new Champion();
        skarner.name = "Skarner";
        skarner.img = "skarner";
        skarner.id = 100;
        skarner.winRatePrc = 51.39;
        skarner.weakVs.add(0);
        skarner.strongVs.add(0);
        champions.add(skarner);

        //Sona
        Champion sona = new Champion();
        sona.name = "Sona";
        sona.img = "sona";
        sona.id = 101;
        sona.winRatePrc = 51.39;
        sona.weakVs.add(0);
        sona.strongVs.add(0);
        champions.add(sona);

        //Soraka
        Champion soraka = new Champion();
        soraka.name = "Soraka";
        soraka.img = "soraka";
        soraka.id = 102;
        soraka.winRatePrc = 51.39;
        soraka.weakVs.add(0);
        soraka.strongVs.add(0);
        champions.add(soraka);

        //Swain
        Champion swain = new Champion();
        swain.name = "Swain";
        swain.img = "swain";
        swain.id = 103;
        swain.winRatePrc = 51.39;
        swain.weakVs.add(0);
        swain.strongVs.add(0);
        champions.add(swain);

        //Syndra
        Champion syndra = new Champion();
        syndra.name = "Syndra";
        syndra.img = "syndra";
        syndra.id = 104;
        syndra.winRatePrc = 51.39;
        syndra.weakVs.add(0);
        syndra.strongVs.add(0);
        champions.add(syndra);

        //Tahm Kench
        Champion tahmkench = new Champion();
        tahmkench.name = "Tahm Kench";
        tahmkench.img = "tahmkench";
        tahmkench.id = 105;
        tahmkench.winRatePrc = 51.39;
        tahmkench.weakVs.add(0);
        tahmkench.strongVs.add(0);
        champions.add(tahmkench);

        //Taliyah
        Champion taliyah = new Champion();
        taliyah.name = "Taliyah";
        taliyah.img = "taliyah";
        taliyah.id = 106;
        taliyah.winRatePrc = 51.39;
        taliyah.weakVs.add(0);
        taliyah.strongVs.add(0);
        champions.add(taliyah);

        //Talon
        Champion talon = new Champion();
        talon.name = "Talon";
        talon.img = "talon";
        talon.id = 107;
        talon.winRatePrc = 51.39;
        talon.weakVs.add(0);
        talon.strongVs.add(0);
        champions.add(talon);

        //Taric
        Champion taric = new Champion();
        taric.name = "Taric";
        taric.img = "taric";
        taric.id = 108;
        taric.winRatePrc = 51.39;
        taric.weakVs.add(0);
        taric.strongVs.add(0);
        champions.add(taric);

        //Teemo
        Champion teemo = new Champion();
        teemo.name = "Temmo";
        teemo.img = "teemo";
        teemo.id = 109;
        teemo.winRatePrc = 51.39;
        teemo.weakVs.add(0);
        teemo.strongVs.add(0);
        champions.add(teemo);

        //Thresj
        Champion thresh = new Champion();
        thresh.name = "Thresh";
        thresh.img = "thresh";
        thresh.id =110;
        thresh.winRatePrc = 51.39;
        thresh.weakVs.add(0);
        thresh.strongVs.add(0);
        champions.add(thresh);

        //Tristana
        Champion tristana = new Champion();
        tristana.name = "Tristana";
        tristana.img = "tristana";
        tristana.id =111;
        tristana.winRatePrc = 51.39;
        tristana.weakVs.add(0);
        tristana.strongVs.add(0);
        champions.add(tristana);

        //Trundle
        Champion trundle = new Champion();
        trundle.name = "Trundle";
        trundle.img = "trundle";
        trundle.id = 112;
        trundle.winRatePrc = 51.39;
        trundle.weakVs.add(0);
        trundle.strongVs.add(0);
        champions.add(trundle);

        //Tryndamere
        Champion tryndamere = new Champion();
        tryndamere.name = "Tryndamere";
        tryndamere.img = "tryndamere";
        tryndamere.id = 113;
        tryndamere.winRatePrc = 51.39;
        tryndamere.weakVs.add(0);
        tryndamere.strongVs.add(0);
        champions.add(tryndamere);

        //Twisted Fate
        Champion twistedfate = new Champion();
        twistedfate.name = "Twisted Fate";
        twistedfate.img = "twistedfate";
        twistedfate.id = 114;
        twistedfate.winRatePrc = 51.39;
        twistedfate.weakVs.add(0);
        twistedfate.strongVs.add(0);
        champions.add(twistedfate);

        //Twitch
        Champion twitch = new Champion();
        twitch.name = "Twitch";
        twitch.img = "twitch";
        twitch.id = 115;
        twitch.winRatePrc = 51.39;
        twitch.weakVs.add(0);
        twitch.strongVs.add(0);
        champions.add(twitch);

        //Udyr
        Champion udyr = new Champion();
        udyr.name = "Udyr";
        udyr.img = "udyr";
        udyr.id = 116;
        udyr.winRatePrc = 51.39;
        udyr.weakVs.add(0);
        udyr.strongVs.add(0);
        champions.add(udyr);

        //Urgot
        Champion urgot = new Champion();
        urgot.name = "Urgot";
        urgot.img = "urgot";
        urgot.id =117;
        urgot.winRatePrc = 51.39;
        urgot.weakVs.add(0);
        urgot.strongVs.add(0);
        champions.add(urgot);

        //Varus
        Champion varus = new Champion();
        varus.name = "Varus";
        varus.img = "varus";
        varus.id = 118;
        varus.winRatePrc = 51.39;
        varus.weakVs.add(0);
        varus.strongVs.add(0);
        champions.add(varus);

        //Vayne
        Champion vayne = new Champion();
        vayne.name = "Vayne";
        vayne.img = "vayne";
        vayne.id = 119;
        vayne.winRatePrc = 51.39;
        vayne.weakVs.add(0);
        vayne.strongVs.add(0);
        champions.add(vayne);

        //Veigar
        Champion veigar = new Champion();
        veigar.name = "Veigar";
        veigar.img = "veigar";
        veigar.id = 120;
        veigar.winRatePrc = 51.39;
        veigar.weakVs.add(0);
        veigar.strongVs.add(0);
        champions.add(veigar);

        //Vel'Koz
        Champion velkoz = new Champion();
        velkoz.name = "Vel'Koz";
        velkoz.img = "velkoz";
        velkoz.id = 121;
        velkoz.winRatePrc = 51.39;
        velkoz.weakVs.add(0);
        velkoz.strongVs.add(0);
        champions.add(velkoz);

        //Vi
        Champion vi = new Champion();
        vi.name = "Vi";
        vi.img = "vi";
        vi.id = 122;
        vi.winRatePrc = 51.39;
        vi.weakVs.add(0);
        vi.strongVs.add(0);
        champions.add(vi);

        //Viktor
        Champion viktor = new Champion();
        viktor.name = "Viktor";
        viktor.img = "viktor";
        viktor.id = 123;
        viktor.winRatePrc = 51.39;
        viktor.weakVs.add(0);
        viktor.strongVs.add(0);
        champions.add(viktor);

        //Vladimir
        Champion vladimir = new Champion();
        vladimir.name = "Vladimir";
        vladimir.img = "vladimir";
        vladimir.id = 124;
        vladimir.winRatePrc = 51.39;
        vladimir.weakVs.add(0);
        vladimir.strongVs.add(0);
        champions.add(vladimir);

        //Volibear
        Champion volibear = new Champion();
        volibear.name = "Volibear";
        volibear.img = "volibear";
        volibear.id = 125;
        volibear.winRatePrc = 51.39;
        volibear.weakVs.add(0);
        volibear.strongVs.add(0);
        champions.add(volibear);

        //Warwick
        Champion warwick = new Champion();
        warwick.name = "Warwick";
        warwick.img = "warwick";
        warwick.id = 126;
        warwick.winRatePrc = 51.39;
        warwick.weakVs.add(0);
        warwick.strongVs.add(0);
        champions.add(warwick);

        //Wuokong
        Champion wukong = new Champion();
        wukong.name = "Wukong";
        wukong.img = "wukong";
        wukong.id = 127;
        wukong.winRatePrc = 51.39;
        wukong.weakVs.add(0);
        wukong.strongVs.add(0);
        champions.add(wukong);

        //Xayah
        Champion xayah = new Champion();
        xayah.name = "Xayah";
        xayah.img = "xayah";
        xayah.id = 128;
        xayah.winRatePrc = 51.39;
        xayah.weakVs.add(0);
        xayah.strongVs.add(0);
        champions.add(xayah);

        //Xerath
        Champion xerath = new Champion();
        xerath.name = "Xerath";
        xerath.img = "xerath";
        xerath.id = 129;
        xerath.winRatePrc = 51.39;
        xerath.weakVs.add(0);
        xerath.strongVs.add(0);
        champions.add(xerath);

        //Xin Zhao
        Champion xinzhao = new Champion();
        xinzhao.name = "Xin Zhao";
        xinzhao.img = "xinzhao";
        xinzhao.id = 130;
        xinzhao.winRatePrc = 51.39;
        xinzhao.weakVs.add(0);
        xinzhao.strongVs.add(0);
        champions.add(xinzhao);

        //Yasuo
        Champion yasuo = new Champion();
        yasuo.name = "Yasuo";
        yasuo.img = "yasuo";
        yasuo.id = 131;
        yasuo.winRatePrc = 51.39;
        yasuo.weakVs.add(0);
        yasuo.strongVs.add(0);
        champions.add(yasuo);

        //Yorick
        Champion yorick = new Champion();
        yorick.name = "Yorick";
        yorick.img = "yorick";
        yorick.id = 132;
        yorick.winRatePrc = 51.39;
        yorick.weakVs.add(0);
        yorick.strongVs.add(0);
        champions.add(yorick);

        //Zac
        Champion zac = new Champion();
        zac.name = "Zac";
        zac.img = "zac";
        zac.id = 133;
        zac.winRatePrc = 51.39;
        zac.weakVs.add(0);
        zac.strongVs.add(0);
        champions.add(zac);

        //Zed
        Champion zed = new Champion();
        zed.name = "Zed";
        zed.img = "zed";
        zed.id = 134;
        zed.winRatePrc = 51.39;
        zed.weakVs.add(0);
        zed.strongVs.add(0);
        champions.add(zed);

        //Ziggs
        Champion ziggs = new Champion();
        ziggs.name = "Ziggs";
        ziggs.img = "ziggs";
        ziggs.id = 135;
        ziggs.winRatePrc = 51.39;
        ziggs.weakVs.add(0);
        ziggs.strongVs.add(0);
        champions.add(ziggs);

        //Zilean
        Champion zilean = new Champion();
        zilean.name = "Zilean";
        zilean.img = "zilean";
        zilean.id = 136;
        zilean.winRatePrc = 51.39;
        zilean.weakVs.add(0);
        zilean.strongVs.add(0);
        champions.add(zilean);

        //Zoe
        Champion zoe = new Champion();
        zoe.name = "Zoe";
        zoe.img = "zoe";
        zoe.id = 137;
        zoe.winRatePrc = 51.39;
        zoe.weakVs.add(0);
        zoe.strongVs.add(0);
        champions.add(zoe);

        //Zyra
        Champion zyra = new Champion();
        zyra.name = "Zyra";
        zyra.img = "zyra";
        zyra.id = 138;
        zyra.winRatePrc = 51.39;
        zyra.weakVs.add(0);
        zyra.strongVs.add(0);
        champions.add(zyra);


    }
}