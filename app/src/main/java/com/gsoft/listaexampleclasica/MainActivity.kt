package com.gsoft.listaexampleclasica


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.gsoft.listaexampleclasica.listAdapters.PersonajesListAdapter
import com.gsoft.listaexampleclasica.models.PersonajesModel


class MainActivity : AppCompatActivity() {
    lateinit var personajesListAdapter: PersonajesListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = mutableListOf<PersonajesModel>()

        list.add(PersonajesModel(R.drawable.jonsnow, "Jon Snow", "Stark"))
        list.add(PersonajesModel(R.drawable.arya, "Arya Stark", "Stark"))
        list.add(PersonajesModel(R.drawable.sansa, "Sansa Stark", "Stark"))
        list.add(PersonajesModel(R.drawable.dany, "Daennerys Targeryen", "Targaryen"))
        list.add(PersonajesModel(R.drawable.tiryon2, "Tyrion Lannister", "Lannister"))
        list.add(PersonajesModel(R.drawable.jaime, "Jaime Lannister", "Lannister"))
        list.add(PersonajesModel(R.drawable.hound, "Sandor Clegane", "Clegane"))
        list.add(PersonajesModel(R.drawable.drogo, "Khal Drogo", "none"))

        personajesListAdapter = PersonajesListAdapter(this, list)
        val listView = findViewById<ListView>(R.id.list)

        listView.adapter = personajesListAdapter







    }
}