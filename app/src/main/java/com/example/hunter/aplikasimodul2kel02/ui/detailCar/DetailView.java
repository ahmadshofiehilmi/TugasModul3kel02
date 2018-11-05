package com.example.hunter.aplikasimodul2kel02.ui.detailCar;

import com.example.hunter.aplikasimodul2kel02.data.model.DataCar;

import java.util.List;

public interface DetailView {
    void showErrorCarById(String message);

    void showSuccessCarById(List<DataCar> dataCar);
}