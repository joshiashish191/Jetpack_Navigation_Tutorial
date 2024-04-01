package net.softglobe.jetpacknavigationtutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class DashboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)
        val userName = arguments?.getString("customKey")

        view.findViewById<TextView>(R.id.user_name).text = userName

        view.findViewById<Button>(R.id.btn_logout).setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment_to_loginFragment)
        }
        return view
    }

}