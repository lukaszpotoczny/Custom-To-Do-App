package com.example.to_doapp.ui.tasks

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.to_doapp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TasksFragment : Fragment(R.layout.tasks_fragment) {

    private val viewModel: TasksViewModel by viewModels()
}