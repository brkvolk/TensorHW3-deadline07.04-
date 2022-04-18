package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class SenderFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.sender_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.send_button).setOnClickListener {
            val receiverFragment = ReceiverFragment.newInstance("Hello!")
            parentFragmentManager.beginTransaction()
                .add(R.id.fragment_container_view, receiverFragment)
                .addToBackStack(null)
                .commit()
        }

    }
}