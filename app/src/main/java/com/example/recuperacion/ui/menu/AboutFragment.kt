package com.example.taquillamirandilla.about

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.example.recuperacion.R
import com.example.recuperacion.databinding.FragmentAboutBinding
import com.example.recuperacion.ui.menu.AboutViewModel


class aboutFragment : Fragment() {


    private var viewModel: AboutViewModel? = null

    private lateinit var binding: FragmentAboutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_about,
            container,
            false
        )

        // Allows Data Binding to Observe LiveData with the lifecycle of this Fragment
        binding.lifecycleOwner = this

        binding.viewModel = viewModel

        Glide.with(requireContext()).load("https://previews.123rf.com/images/petrnutil/petrnutil1605/petrnutil160500090/57365408-%E5%8A%A9%E3%81%91%E3%81%8C%E5%BF%85%E8%A6%81%E3%81%A7%E3%81%99%E3%81%8B%E3%80%82-%E7%96%91%E5%95%8F%E7%AC%A6%E3%82%A2%E3%82%A4%E3%82%B3%E3%83%B3-%E9%9F%B3%E5%A3%B0%E3%83%90%E3%83%96%E3%83%AB-%E3%83%99%E3%82%AF%E3%83%88%E3%83%AB%E9%9D%92.jpg?fj=1").into(binding.rulesImage)

        // Giving the binding access to the OverviewViewModel

        return binding.root//inflater.inflate(R.layout.fragment_about, container, false)
    }


}