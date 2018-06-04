//package com.example.annis.crudmhs.adapter;
//
//import android.content.Context;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//import com.example.annis.crudmhs.R;
//
//import java.util.LinkedList;
//
///**
// * Created by annis on 19/05/2018.
// */
//
//public class WordListAdapter extends
//        RecyclerView.Adapter<WordListAdapter.WordViewHolder> {
//    private LinkedList<String> mWordList;
//    private LayoutInflater mInflater;
//
//    public WordListAdapter(Context context, LinkedList<String> wordList) {
//        mInflater = LayoutInflater.from(context);
//        this.mWordList = mWordList;
//    }
//    @Override
//    public int getItemCount() {
//        return mWordList.size();
//    }
//    @Override
//    public WordListAdapter.WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View mItemView = mInflater.inflate(R.layout.wordlist_item, parent, false);
//
//        return new WordViewHolder(mItemView, this);
//
//    }
//
//    class WordViewHolder extends RecyclerView.ViewHolder{
//        public final TextView wordItemView;
//        final WordListAdapter mAdapter;
//
//        public WordViewHolder(View itemView, WordListAdapter adapter) {
//            super(itemView);
//            wordItemView = (TextView) itemView.findViewById(R.id.word);
//            this.mAdapter = adapter;
//        }
//    }
//
//    public void onBindViewHolder(WordListAdapter.WordViewHolder holder, int position) {
//        String mCurrent = mWordList.get(position);
//        holder.wordItemView.setText(mCurrent);
//    }
//
//}