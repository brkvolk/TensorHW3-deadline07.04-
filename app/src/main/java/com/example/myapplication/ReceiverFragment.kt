package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class ReceiverFragment : Fragment() {

    private lateinit var textView: TextView

    companion object {
        private const val MESSAGE_KEY = "MESSAGE_KEY"
        fun newInstance(textMessage: String): Fragment =
            ReceiverFragment().apply {
                val bundle = Bundle()
                bundle.putString(MESSAGE_KEY, textMessage)
                arguments = bundle
            }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View =
        inflater.inflate(R.layout.receiver_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView = view.findViewById<TextView>(R.id.textMessage_received)
        val vm = ViewModelProvider(this).get(MainViewModel::class.java)//

        arguments?.getString(
            MESSAGE_KEY,
            null
        )?.let { text ->
            vm.setText(text)
        }

        view.findViewById<Button>(R.id.read_button).setOnClickListener {
            vm.setText("All messages is read")
        }

        vm.messageLiveData.observe(this.viewLifecycleOwner) { text ->
            textView.text = text
        }
    }
}