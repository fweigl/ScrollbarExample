package com.example.scrollbarthrowaway

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView

class MyAdapter(private val inflater: LayoutInflater) : RecyclerView.Adapter<MyViewHolder>() {

    var items = listOf<ListItem>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        val v = inflater.inflate(R.layout.item, null)
        val vh = MyViewHolder(v)
        return vh
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.tv.text = items[position].height.toString()

        val lp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, items[position].height)

        holder.itemView.layoutParams = lp

    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {

    val tv: TextView = v.findViewById<TextView>(R.id.tv)

}

data class ListItem(val height: Int = 0)