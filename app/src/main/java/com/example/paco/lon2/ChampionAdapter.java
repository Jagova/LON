package com.example.paco.lon2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.paco.lon2.Champion;
import com.example.paco.lon2.R;

import java.util.List;

/**
 * Created by Paco on 09/01/2018.
 */

public class ChampionAdapter extends RecyclerView.Adapter<ChampionAdapter.ViewHolder> {
    private List<Champion> champions;
    private Context context;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView tvName;
        public ImageView ivChamp;

        ViewHolder(View v) {
            super(v);
            ivChamp = v.findViewById(R.id.ivChamp);
            tvName = v.findViewById(R.id.tvName);
        }


    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public ChampionAdapter(List<Champion> champions, Context context) {
        this.champions = champions;
        this.context = context;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ChampionAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_champ, parent, false);
        // set the view's size, margins, paddings and layout parameters

        return new ViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        int i = context.getResources().getIdentifier("drawable/" + champions.get(position).img, null,context.getPackageName());
        holder.tvName.setText(champions.get(position).name);
        holder.ivChamp.setImageResource(i);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return champions.size();
    }
}

