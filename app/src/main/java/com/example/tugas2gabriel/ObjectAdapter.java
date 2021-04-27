package com.example.tugas2gabriel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ObjectAdapter extends RecyclerView.Adapter<ObjectAdapter.ViewHolder> {
    private Context context;
    private ArrayList<ObjectModel> objectModels;

    public ObjectAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.item_list, viewGroup,false);
                return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ObjectAdapter.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getObjectModels().get(i).getGambar_course()).into(viewHolder.ivGambar_Course);
        viewHolder.tvNama_Course.setText(getObjectModels().get(i).getNama_course());
    }

    @Override
    public int getItemCount() {
        return getObjectModels().size();
    }

    public ArrayList<ObjectModel> getObjectModels() {
        return objectModels;
    }

    public void setObjectModels(ArrayList<ObjectModel> objectModels) {
        this.objectModels = objectModels;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivGambar_Course;
        private TextView tvNama_Course;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            ivGambar_Course = itemView.findViewById(R.id.cetak_gambar);
            tvNama_Course = itemView.findViewById(R.id.cetak_text);
        }
    }
}
