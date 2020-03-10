package raum.muchbeer.cameraapp.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import raum.muchbeer.cameraapp.R;
import raum.muchbeer.cameraapp.callback.RecyclerViewClickListener;

public class StickerAdapter extends RecyclerView.Adapter<StickerAdapter.StickerViewHolder> {

    private static final String TAG = "StickerAdapter";

    private ArrayList<Drawable> mStickers = new ArrayList<>();
    private RecyclerViewClickListener mClickListener;
    private Context mContext;

    public StickerAdapter(Context mContext, ArrayList<Drawable> mStickers, RecyclerViewClickListener mClickListener) {
        this.mStickers = mStickers;
        this.mClickListener = mClickListener;
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public StickerAdapter.StickerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.layout_sticker_list_item, parent, false);
        final StickerViewHolder holder = new StickerViewHolder(view, mClickListener);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull StickerAdapter.StickerViewHolder holder, int position) {
        Glide.with(mContext)
                .load(mStickers.get(position))
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return mStickers.size();
    }


    public class StickerViewHolder extends RecyclerView.ViewHolder
                    implements View.OnClickListener{

        ImageView image;
        RecyclerViewClickListener clickListener;

        public StickerViewHolder(@NonNull View itemView, RecyclerViewClickListener clickListener) {
            super(itemView);

            image = itemView.findViewById(R.id.sticker_image);
            this.clickListener = clickListener;

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            if(clickListener != null){
                Log.d(TAG, "onClick: clicked.");
                clickListener.onStickerClicked(getAdapterPosition());
            }
        }
    }
}
