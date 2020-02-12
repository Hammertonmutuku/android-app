package com.projects.muza.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.projects.muza.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MusicListAdapter extends RecyclerView.Adapter<MusicListAdapter.MusicViewHolder> {
    private List<Music> mRestaurants;
    private Context mContext;

    public MusicListAdapter(Context context, List<Business> restaurants) {
        mContext = context;
        mRestaurants = restaurants;

        @Override
        public MusicListAdapter.MusicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_list_item, parent, false);
            RestaurantViewHolder viewHolder = new RestaurantViewHolder(view);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(MusicListAdapter.RestaurantViewHolder holder, int position) {
            holder.bindRestaurant(mRestaurants.get(position));
        }

        @Override
        public int getItemCount() {
            return mRestaurants.size();
        }

        public class MusicViewHolder extends RecyclerView.ViewHolder {

            @BindView(R.id.restaurantNameTextView)
            TextView mNameTextView;
            @BindView(R.id.categoryTextView)
            TextView mCategoryTextView;
            @BindView(R.id.ratingTextView)
            TextView mRatingTextView;

            private Context mContext;

            public MusicViewHolder(View itemView) {
                super(itemView);
                ButterKnife.bind(this, itemView);
                mContext = itemView.getContext();
            }

            public void bindRestaurant(Business restaurant) {
                mNameTextView.setText(restaurant.getName());
                mCategoryTextView.setText(restaurant.getCategories().get(0).getTitle());
                mRatingTextView.setText("Rating: " + restaurant.getRating() + "/5");
            }
        }
    }
}
