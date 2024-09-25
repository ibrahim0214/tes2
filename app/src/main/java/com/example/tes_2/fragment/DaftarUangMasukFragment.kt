package com.example.tes_2.fragment

class DaftarUangMasukFragment : Fragment() {

        private lateinit var uangMasukViewModel: UangMasukViewModel
        private lateinit var adapter: UangMasukAdapter

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val view = inflater.inflate(R.layout.fragment_daftar_uang_masuk, container, false)

            val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)
            adapter = UangMasukAdapter()
            recyclerView.adapter = adapter
            recyclerView.layoutManager = LinearLayoutManager(requireContext())

            uangMasukViewModel = ViewModelProvider(this)[UangMasukViewModel::class.java]
            uangMasukViewModel.getAllUangMasuk.observe(viewLifecycleOwner, { uangMasukList ->
                adapter.submitList(uangMasukList)
            })

            view.findViewById<FloatingActionButton>(R.id.fab_add).setOnClickListener {
                findNavController().navigate(R.id.action_daftarUangMasukFragment_to_addEditUangMasukFragment)
            }

            return view
        }
    }

