package com.gsoft.listaexampleclasica.listAdapters

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.gsoft.listaexampleclasica.R
import com.gsoft.listaexampleclasica.models.PersonajesModel


class PersonajesListAdapter(
    val activity: Activity,
    val list: List<PersonajesModel>
):ArrayAdapter<PersonajesModel>(activity, R.layout.list_item)
{
    override fun getCount(): Int {
        return list.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val contexs = activity.layoutInflater
        val rowView = contexs.inflate(R.layout.list_item,null)

        val images = rowView.findViewById<ImageView>(R.id.images)
        val nombre = rowView.findViewById<TextView>(R.id.title)
        val house = rowView.findViewById<TextView>(R.id.desc)

        images.setImageResource(list[position].image)
        nombre.text=list[position].name
        house.text=list[position].house

        return rowView
    }

}