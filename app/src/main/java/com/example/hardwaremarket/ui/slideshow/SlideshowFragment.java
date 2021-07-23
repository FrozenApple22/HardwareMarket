package com.example.hardwaremarket.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.hardwaremarket.R;
import com.example.hardwaremarket.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {

    private Button mUploadbtn;
    private static final int GALLERY_INTENT = 1;

    /* private SlideshowViewModel slideshowViewModel; */
    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {



        mUploadbtn = (Button) getView().findViewById(R.id.btnSubir1);

        mUploadbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent,GALLERY_INTENT);

            }
        });


        /* slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class); */

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
/*
        final TextView textView = binding.textSlideshow;
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        }); */
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}