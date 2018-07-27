package com.denieall.viewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Section2Fragment extends Fragment {

    private String title;
    private int imageMain;
    private int imageSecondary;

    public interface Section2ClickListener {
        void changeFragment2();
    }


    public static Section2Fragment newInstance(String t, int image1, int image2) {

        Section2Fragment fragment = new Section2Fragment();

        Bundle args = new Bundle();
        args.putInt("image1", image1);
        args.putInt("image2", image2);
        args.putString("title", t);
        fragment.setArguments(args);

        return fragment;

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        imageMain = getArguments().getInt("image1", 0);
        imageSecondary = getArguments().getInt("image2", 0);
        title = getArguments().getString("title");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_section_2, container, false);

        final TextView tvLabel = view.findViewById(R.id.main2_tv);
        tvLabel.setText(title);

        ImageView imageView = view.findViewById(R.id.main2_imageView1);
        imageView.setImageResource(imageMain);

        ImageView imageViewSecondary = view.findViewById(R.id.main2_imageView2);
        imageViewSecondary.setImageResource(imageSecondary);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), tvLabel.getText().toString(), Toast.LENGTH_SHORT).show();

                MainActivity ma = (MainActivity) getActivity();
                ma.changeFragment2();
            }
        });

        return view;

    }

}
