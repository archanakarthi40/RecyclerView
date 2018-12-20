package com.example.dell.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mImageName=new ArrayList<>();
    private ArrayList<String> mImagea= new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(Context context,ArrayList<String> imageNames, ArrayList<String> images) {
        this.mImageName = imageNames;
        this.mImagea = images;
        this.mContext = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list,parent,false);
        ViewHolder holder= new ViewHolder(view);
        
        
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        Glide.with(mContext).asBitmap().load(mImagea.get(position)).into(holder.imageview);

        holder.imagename.setText(mImageName.get(position));

        holder.parentlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: click on" +mImageName.get(position));
                Toast.makeText(mContext,mImageName.get(position),Toast.LENGTH_SHORT).show();

            }
        }) ;
        

    }

    @Override
    public int getItemCount() {
        return mImageName.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imageview;
        TextView imagename;
        RelativeLayout parentlayout;

        public ViewHolder(View itemView){

            super(itemView);
            imageview=itemView.findViewById(R.id.image);
            imagename=itemView.findViewById(R.id.image_name);
            parentlayout=itemView.findViewById(R.id.parentlayout);





        }



    }
}
