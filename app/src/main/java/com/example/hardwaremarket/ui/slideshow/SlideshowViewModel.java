package com.example.hardwaremarket.ui.slideshow;

import android.os.Bundle;
import android.widget.Button;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.hardwaremarket.R;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;


    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }




}