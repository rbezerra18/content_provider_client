package jr.roberto.contentproviderclient

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    lateinit var notesRecycler: RecyclerView
    lateinit var noteRefreshButton: FloatingActionButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notesRecycler = findViewById(R.id.client_list)
        noteRefreshButton = findViewById(R.id.client_btn_refresh)

        noteRefreshButton.setOnClickListener {  }
    }
}