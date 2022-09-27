package com.example.daggerstudy

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.daggerstudy.beans.User
import com.example.daggerstudy.databinding.FragmentSecondBinding
import com.example.daggerstudy.di.DaggerApplicationComponent
import com.example.daggerstudy.modules.DatabaseObject
import com.example.daggerstudy.modules.HttpObject
import com.example.daggerstudy.modules.ProvisioningManager
import timber.log.Timber
import javax.inject.Inject

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    @Inject
    lateinit var user: User

    @Inject
    lateinit var databaseObject1: DatabaseObject

    @Inject
    lateinit var databaseObject2: DatabaseObject

    @Inject
    lateinit var httpObject: HttpObject

    @Inject
    lateinit var httpObject2: HttpObject

    @Inject
    lateinit var provisioningManager: ProvisioningManager

    @Inject
    lateinit var provisioningManager2: ProvisioningManager

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            Timber.i(" binding.buttonSecond.setOnClickListener")
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }

        DaggerApplicationComponent.create().inject(this)

        Log.i("MainActivity", "  MainActivityGT $user")
        Log.i("MainActivity", "  MainActivityGT $databaseObject1")
        Log.i("MainActivity", "  MainActivityGT $databaseObject2")
        Log.i("MainActivity", "  MainActivityGT $httpObject")
        Log.i("MainActivity", "  MainActivityGT $httpObject2")

        Log.i("MainActivity", "  MainActivityGT $provisioningManager")
        Log.i("MainActivity", "  MainActivityGT $provisioningManager2")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}