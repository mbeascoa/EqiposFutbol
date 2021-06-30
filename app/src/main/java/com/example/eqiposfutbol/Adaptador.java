package com.example.eqiposfutbol;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    private List<Equipos> listaEquipos;

    public Adaptador(List<Equipos> ListaEquipo) {
        this.listaEquipos = ListaEquipo;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listado_datos, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String name = listaEquipos.get(position).getNameTeam();
        holder.txtmnameTeam.setText(name);

        String city = listaEquipos.get(position).getCityTeam();
        holder.txtmcityTeam.setText(city);

        String liga = listaEquipos.get(position).getLiga();
        holder.txtmliga.setText(liga);

        int ranking = listaEquipos.get(position).getRanking();
        holder.txtranking.setText(""+ranking);    // hacemos el truco de concatenar para pasar de entero a texto

        int antiguedad = listaEquipos.get(position).getAntiguedad();
        holder.txtantiguedad.setText(""+antiguedad);  // hacemos el truco de concatenar para pasar de entero a texto

        int estadio = listaEquipos.get(position).getFotoEstadio();
        holder.fotoEstadio.setImageResource(estadio);  //para asociar la imagen del estadio

        int logo = listaEquipos.get(position).getFotoLogo();
        holder.fotoLogo.setImageResource(logo);  //para asociar la imagen del estadio

        int equipo = listaEquipos.get(position).getFotoEquipo();
        holder.fotoEquipo.setImageResource(equipo);  //para asociar la imagen del estadio

    }

    @Override
    public int getItemCount() {
        return listaEquipos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtmnameTeam,txtmcityTeam, txtmliga, txtranking, txtantiguedad, txtpuesto, txtano ;
        private ImageView fotoEstadio, fotoLogo, fotoEquipo;

        public ViewHolder(View v) {
            super(v);
            txtmnameTeam = (TextView) v.findViewById(R.id.tv_mnameTeam);
            txtmcityTeam = (TextView) v.findViewById(R.id.tv_mcityTeam);
            txtmliga = (TextView) v.findViewById(R.id.tv_mliga);
            fotoEstadio= (ImageView) v.findViewById(R.id.img_Estadio);
            fotoLogo = (ImageView) v.findViewById((R.id.img_Logo));
            fotoEquipo = (ImageView) v.findViewById(R.id.iv_Equipo);
            txtranking = (TextView) v.findViewById(R.id.tv_mranking);
            txtantiguedad = (TextView) v.findViewById(R.id.tv_mantiguedad);
            txtpuesto = (TextView) v.findViewById(R.id.tv_Puesto);
            txtano = (TextView) v.findViewById(R.id.tv_ano);

        }
    }

}