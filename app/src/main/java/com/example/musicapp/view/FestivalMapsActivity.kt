package com.example.musicapp.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.musicapp.R
import com.example.musicapp.model.Festivales
import com.example.musicapp.model.UbiMapFestival

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class FestivalMapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var festivalmapa: Festivales

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_festival_maps)

        festivalmapa = intent.getSerializableExtra("festivalmapa") as Festivales

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
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
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        //val sydney = LatLng(-34.0, 151.0)
        //val sydney = LatLng(festivalmapa.latitud.toDouble(), festivalmapa.longitud.toDouble()) //coordenadas del objeto
        val sydney = LatLng(festivalmapa.latitud.toDouble(), festivalmapa.longitud.toDouble())
        mMap.addMarker(MarkerOptions().position(sydney).title("Fiessssta"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
    }
}
