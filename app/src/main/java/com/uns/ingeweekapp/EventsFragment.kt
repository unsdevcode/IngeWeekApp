package com.uns.ingeweekapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.uns.ingeweekapp.databinding.FragmentEventsBinding
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

class EventsFragment : Fragment() {
    private var _binding: FragmentEventsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEventsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val events = listOf(
            Event("02-06-25", "09:00", "Plazuela UNS", "Ceremonia de Inauguración", "Autoridades UNS", "Todas"),
            Event("03-06-25", "08:00", "Auditorio EPIE", "Hidrolisis marinos – vía enzimática", "Gabriel Sifuentes Penagos", "Agroindustrial"),
            Event("03-06-25", "08:45", "Auditorio EPIE", "NutriAvo: Agroindustria con propósito", "Mirian Vásquez Chuquizuta", "Agroindustrial"),
            Event("04-06-25", "09:00", "Auditorio EPIE", "Agrovoltaica", "Dr. Denis Arangurí Cayetano", "Energía"),
            Event("04-06-25", "10:00", "Auditorio EPIE", "Técnicas nucleares para detección de Radón", "Carlos Montañez Montenegro", "Energía"),
            Event("05-06-25", "09:00", "Capilla UNS", "Misa de Celebración", "Delegaciones", "Todas"),
            Event("05-06-25", "10:00", "Auditorio Energía", "Ceremonia Central por la Semana", "Autoridades", "Todas"),
            Event("06-06-25", "09:00", "Complejo Deportivo UNS", "Campeonato Interescuelas", "Delegaciones", "Todas")
        )

        val formatter = DateTimeFormatter.ofPattern("dd-MM-yy")
        val groups = events.groupBy {
            val date = LocalDate.parse(it.day, formatter)
            date.dayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, Locale("es"))
        }

        val days = listOf("lunes", "martes", "miércoles", "jueves", "viernes")
        val fragments = days.map { day ->
            DayEventsFragment.newInstance(ArrayList(groups[day] ?: emptyList()))
        }

        val adapter = EventsPagerAdapter(this, fragments)
        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = days[position].replaceFirstChar { it.titlecase(Locale("es")) }
        }.attach()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
