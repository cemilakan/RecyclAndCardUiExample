package net.kisacasi.recyclandcarduiexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CardViewHodler>{
    private Context context;
    private List<Medicine> medicineList;

    public CustomAdapter(Context context, List<Medicine> medicineList) {
        this.context = context;
        this.medicineList = medicineList;
    }

    @NonNull
    @Override
    public CardViewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_design,parent,false);

        return new CardViewHodler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHodler holder, int position) {

        Medicine medicine =medicineList.get(position);
        holder.medicineName.setText(medicine.getMedicineName());
        holder.medicinePrice.setText("$ "+medicine.getMedicinePrice());
        //holder.medicineImage.setImageResource(R.drawable.ambulance);
        holder.medicineImage.setImageResource(context.getResources().getIdentifier(medicine.getMedicineImage(),"drawable",context.getPackageName()));

    }

    @Override
    public int getItemCount() {

        return medicineList.size();
    }

    public class CardViewHodler extends RecyclerView.ViewHolder{
        private ImageView medicineImage;
        private TextView medicineName;
        private TextView medicinePrice;

        public CardViewHodler(View view){
            super(view);
            medicineImage=(ImageView) view.findViewById(R.id.medicinePhoto);
            medicineName=(TextView) view.findViewById(R.id.medicineName);
            medicinePrice=(TextView) view.findViewById(R.id.medicinePrice);
        }
    }
}
