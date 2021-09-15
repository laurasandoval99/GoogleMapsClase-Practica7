package com.example.googlemapsclase

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.googlemapsclase.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

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



        mMap.mapType= GoogleMap.MAP_TYPE_NORMAL


        val crepesFlorida=LatLng(6.2704716, -75.5787773)
        mMap.addMarker(
            MarkerOptions()
                .position(crepesFlorida)
                .title("Marker in Crepes and Waffles, Centro comercial florida")
                .snippet("Crepes and Waffles, Centro comercial Florida"))


        val crepesSanNicolas=LatLng(6.217503, -75.598726)
        mMap.addMarker(
            MarkerOptions()
                .position(crepesSanNicolas)
                .title("Marker in Crepes and Waffles, Granvia")
                .snippet("Crepes and Waffles, Gran Vía"))


        val crepesLaureles = LatLng(6.246065, -75.590444)
        mMap.addMarker(
            MarkerOptions()
                .position(crepesLaureles)
                .title("Marker in Crepes and Waffles, Laureles")
                .snippet("Crepes and Waffles, Laureles"))


        val crepesUnicentro=LatLng(6.240828, -75.586871)
        mMap.addMarker(
            MarkerOptions()
                .position(crepesUnicentro)
                .title("Marker in Crepes and Waffles, Centro Comercial unicentro")
                .snippet("Crepes and Waffles, Unicentro"))


        val crepesLosMolinos=LatLng(6.232744, -75.603865)
        mMap.addMarker(
            MarkerOptions()
                .position(crepesLosMolinos)
                .title("Marker in Crepes and Waffles, Centro Comercial Los Molinos")
                .snippet("Crepes and Waffles, Los Molinos"))

        val crepesArkadia=LatLng(6.211925, -75.594660)
        mMap.addMarker(
            MarkerOptions()
                .position(crepesArkadia)
                .title("Marker in Crepes and Waffles, Centro Comercial Arkadia")
                .snippet("Crepes and Waffles, Arkadia"))

        val crepesSanDiego=LatLng(6.235826, -75.568750)
        mMap.addMarker(
            MarkerOptions()
                .position(crepesSanDiego)
                .title("Marker in Crepes and Waffles, Centro Comercial San Diego")
                .snippet("Crepes and Waffles, San Diego"))

        val crepesPremiumPlaza=LatLng(6.229534, -75.570402)
        mMap.addMarker(
            MarkerOptions()
                .position(crepesPremiumPlaza)
                .title("Marker in Crepes and Waffles, Centro Comercial Premium Plaza")
                .snippet("Crepes and Waffles, Premium Plaza"))

        val crepesCiudadRio=LatLng(6.223668, -75.574222)
        mMap.addMarker(
            MarkerOptions()
                .position(crepesCiudadRio)
                .title("Marker in Crepes and Waffles, Ciudad Río")
                .snippet("Crepes and Waffles, Ciudad del Río"))

        val crepesPalma =LatLng(6.217375, -75.564930)
        mMap.addMarker(
            MarkerOptions()
                .position(crepesPalma)
                .title("Marker in Crepes and Waffles, Mall Palma Grande")
                .snippet("Crepes and Waffles, Mall Palma Grande"))

        val crepesSantafe =LatLng(6.1967, -75.5739)
        mMap.addMarker(
            MarkerOptions()
                .position(crepesSantafe)
                .title("Marker in Crepes and Waffles, CC. Santafe")
                .snippet("Crepes and Waffles, Santafe"))

        val VivaEnvigado =LatLng(6.1764, -75.5917)
        mMap.addMarker(
            MarkerOptions()
                .position(VivaEnvigado)
                .title("Marker in Crepes and Waffles, CC:Viva Envigado")
                .snippet("Crepes and Waffles, Viva Envigado"))


        val crepeMayorca =LatLng(6.161729, -75.605416)
        mMap.addMarker(
            MarkerOptions()
                .position(crepeMayorca)
                .title("Marker in Crepes and Waffles, Centro Comercial Mayorca")
                .snippet("Crepes and Waffles, Mayorca"))

        val crepesOviedo =LatLng(6.199, -75.575)
        mMap.addMarker(
            MarkerOptions()
                .position(crepesOviedo)
                .title("Marker in Crepes and Waffles, Centro Comercial Oviedo")
                .snippet("Crepes and Waffles, Oviedo\""))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(crepesUnicentro,13F))

        val crepesTesoro =LatLng(6.1973, -75.5592)
        mMap.addMarker(
            MarkerOptions()
                .position(crepesTesoro)
                .title("Marker in Crepes and Waffles, Centro Comercial El Tesoro")
                .snippet("Crepes and Waffles, El Tesoro\""))





        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            Toast.makeText(this, "No tiene permisos de localización, por favor activarlos", Toast.LENGTH_SHORT)
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return
        }
        mMap.isMyLocationEnabled = true
    }
}