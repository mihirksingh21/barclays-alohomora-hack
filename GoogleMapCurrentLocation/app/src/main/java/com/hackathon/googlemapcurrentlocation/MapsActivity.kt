package com.hackathon.googlemapcurrentlocation

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions


class MapsActivity : AppCompatActivity(), OnMapReadyCallback,GoogleMap.OnMarkerClickListener{


    private lateinit var mMap: GoogleMap

    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient

    companion object{
        private const val LOCATION_REQUEST_CODE = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        val button = findViewById<Button>(R.id.btn1)

        button.setOnClickListener {

            val intent = Intent(this, bankactivity::class.java)

            startActivity(intent)
        }
        val button1 = findViewById<Button>(R.id.btn2)

        button1.setOnClickListener {

            val intent = Intent(this, mallactivity::class.java)

            startActivity(intent)
        }
        val button3 = findViewById<Button>(R.id.btn3)

        button3.setOnClickListener {

            val intent = Intent(this, shopactivity::class.java)

            startActivity(intent)
        }
        val button4 = findViewById<Button>(R.id.btn4)

        button4.setOnClickListener {

            val intent = Intent(this, atmactivity::class.java)

            startActivity(intent)
        }
        val button5 = findViewById<Button>(R.id.btn5)

        button5.setOnClickListener {

            val intent = Intent(this, healthactivity::class.java)

            startActivity(intent)
        }



        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        mMap.uiSettings.isZoomControlsEnabled=true
        mMap.setOnMarkerClickListener(this)
        setUpMap()

    }

    private fun setUpMap() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
            != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                LOCATION_REQUEST_CODE)

            return
        }
        mMap.isMyLocationEnabled=true
        fusedLocationProviderClient.lastLocation.addOnSuccessListener(this) {location ->
            if (location !=null){
                val currentLatLong= LatLng(location.latitude, location.longitude)
                placeMarkerOnMap(currentLatLong)
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLatLong,18f))
            }
        }
    }

    private fun placeMarkerOnMap(currentLatLong: LatLng) {

        val markerOptions = MarkerOptions().position(currentLatLong)
        markerOptions.title("$currentLatLong")
        mMap.addMarker(markerOptions)

    }

    //override fun onMarkerClick(p0: Marker?) = false
    override fun onMarkerClick(p0: Marker): Boolean {
        TODO("Not yet implemented")
    }
}