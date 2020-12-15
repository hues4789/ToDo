package com.memorytodo.todo

import android.os.Bundle
import android.widget.Toolbar
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.google.android.material.navigation.NavigationView
import com.memorytodo.todo.ui.main.View.SectionsPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ナビゲーションホスト取得
        val navHostFragment: NavHostFragment = supportFragmentManager.findFragmentById(R.id.my_nav_host) as NavHostFragment
        //ナビゲーションコントローラ取得
        val navController = navHostFragment.navController

        //アップバーのコンフィグをビルド
        val appBarConfiguration = AppBarConfiguration.Builder(navController.graph).setOpenableLayout(
            findViewById<DrawerLayout>(R.id.drawer_layout)
        ).build()

        //ナビゲーションUIをツールバーにセットアップ
        NavigationUI.setupWithNavController(my_tool_bar,navController,appBarConfiguration)

        val navigationView : NavigationView = findViewById<NavigationView>(R.id.my_nav_view)
        NavigationUI.setupWithNavController(navigationView,navController)

    }
}