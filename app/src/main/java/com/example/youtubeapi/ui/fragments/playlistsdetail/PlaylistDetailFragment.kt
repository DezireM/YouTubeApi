package com.example.youtubeapi.ui.fragments.playlistsdetail


import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.youtubeapi.databinding.FragmentPlaylistsDetailBinding
import com.example.youtubeapi.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class PlaylistDetailFragment :
    BaseFragment<FragmentPlaylistsDetailBinding>(FragmentPlaylistsDetailBinding::inflate) {

    private val viewModel by viewModel<PlaylistDetailViewModel>()
    private val playlistAdapter: PlaylistDetailAdapter by lazy { PlaylistDetailAdapter() }

    override fun getArgs() {
        val videoId = arguments?.getString("ID") ?: return
        viewModel.getPlaylistDetail(videoId)
    }

    override fun initViews() {
        super.initViews()
        setupRecyclerView()
    }

    override fun setUpClickListeners() {
        super.setUpClickListeners()
        binding.imgBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }

    override fun setupObservers() {
        super.setupObservers()
        viewModel.playlistVideo.handleResource(
            onSuccess = { data ->
                if (data != null) {
                    playlistAdapter.submitList(data.items)
                }
                if (data != null) {
                    if (data.items.isNotEmpty()) {
                        val item = data.items[0]
                        binding.title.text = item.snippet.title
                        binding.description.text = item.snippet.description
                        binding.videoCount.text = "${data.items.size} video series"
                    }
                }
            },
            isLoading = { visibility ->
                binding.progressbar.isVisible = visibility
            }
        )
    }

    private fun setupRecyclerView() = with(binding.rvPlaylistDetail) {
        layoutManager = LinearLayoutManager(context)
        adapter = playlistAdapter
    }
}