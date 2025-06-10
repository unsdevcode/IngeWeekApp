package com.uns.ingeweekapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.uns.ingeweekapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
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

        val adapter = EventAdapter(events)
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}