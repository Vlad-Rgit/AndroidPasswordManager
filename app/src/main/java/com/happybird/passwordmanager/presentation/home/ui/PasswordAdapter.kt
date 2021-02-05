package com.happybird.passwordmanager.presentation.home.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.happybird.passwordmanager.databinding.ItemHomePasswordBinding
import com.happybird.passwordmanager.domain.models.Password

class PasswordAdapter(context: Context)
    : RecyclerView.Adapter<PasswordAdapter.PasswordViewHolder>() {

    private var items: List<Password> = emptyList()
    private val inflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PasswordViewHolder {

        val binding = ItemHomePasswordBinding.inflate(
            inflater,
            parent,
            false
        )

        return PasswordViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PasswordViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class PasswordViewHolder
        (private val binding: ItemHomePasswordBinding)
        : RecyclerView.ViewHolder(binding.root) {

        fun bind(password: Password) {

        }
    }

}