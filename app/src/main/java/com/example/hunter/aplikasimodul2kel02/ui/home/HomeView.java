package com.example.hunter.aplikasimodul2kel02.ui.home;

import com.example.hunter.aplikasimodul2kel02.data.model.DataCar;

import java.util.List;

public interface HomeView {
    void successShowCar(List<DataCar> dataCars);
    void failedShowCar(String message);
}
