package com.example.john.guiadomochileiro;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Mapa extends SupportMapFragment implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng parquedacidade = new LatLng(-15.8003432, -47.9078002);
        mMap.addMarker(new MarkerOptions().position(parquedacidade).title("Parque da Cidade"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(parquedacidade));

        LatLng Parquedeaguasclaras = new LatLng(-15.8328589, -48.0347145);
        mMap.addMarker(new MarkerOptions().position(Parquedeaguasclaras).title("Parque de Águas Claras"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Parquedeaguasclaras));

        LatLng Parquedocortado = new LatLng(-15.8170468, -48.0809233);
        mMap.addMarker(new MarkerOptions().position(Parquedocortado).title("Parque do Cortado"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Parquedocortado));

    }
}
