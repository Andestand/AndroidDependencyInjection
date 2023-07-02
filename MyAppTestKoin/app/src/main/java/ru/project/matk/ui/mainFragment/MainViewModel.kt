package ru.project.matk.ui.mainFragment

import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.ListFragment
import androidx.lifecycle.ViewModel
import com.google.android.material.bottomnavigation.BottomNavigationView
import ru.project.matk.R
import ru.project.matk.ui.create.CreateFragment

class MainViewModel : ViewModel() {

    fun bottomNavigation(
        bottomNavigationView: BottomNavigationView,
        supportFragmentManager: FragmentManager,
        fragmentContainerView: FragmentContainerView
    ) {
        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.list -> {
                    supportFragmentManager.beginTransaction()
                        .replace(fragmentContainerView.id, ListFragment()).commit()
                }
                R.id.create -> {
                    supportFragmentManager.beginTransaction()
                        .replace(fragmentContainerView.id, CreateFragment()).commit()
                }
            }
            true
        }
    }
}