package net.softglobe.jetpacknavigationtutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        view.findViewById<Button>(R.id.btn_login).setOnClickListener {
            val bundle = Bundle()
            bundle.putString("customKey", "Ashish")
            findNavController().navigate(R.id.action_loginFragment_to_dashboardFragment, bundle)
        }

        view.findViewById<TextView>(R.id.txt_sign_up).setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registrationFragment)
        }
        return view
    }

}