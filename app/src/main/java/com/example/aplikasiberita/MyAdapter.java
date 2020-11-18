package com.example.aplikasiberita;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String data1[], data2[];
    int image[];
    Context context;
    String []html;

    public MyAdapter(Context ct, String s1[], String s2[], int img[],String []htmlFile){
        context = ct;
        data1 = s1;
        data2 = s2;
        image = img;
        html = htmlFile;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.judul.setText(data1[position]);
        holder.deskripsi.setText(data2[position]);
        holder.gambar.setImageResource(image[position]);
        final String htmlFile = html[position];
        
        holder.linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, webview.class);
                intent.putExtra("file",htmlFile);
                context.startActivity(intent);
            }
        });
        
    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView judul, deskripsi;
        ImageView gambar;
        ConstraintLayout linear;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.judul);
            deskripsi = itemView.findViewById(R.id.deskripsi);
            gambar = itemView.findViewById(R.id.gambar);
            linear= itemView.findViewById(R.id.linear);
            
        }
    }


}
