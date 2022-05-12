package com.example.sankalan.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.sankalan.R
import com.example.sankalan.databinding.ActivityAdminBinding
import com.example.sankalan.model.AdminViewModel


lateinit var binding:ActivityAdminBinding
lateinit var adminViewModel:AdminViewModel
class AdminActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        binding = ActivityAdminBinding.inflate(layoutInflater)
        adminViewModel = ViewModelProvider(this).get(AdminViewModel::class.java)
        setContentView(binding.root)
        setSupportActionBar(binding.adminToolbar) //Ignore this Error
        binding.adminToolbar.title = "Admin"
        binding.adminToolbar.setTitleTextColor(getColor(R.color.white))
        val navHost =
            supportFragmentManager.findFragmentById(R.id.admin_fragment_container) as NavHostFragment
        val navControl = navHost.navController
        binding.adminBottom.setupWithNavController(navControl)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.action_logout) {
            Thread(Runnable {
                adminViewModel.logout()

            })
            startActivity(Intent(this, LoginActivity::class.java))
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}