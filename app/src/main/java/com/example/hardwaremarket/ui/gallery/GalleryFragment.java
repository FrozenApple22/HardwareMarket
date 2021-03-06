package com.example.hardwaremarket.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.hardwaremarket.R;
import com.example.hardwaremarket.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private Button mUploadbtn;

    /* private GalleryViewModel galleryViewModel; */
    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        mUploadbtn = (Button) getView().findViewById(R.id.btn);




        /* galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class); */

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
/*
        final TextView textView = binding.textGallery;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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