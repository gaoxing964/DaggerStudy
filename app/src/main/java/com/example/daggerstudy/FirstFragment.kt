package com.example.daggerstudy

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.daggerstudy.beans.User
import com.example.daggerstudy.databinding.FragmentFirstBinding
import com.example.daggerstudy.di.DaggerApplicationComponent
import com.example.daggerstudy.modules.DatabaseObject
import com.example.daggerstudy.modules.HttpObject
import com.example.daggerstudy.modules.ProvisioningManager
import javax.inject.Inject

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

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

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
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