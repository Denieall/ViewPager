package com.denieall.viewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.app.Fragment;
import android.widget.Toast;

public class Section1Fragment extends Fragment {

    private String title;
    private int image;

    // Acts like constructor method for Section1Fragment
    public static Section1Fragment newInstance(String t, int i) {

        Section1Fragment fragment = new Section1Fragment();

        Bundle b = new Bundle();
        b.putString("title", t);
        b.putInt("image", i);
        fragment.setArguments(b);

        return fragment;

    }

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        image = getArguments().getInt("image", 0);
        title = getArguments().getString("title");



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_section_1, container, false);

        final TextView txtMain = view.findViewById(R.id.main_tv);
        txtMain.setText(title);

        ImageView imgMain = view.findViewById(R.id.main_imageView);
        imgMain.setImageResource(image);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), txtMain.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        return view;

    }
}
