package com.uns.ingeweekapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.uns.ingeweekapp.databinding.FragmentDayEventsBinding

class DayEventsFragment : Fragment() {
    private var _binding: FragmentDayEventsBinding? = null
    private val binding get() = _binding!!

    private val events: List<Event>
        get() = requireArguments().getSerializable(ARG_EVENTS) as ArrayList<Event>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDayEventsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = EventAdapter(events)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        private const val ARG_EVENTS = "events"

        fun newInstance(events: ArrayList<Event>): DayEventsFragment {
            val fragment = DayEventsFragment()
            val args = Bundle()
            args.putSerializable(ARG_EVENTS, events)
            fragment.arguments = args
            return fragment
        }
    }
}
