package com.example.pc_36.evaluacion;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by PC-36 on 16/9/2017.
 */

public class AdaptadorEstudiante extends ArrayAdapter<Estudiante> {

    public AdaptadorEstudiante(@NonNull Context context, @NonNull List<Estudiante> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Estudiante estudiante=getItem(position);

        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.item_estudiante,parent,false);
        }

        TextView lblNombre=(TextView)convertView.findViewById(R.id.lblNombre);
        TextView lblCodigo=(TextView)convertView.findViewById(R.id.lblCodigo);
        TextView lblMateria=(TextView)convertView.findViewById(R.id.lblMateria);
        TextView lblNumero=(TextView)convertView.findViewById(R.id.lblNumero);

        lblCodigo.setText("Código: "+estudiante.getCodigo());
        lblMateria.setText("Materia: "+estudiante.getPromedio());
        lblNombre.setText("Nombre: "+estudiante.getNombre());
        lblNumero.setText(Integer.toString(position + 1));
        return convertView;
    }
}
