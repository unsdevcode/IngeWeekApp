package com.uns.ingeweekapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uns.ingeweekapp.databinding.ItemEventBinding

class EventAdapter(private val events: List<Event>) : RecyclerView.Adapter<EventAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: ItemEventBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemEventBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val event = events[position]
        with(holder.binding) {
            textViewTopic.text = event.topic
            textViewSpeaker.text = "Ponente: ${event.speaker}"
            textViewHour.text = "Hora: ${event.hour}"
            textViewLocation.text = "Lugar: ${event.location}"
        }
    }

    override fun getItemCount() = events.size
}
