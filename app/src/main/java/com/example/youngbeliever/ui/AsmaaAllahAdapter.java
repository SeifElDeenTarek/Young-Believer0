package com.example.youngbeliever.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youngbeliever.R;
import com.example.youngbeliever.pojo.AsmaaAllahModel;

import java.util.ArrayList;

public class AsmaaAllahAdapter extends RecyclerView.Adapter<AsmaaAllahAdapter.AsmaaAllahViewHolder>
{
    private ArrayList<AsmaaAllahModel> AsmaaAllah = new ArrayList<>();
    private itemClickListener itemClickListener;

    @NonNull
    @Override
    public AsmaaAllahViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return new AsmaaAllahViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.asmaa_allah_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AsmaaAllahViewHolder holder, int position)
    {
        holder.asmAllah.setText(AsmaaAllah.get(position).getAsmAllah());

        holder.itemView.setOnClickListener(v ->{
            itemClickListener.onItemClick(AsmaaAllah.get(position));
        });
    }

    @Override
    public int getItemCount()
    {
        return AsmaaAllah.size();
    }

    public void setList(ArrayList<AsmaaAllahModel> asmaAllah, AsmaaAllahAdapter.itemClickListener itemClickListener)
    {
        this.AsmaaAllah = asmaAllah;
        this.itemClickListener = itemClickListener;
        notifyDataSetChanged();
    }

    public interface itemClickListener
    {
        void onItemClick(AsmaaAllahModel asmaaAllahModel);
    }

    public class AsmaaAllahViewHolder extends RecyclerView.ViewHolder
    {
        TextView asmAllah;
        public AsmaaAllahViewHolder(@NonNull View itemView)
        {
            super(itemView);
            asmAllah = itemView.findViewById(R.id.asm_allah);
        }
    }
}
