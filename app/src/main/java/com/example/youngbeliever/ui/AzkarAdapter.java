package com.example.youngbeliever.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youngbeliever.R;
import com.example.youngbeliever.pojo.AzkarModel;

import java.util.ArrayList;

public class AzkarAdapter extends RecyclerView.Adapter<AzkarAdapter.AzkarViewHolder>
{
    private ArrayList<AzkarModel> azkarList = new ArrayList<>();
    private AzkarAdapter.itemClickListener itemClickListener;

    @NonNull
    @Override
    public AzkarAdapter.AzkarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return new AzkarViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.azkar_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AzkarAdapter.AzkarViewHolder holder, int position)
    {
        holder.zekrTimes.setText(Integer.toString(azkarList.get(position).getZekrTimes()));

        if(azkarList.get(position).bsmlaHasText())
        {
            holder.bsmla.setText(azkarList.get(position).getBsmla());
            holder.bsmla.setVisibility(View.VISIBLE);
        }
        else {
            holder.bsmla.setVisibility(View.GONE);
        }

        holder.zekr.setText(azkarList.get(position).getZekr());

        if(azkarList.get(position).zakrRewardHasText())
        {
            holder.zekrReward.setText(azkarList.get(position).getZekrReward());
            holder.zekrReward.setVisibility(View.VISIBLE);
        }
        else {
            holder.zekrReward.setVisibility(View.GONE);
        }

        holder.itemView.setOnClickListener(v ->{
            itemClickListener.onItemClick(azkarList.get(position));
        });
    }

    @Override
    public int getItemCount()
    {
        return azkarList.size();
    }

    public void setList(ArrayList<AzkarModel> azkarList, AzkarAdapter.itemClickListener itemClickListener)
    {
        this.azkarList = azkarList;
        this.itemClickListener = itemClickListener;
        notifyDataSetChanged();
    }

    //Interface for ClickListener
    public interface itemClickListener
    {
        void onItemClick(AzkarModel azkarModel);
    }

    public class AzkarViewHolder extends RecyclerView.ViewHolder
    {
        TextView zekrTimes, zekr, bsmla, zekrReward;
        public AzkarViewHolder(@NonNull View itemView)
        {
            super(itemView);
            zekrTimes = itemView.findViewById(R.id.zekr_times);
            zekr = itemView.findViewById(R.id.zekr);
            bsmla = itemView.findViewById(R.id.bsmla);
            zekrReward = itemView.findViewById(R.id.zekr_reward);
        }
    }
}
