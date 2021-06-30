package com.example.eqiposfutbol;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    private RecyclerView miRecicler;
    private RecyclerView.Adapter miAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Buscamos el control para cargar los datos
        miRecicler = (RecyclerView) findViewById(R.id.rvEquipos);

        // Añadimos que  el tamaño del RecyclerView no se cambiará

        miRecicler.setHasFixedSize(true);

        miRecicler.setLayoutManager(new LinearLayoutManager(this));
        //Especificamos el adaptador con la lista a visualizar
        miAdapter = new Adaptador(DatosEquipos());
        miRecicler.setAdapter(miAdapter);

    }

    public List<Equipos> DatosEquipos() {

        // String mnameTeam, String mcityTeam, String mliga, int mranking, int mantiguedad, int mfotoEstadio,int mfotoLogo
        List<Equipos> Lista = new ArrayList<>();
        Lista.add(new Equipos("Alaves", "Vitoria", "Primera División", 12, 1962, R.drawable.alaves_estad, R.drawable.alaves, R.drawable.alaves_team));
        Lista.add(new Equipos("Real Sociedad", "Donosti", "Primera División", 8, 1955, R.drawable.anoeta, R.drawable.realso, R.drawable.sociedad_team));
        Lista.add(new Equipos("Atletic Bilbao", "Bilbo", "Primera División", 2, 1942, R.drawable.sanmames, R.drawable.athl, R.drawable.bilbao_team));
        Lista.add(new Equipos("Athetico de Madrid", "Madrid", "Primera División", 19, 1967, R.drawable.calderon, R.drawable.atletico, R.drawable.atletico_team));
        Lista.add(new Equipos("Real Madrid", "Madrid", "Primera División", 1, 1945, R.drawable.bernabeu, R.drawable.realma, R.drawable.madrid_team));
        Lista.add(new Equipos("Osasuna", "Pamplona", "Primera División", 4, 1943, R.drawable.osasuna_est, R.drawable.osasu, R.drawable.osasuna_team));
        Lista.add(new Equipos("Malaga", "Malaga", "Primera División", 5, 1949, R.drawable.rosaleda, R.drawable.malaga, R.drawable.malaga_team));
        Lista.add(new Equipos("Sevilla", "Sevilla", "Primera División", 19, 1963, R.drawable.pizjuan, R.drawable.sevilla, R.drawable.sevilla_team));
        Lista.add(new Equipos("Tenerife", "Tenerife", "Primera División", 21, 1973, R.drawable.heliodoro, R.drawable.tenerif, R.drawable.tenerife_team));
        return Lista;
    }
}