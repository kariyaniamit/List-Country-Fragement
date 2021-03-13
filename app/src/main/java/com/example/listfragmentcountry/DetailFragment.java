package com.example.listfragmentcountry;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailFragment extends Fragment {
    ImageView imageView;
    TextView textView;
    String name;
    int pos;
    public Integer[] countriesImgs = {
            R.drawable.argentina,
            R.drawable.aus,
            R.drawable.banglades,
            R.drawable.bhutan,
            R.drawable.eng,
            R.drawable.in,
            R.drawable.pk,
    };
    public DetailFragment() {
        // Required empty public constructor

    }
    public DetailFragment(String name,int pos) {
        this.name=name;
        this.pos=pos;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        imageView=(ImageView)view.findViewById(R.id.imageView);
        textView=(TextView)view.findViewById(R.id.name);
        textView.setText(name);
        imageView.setImageResource(countriesImgs[pos]);

        return view;
    }
}