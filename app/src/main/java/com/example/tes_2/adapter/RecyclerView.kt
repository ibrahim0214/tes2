package com.example.tes_2.adapter

class RecyclerView {
    class UangMasukAdapter : ListAdapter<UangMasuk, UangMasukAdapter.UangMasukViewHolder>(DIFF_CALLBACK) {

        companion object {
            private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<UangMasuk>() {
                override fun areItemsTheSame(oldItem: UangMasuk, newItem: UangMasuk): Boolean {
                    return oldItem.id == newItem.id
                }

                override fun areContentsTheSame(oldItem: UangMasuk, newItem: UangMasuk): Boolean {
                    return oldItem == newItem
                }
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UangMasukViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_uang_masuk, parent, false)
            return UangMasukViewHolder(view)
        }

        override fun onBindViewHolder(holder: UangMasukViewHolder, position: Int) {
            val uangMasuk = getItem(position)
            holder.bind(uangMasuk)
        }

        inner class UangMasukViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            fun bind(uangMasuk: UangMasuk) {
                itemView.findViewById<TextView>(R.id.tv_nominal).text = uangMasuk.nominal.toString()
                itemView.findViewById<TextView>(R.id.tv_keterangan).text = uangMasuk.keterangan
            }
        }
    }

}