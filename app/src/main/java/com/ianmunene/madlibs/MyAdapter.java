package com.ianmunene.madlibs;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private String[] mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Each data item is just a string in this case
        public TextView mTextView;
        public ViewHolder(TextView tv){
            super(tv);
            mTextView = tv;
        }
    }

    // Provide a suitable dataset
    public MyAdapter(String[] myDataset){
        mDataset = myDataset;
    }

    // Create new Views (Invoked by the layout manager)
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Create a new view
        TextView view = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.simple_tv, parent, false);
        // Set the view's size, margins and paddings
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // get element from your dataset at this position
        // replace the contents of the view with that element
        holder.mTextView.setText(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }



}
